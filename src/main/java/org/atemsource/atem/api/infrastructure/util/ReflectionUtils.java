/*******************************************************************************
 * Stefan Meyer, 2012 Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 ******************************************************************************/
package org.atemsource.atem.api.infrastructure.util;

import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class ReflectionUtils
{

	private static void addInterfaces(Class genericClass, List<Type> genericClasses, final Type[] genericSuperInterfaces)
	{
		for (Type genericSuperInterface : genericSuperInterfaces)
		{
			if (genericSuperInterface instanceof ParameterizedType
				&& genericClass.isAssignableFrom((Class) ((ParameterizedType) genericSuperInterface).getRawType()))
			{
				genericClasses.add(genericSuperInterface);
			}
		}
	}

	public static int compareByCommonHierachy(Class exceptionType1, Class exceptionType2)
	{
		if (exceptionType1 == exceptionType2)
		{
			return 0;
		}
		int compare = exceptionType1.isAssignableFrom(exceptionType2) ? 1 : 0;
		if (compare == 0)
		{
			compare = exceptionType2.isAssignableFrom(exceptionType1) ? -1 : 0;
		}
		return compare;
	}

	@SuppressWarnings("unchecked")
	public static Class getActualTypeParameter(Class implmentingGenericClass, Class genericClass)
	{
		final TypeVariable[] typeParameters = genericClass.getTypeParameters();
		if (typeParameters.length != 1)
		{
			throw new IllegalArgumentException("Only one type parameter allowed");
		}
		return getActualTypeParameters(implmentingGenericClass, genericClass)[0];
	}

	@SuppressWarnings("unchecked")
	public static Class[] getActualTypeParameters(Class implmentingGenericClass, Class genericClass)
	{
		List<Class> classes = new ArrayList<Class>();
		final TypeVariable[] typeParameters = genericClass.getTypeParameters();

		List<Type> genericClasses = new ArrayList<Type>();
		Class currentClass = implmentingGenericClass;
		do
		{
			final Type[] genericInterfaces = currentClass.getGenericInterfaces();
			for (Class interfaze : getSubInterfaces(currentClass))
			{
				if (genericClass.isAssignableFrom(interfaze))
				{
					final Type[] genericSuperInterfaces = interfaze.getGenericInterfaces();
					addInterfaces(genericClass, genericClasses, genericSuperInterfaces);
				}
			}
			addInterfaces(genericClass, genericClasses, genericInterfaces);
			if (currentClass.getGenericSuperclass() != null
				&& currentClass.getGenericSuperclass() instanceof ParameterizedType
				&& genericClass.isAssignableFrom((Class) ((ParameterizedType) currentClass.getGenericSuperclass())
					.getRawType()))
			{
				genericClasses.add(currentClass.getGenericSuperclass());
			}
			currentClass = currentClass.getSuperclass();
		}
		while (currentClass != null);

		int parameterIndex = 0;
		for (TypeVariable parameterVariable : typeParameters)
		{
			TypeVariable relevantVariable = parameterVariable;
			int currentParameterIndex = parameterIndex;
			parameterIndex++;
			for (Type candidate : genericClasses)
			{
				if (candidate instanceof ParameterizedType)
				{
					ParameterizedType parameterizedType = (ParameterizedType) candidate;

					int variableIndex = 0;
					for (TypeVariable variable : ((Class) parameterizedType.getRawType()).getTypeParameters())
					{

						// FIXME this is wrong. type variable might be renamed in intermediate classes
						if (variable.getName().equals(relevantVariable.getName()))
						{
							Type type = parameterizedType.getActualTypeArguments()[variableIndex];
							if (type instanceof Class)
							{
								classes.add((Class) type);
							}
							else if (type instanceof GenericArrayType)
							{
								GenericArrayType genericArrayType = (GenericArrayType) type;
								Class<?> arrayType =
									Array.newInstance((Class<?>) genericArrayType.getGenericComponentType(), 0).getClass();
								classes.add(arrayType);
							}
							else if (type instanceof TypeVariable)
							{
								relevantVariable = (TypeVariable) type;
							}
							else if (type instanceof ParameterizedType)
							{
								classes.add((Class) ((ParameterizedType) type).getRawType());
							}
						}
						variableIndex++;
					}

				}
			}
		}
		return classes.toArray(new Class[classes.size()]);
	}

	public static Collection<Class<?>> getAllInterfaces(Class<?> clazz)
	{
		Set<Class<?>> interfazes = new HashSet<Class<?>>();
		interfazes.addAll(getSubInterfaces(clazz));
		while (clazz.getSuperclass() != null)
		{
			clazz = clazz.getSuperclass();
			interfazes.addAll(getSubInterfaces(clazz));
		}
		return interfazes;
	}

	public static Collection<Class<?>> getAllInterfacesAndClasses(Class<?> clazz)
	{
		Set<Class<?>> interfazes = new HashSet<Class<?>>();
		interfazes.addAll(getSubInterfaces(clazz));
		interfazes.add(clazz);
		while (clazz.getSuperclass() != null)
		{
			clazz = clazz.getSuperclass();
			interfazes.add(clazz);
			interfazes.addAll(getSubInterfaces(clazz));
		}
		return interfazes;
	}

	@SuppressWarnings("unchecked")
	public static <A extends Annotation> A getAnnotatedAnnotation(Annotation annotation, Class<A> markerAnnotation)
	{
		final Class[] annotationClasses = annotation.getClass().getInterfaces();
		for (Class annotationClass : annotationClasses)
		{

			if (annotationClass.isAnnotationPresent(markerAnnotation))
			{
				return (A) annotationClass.getAnnotation(markerAnnotation);
			}
		}
		return null;
	}

	@SuppressWarnings("unchecked")
	public static <A extends Annotation> A getAnnotatedAnnotation(Class<Annotation> annotationClass,
		Class<A> markerAnnotation)
	{
		if (annotationClass.isAnnotationPresent(markerAnnotation))
		{
			return annotationClass.getAnnotation(markerAnnotation);
		}
		return null;
	}

	@SuppressWarnings("unchecked")
	public static <T extends AccessibleObject & Member> Set<T> getDeclared(Class<?> type, Class<T> accessorType,
		int... modifierFilters)
	{
		int filter = 0;
		for (int modifierFilter : modifierFilters)
		{
			filter |= modifierFilter;
		}

		Set<T> result = new HashSet<T>();
		for (Class<?> subtype = type; subtype != null && subtype != Object.class; subtype = subtype.getSuperclass())
		{
			T[] accessibles;

			if (accessorType.equals(Field.class))
			{
				accessibles = (T[]) subtype.getDeclaredFields();
			}
			else if (accessorType.equals(Method.class))
			{
				accessibles = (T[]) subtype.getDeclaredMethods();
			}
			else if (accessorType.equals(Constructor.class))
			{
				accessibles = (T[]) subtype.getDeclaredConstructors();
			}
			else
			{
				throw new IllegalArgumentException("Unknown accessorType: " + accessorType.getName());
			}

			for (T accessible : accessibles)
			{
				if ((accessible.getModifiers() & filter) != 0)
				{
					continue;
				}

				if (!accessible.isAccessible())
				{
					accessible.setAccessible(true);
				}
				result.add(accessible);
			}
		}
		return result;
	}

	public static Object getField(Object value, String property)
	{
		Field field;
		try
		{
			field = value.getClass().getDeclaredField(property);
			if (!field.isAccessible())
			{
				field.setAccessible(true);
			}
			return field.get(value);
		}
		catch (SecurityException e)
		{
			throw new IllegalArgumentException("cannot get property " + property + " of type "
				+ value.getClass().getSimpleName(), e);
		}
		catch (NoSuchFieldException e)
		{
			throw new IllegalArgumentException("cannot get property " + property + " of type "
				+ value.getClass().getSimpleName(), e);
		}
		catch (IllegalArgumentException e)
		{
			throw new IllegalArgumentException("cannot get property " + property + " of type "
				+ value.getClass().getSimpleName(), e);
		}
		catch (IllegalAccessException e)
		{
			throw new IllegalArgumentException("cannot get property " + property + " of type "
				+ value.getClass().getSimpleName(), e);
		}
	}

	private static Collection<Class<?>> getSubInterfaces(Class<?> clazz)
	{
		Collection<Class<?>> interfaceSet = new HashSet<Class<?>>();
		final Class<?>[] interfaces = clazz.getInterfaces();
		for (Class<?> interfaze : interfaces)
		{
			interfaceSet.addAll(getSubInterfaces(interfaze));
			interfaceSet.add(interfaze);
		}
		return interfaceSet;
	}

	public static boolean isSerializable(Class<?> clazz)
	{
		while (Serializable.class.isAssignableFrom(clazz))
		{
			clazz = clazz.getSuperclass();
			if (clazz == Object.class)
			{
				return true;
			}
		}
		return false;
	}

}
