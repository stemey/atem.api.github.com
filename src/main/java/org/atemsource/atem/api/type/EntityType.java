/*******************************************************************************
 * Stefan Meyer, 2012 Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 ******************************************************************************/
package org.atemsource.atem.api.type;

import java.util.Collection;
import java.util.List;
import java.util.Set;
import org.atemsource.atem.api.attribute.Attribute;
import org.atemsource.atem.api.infrastructure.exception.TechnicalException;
import org.atemsource.atem.api.view.View;


// TODO: Auto-generated Javadoc
/**
 * The Interface EntityType.
 * 
 * @param <J> the generic type
 */
public interface EntityType<J> extends Type<J>, View
{
	
	public EntityType<EntityType<J>> getMetaType();

	/**
	 * Creates the array.
	 * 
	 * @param length the length
	 * @return the object[]
	 */
	public abstract Object[] createArray(int length);

	/**
	 * Creates a new entity instance for this type. The entity will not be persisted until you call
	 * 
	 * @return The newly created entity.
	 * @throws TechnicalException A technical problem prevents the operation from completing.
	 * {@link Object#save(boolean)}.
	 */
	public abstract J createEntity() throws TechnicalException;

	/**
	 * Gets the all sub entity types.
	 * 
	 * @return the all sub entity types
	 */
	public abstract Set<EntityType> getAllSubEntityTypes();

	/**
	 * Returns an attributes of this entity type by its code.
	 * 
	 * @param code The code of the attribute to be returned.
	 * @return The attribute.
	 */
	Attribute getAttribute(final String code);

	/**
	 * Gets the attributes.
	 * 
	 * @return the attributes
	 */
	public List<Attribute> getAttributes();

	/**
	 * Returns an attributes of this entity type by its code.
	 * 
	 * @param code The code of the attribute to be returned.
	 * @return The attribute.
	 */
	Attribute getDeclaredAttribute(final String code);

	/**
	 * Gets the attributes.
	 * 
	 * @return the attributes
	 */
	public List<Attribute> getDeclaredAttributes();

	/**
	 * Gets the entity class.
	 * 
	 * @return the entity class
	 */
	public abstract Class getEntityClass();

	/**
	 * Gets the incoming association.
	 * 
	 * @param sourceTypeCode the source type code
	 * @return the incoming association
	 */
	public Attribute getIncomingAssociation(String sourceTypeCode);

	/**
	 * Gets the incoming association.
	 * 
	 * @param sourceTypeCode the source type code
	 * @param attributeCode the attribute code
	 * @return the incoming association
	 */
	public Attribute getIncomingAssociation(String sourceTypeCode, String attributeCode);

	/**
	 * Returns an attributes of this entity type by its code.
	 * 
	 * @param code The code of the attribute to be returned.
	 * @return The attribute.
	 */
	Attribute getMetaAttribute(final String code);

	Collection<Attribute> getMetaAttributes();

	/**
	 * Gets the self and all sub entity types.
	 * 
	 * @return the self and all sub entity types
	 */
	public abstract Set<EntityType<?>> getSelfAndAllSubEntityTypes();

	/**
	 * Gets the service.
	 * 
	 * @param <T> the generic type
	 * @param serviceInterface the service interface
	 * @return the service
	 */
	public <T> T getService(final Class<T> serviceInterface);

	public abstract Set<EntityType> getSubEntityTypes();

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


}
