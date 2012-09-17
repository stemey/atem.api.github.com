/*******************************************************************************
 * Stefan Meyer, 2012 Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 ******************************************************************************/
package org.atemsource.atem.spi;

import java.util.Collection;

import org.atemsource.atem.api.EntityTypeRepository;
import org.atemsource.atem.api.attribute.Attribute;
import org.atemsource.atem.api.type.EntityType;
import org.atemsource.atem.api.type.TypeFilter;


/**
 * The Interface EntityTypeSubrepository.
 * 
 * @param <J> the generic type
 */
public interface EntityTypeSubrepository<J> extends TypeFilter<J>
{

	/**
	 * Adds the incoming association.
	 * 
	 * @param entityType the entity type
	 * @param incomingRelation the incoming relation
	 */
	public void addIncomingAssociation(EntityType<J> entityType, Attribute<?, ?> incomingRelation);

	/**
	 * Adds the meta attribute
	 * 
	 * @param entityType the entity type
	 * @param metaAttribute the meta attribute
	 */
	public void addMetaAttribute(EntityType<J> entityType, Attribute<?, ?> metaAttribute);

	/**
	 * After first initialization.
	 * 
	 * @param entityTypeRepositoryImpl the entity type repository impl
	 */
	public void afterFirstInitialization(EntityTypeRepository entityTypeRepositoryImpl);

	/**
	 * After initialization.
	 */
	public void afterInitialization();

	/**
	 * Contains.
	 * 
	 * @param entityType the entity type
	 * @return true, if successful
	 */
	public boolean contains(EntityType<J> entityType);

	/**
	 * Gets the entity type.
	 * 
	 * @param clazz the clazz
	 * @return the entity type
	 */
	public EntityType<J> getEntityType(Class clazz);

	/**
	 * Gets the entity type.
	 * 
	 * @param entity the entity
	 * @return the entity type
	 */
	EntityType<J> getEntityType(Object entity);

	/**
	 * Gets the entity type.
	 * 
	 * @param typeCode the type code
	 * @return the entity type
	 */
	public EntityType<J> getEntityType(String typeCode);

	/**
	 * Gets the entity type reference.
	 * 
	 * @param clazz the clazz
	 * @return the entity type reference
	 */
	public EntityType<J> getEntityTypeReference(Class<J> clazz);

	/**
	 * Gets the entity type reference.
	 * 
	 * @param typeCode the type code
	 * @return the entity type reference
	 */
	public EntityType<J> getEntityTypeReference(String typeCode);

	/**
	 * Gets the entity types.
	 * 
	 * @return the entity types
	 */
	public Collection<? extends EntityType<J>> getEntityTypes();

	/**
	 * Checks for entity type reference.
	 * 
	 * @param entityClass the entity class
	 * @return true, if successful
	 */
	public boolean hasEntityTypeReference(Class entityClass);

	/**
	 * Initialize.
	 * 
	 * @param entityTypeCreationContext the entity type creation context
	 */
	public void initialize(EntityTypeCreationContext entityTypeCreationContext);

	/**
	 * Initialize incoming associations.
	 */
	public void initializeIncomingAssociations();

}
