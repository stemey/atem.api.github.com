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

/**
 * The Interface Attribute. An attribute is ike a field or java bean property. Is the type of the field a collection or array the type of the elements is described by the target type and the type of the elements holder is the association type.
 * 
 * @param <J>
 *            the target type of the attribute.
 * @param <R>
 *            the return type of the attribute.
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

	public Type<J>[] getValidTargetTypes();

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
	 * Checks if the attribute's value is required.
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

	public boolean isDerived();

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
