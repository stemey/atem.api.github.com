/*******************************************************************************
 * Stefan Meyer, 2012
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 ******************************************************************************/
package org.atemsource.atem.api.type;

// TODO: Auto-generated Javadoc
/**
 * Type represents a java class, a java primitive type or a json schema.
 * 
 * @param <J>
 *            the generic type
 * @author Stefan Meyer
 */
public interface Type<J> {
	/**
	 * Get the unique code of he type.
	 * 
	 * @return the code
	 */
	public String getCode();

	/**
	 * Get the java class that this type represents. There may be many types
	 * defined on the same java class.
	 * 
	 * @return the java class
	 */
	public Class<J> getJavaType();

	/**
	 * Check that a type is a subtype of this type.
	 * 
	 * @param type
	 *            the Type to test
	 * @return true type is subclass of this type.
	 */
	public boolean isAssignableFrom(Type<?> type);

	/**
	 * compare two objects that are instances of this type.
	 * 
	 * @param a
	 *            value
	 * @param b
	 *            value
	 * @return rue if the values are equal
	 */
	public boolean isEqual(J a, J b);
	
	public boolean isInstance(Object value);

}
