/*******************************************************************************
 * Stefan Meyer, 2012 Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 ******************************************************************************/
package org.atemsource.atem.api.attribute;

import org.atemsource.atem.api.attribute.annotation.Cardinality;
import org.atemsource.atem.api.type.EntityType;
import org.atemsource.atem.api.type.Type;

// TODO: Auto-generated Javadoc
/**
 * The Interface Attribute.
 * 
 * @param <J>
 *            the generic type
 * @param <R>
 *            the generic type
 */
public interface Attribute<J, R> {

	/**
	 * Gets the association type.
	 * 
	 * @return the association type
	 */
	public Class<R> getAssociationType();

	/**
	 * Returns the code (a unique identifier) of the attribute within the entity
	 * type.
	 * 
	 * @return The code.
	 */
	public String getCode();

	/**
	 * Returns the entity type this attribute belongs to.
	 * 
	 * @return The entity type this attribute belongs to.
	 */
	public EntityType getEntityType();

	/**
	 * Gets the return type.
	 * 
	 * @return the return type
	 */
	public Class<R> getReturnType();

	/**
	 * Gets the target cardinality.
	 * 
	 * @return the target cardinality
	 */
	public Cardinality getTargetCardinality();

	/**
	 * Gets the target type.
	 * 
	 * @return the target type
	 */
	public Type<J> getTargetType();

	/**
	 * Gets the target type.
	 * 
	 * @param value
	 *            the value
	 * @return the target type
	 */
	public Type<J> getTargetType(J value);

	/**
	 * Gets the value.
	 * 
	 * @param entity
	 *            the entity
	 * @return the value
	 */
	public R getValue(final Object entity);

	/**
	 * Checks if is composition.
	 * 
	 * @return true, if is composition
	 */
	public boolean isComposition();

	/**
	 * Checks if is equal.
	 * 
	 * @param entity
	 *            the entity
	 * @param other
	 *            the other
	 * @return true, if is equal
	 */
	public boolean isEqual(Object entity, Object other);

	/**
	 * Checks if is required.
	 * 
	 * @return true, if is required
	 */
	public boolean isRequired();

	/**
	 * Checks if is writeable.
	 * 
	 * @return true, if is writeable
	 */
	public boolean isWriteable();

	/**
	 * Sets the value.
	 * 
	 * @param entity
	 *            the entity
	 * @param value
	 *            the value
	 */
	public void setValue(final Object entity, R value);
}
