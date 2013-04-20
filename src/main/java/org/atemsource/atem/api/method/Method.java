package org.atemsource.atem.api.method;

import java.lang.reflect.InvocationTargetException;

import org.atemsource.atem.api.type.EntityType;
import org.atemsource.atem.api.type.Type;

public interface Method {
	public ParameterType getParameterType();

	public Object invoke(Object target, Object[] param) throws IllegalAccessException, IllegalArgumentException,
			InvocationTargetException;

	public Type<?> getReturnType();

	public EntityType<?> getEntityType();
	
	public java.lang.reflect.Method getJavaMethod();
	
	public String getCode();

}
