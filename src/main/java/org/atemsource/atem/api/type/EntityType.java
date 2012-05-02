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


import java.util.List;
import java.util.Set;

import org.atemsource.atem.api.TechnicalException;
import org.atemsource.atem.api.attribute.Attribute;


public interface EntityType<J> extends Type<J>
{
	public abstract Object[] createArray(int length);

	/**
	 * Creates a new entity instance for this type. The entity will not be persisted until you call
	 * {@link Object#save(boolean)}.
	 * 
	 * @return The newly created entity.
	 * @throws TechnicalException A technical problem prevents the operation from completing.
	 */
	public abstract J createEntity() throws TechnicalException;

	public abstract Set<EntityType> getAllSubEntityTypes();

	/**
	 * Returns an attributes of this entity type by its code.
	 * 
	 * @param code The code of the attribute to be returned.
	 * @return The attribute.
	 */
	public abstract Attribute getAttribute(final String code);

	public List<Attribute> getAttributes();

	/**
	 * Returns how to cascade staging operations ({@link Object#publish()}, {@link Object#revoke()}) to the parent of
	 * entities of this type. Defaults to {@link CascadeStagingType#NONE}.
	 * 
	 * @return How to cascade staging operations to parents.
	 */
	public abstract CascadeStagingType getCascadeStagingToParentType();

	public abstract Class getEntityClass();

	public Attribute getIncomingAssociation(String sourceTypeCode);

	public Attribute getIncomingAssociation(String sourceTypeCode, String attributeCode);

	public abstract Set<EntityType<?>> getSelfAndAllSubEntityTypes();

	public <T> T getService(final Class<T> serviceInterface);

	/**
	 * Returns all sub types of this type, including ancestors and this type.
	 * 
	 * @param includeAbstract Whether to include abstract types, too.
	 * @return All sub types of this type, including ancestors and this type.
	 */
	public abstract Set<EntityType> getSubEntityTypes(final boolean includeAbstract);

	/**
	 * Returns the super type, if any. All attributes are inherited from the super type and its super types. If the
	 * entity type has no super type, this property is <code>null</code>.
	 * 
	 * @return The super type or <code>null</code>.
	 */
	public abstract EntityType getSuperEntityType();

	/**
	 * Returns whether this entity type has an attribute with a given code.
	 * 
	 * @param code The code of the attribute to be verified.
	 * @return Whether this entity type has such an attribute.
	 */
	public abstract boolean hasAttribute(final String code);

	/**
	 * Returns whether the entity type is abstract, i.e. it cannot be instantiated (only sub types can).
	 * 
	 * @return Whether the entity type is abstract
	 */
	public abstract boolean isAbstractType();

	/**
	 * Returns whether this entity type is either the same as, or a super type of, the type of a specified entity.
	 * 
	 * @param entity The typed entity to compare to.
	 * @return Whether this entity type is either the same as, or a super type of, the type of a specified entity.
	 */
	public abstract boolean isAssignableFrom(final Object entity);

}