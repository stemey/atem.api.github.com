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
package org.atemsource.atem.api.attribute;

import java.lang.annotation.Annotation;
import java.util.Collection;

/**
 * The Interface Accessor is an abstraction for fields / java bean properties.
 * It is internally used by attribute implementations.
 */
public interface Accessor {
	<A extends Annotation> A getAnnotation(Class<A> annotationClass);

	/**
	 * Gets the value.
	 * 
	 * @param entity
	 *            the entity
	 * @return the value
	 */
	Object getValue(Object entity);

	/**
	 * Checks if is readable.
	 * 
	 * @return true, if is readable
	 */
	boolean isReadable();

	/**
	 * Checks if is writable.
	 * 
	 * @return true, if is writable
	 */
	boolean isWritable();

	/**
	 * Sets the value.
	 * 
	 * @param entity
	 *            the entity
	 * @param value
	 *            the value
	 */
	void setValue(Object entity, Object value);

}
