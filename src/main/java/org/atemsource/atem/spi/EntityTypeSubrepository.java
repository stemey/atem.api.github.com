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
package org.atemsource.atem.spi;


import java.util.Collection;

import org.atemsource.atem.api.EntityTypeRepository;
import org.atemsource.atem.api.attribute.Attribute;
import org.atemsource.atem.api.type.EntityType;


public interface EntityTypeSubrepository<J>
{

	public void addIncomingAssociation(EntityType<J> entityType, Attribute<?, ?> incomingRelation);

	public void afterFirstInitialization(EntityTypeRepository entityTypeRepositoryImpl);

	public void afterInitialization();

	public boolean contains(EntityType<J> entityType);

	public EntityType<J> getEntityType(Class clazz);

	EntityType<J> getEntityType(Object entity);

	public EntityType<J> getEntityType(String typeCode);

	public EntityType<J> getEntityTypeReference(Class<J> clazz);

	public EntityType<J> getEntityTypeReference(String typeCode);

	public Collection<? extends EntityType<J>> getEntityTypes();

	public boolean hasEntityTypeReference(Class entityClass);

	public void initialize(EntityTypeCreationContext entityTypeCreationContext);

	public void initializeIncomingAssociations();

}
