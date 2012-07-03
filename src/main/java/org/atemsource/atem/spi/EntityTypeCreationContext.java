/*******************************************************************************
 * Stefan Meyer, 2012 Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 ******************************************************************************/
package org.atemsource.atem.spi;

import org.atemsource.atem.api.attribute.Attribute;
import org.atemsource.atem.api.type.EntityType;
import org.atemsource.atem.api.type.Type;


// TODO: Auto-generated Javadoc
/**
 * The Interface EntityTypeCreationContext.
 */
public interface EntityTypeCreationContext
{

	/**
	 * Adds the incoming association.
	 * 
	 * @param entityType the entity type
	 * @param incomingRelation the incoming relation
	 */
	public void addIncomingAssociation(EntityType entityType, Attribute<?, ?> incomingRelation);

	/**
	 * Adds the listener.
	 * 
	 * @param entityTypeRepositoryListener the entity type repository listener
	 */
	public void addListener(EntityTypeRepositoryListener entityTypeRepositoryListener);

	/**
	 * Adds the incoming association.
	 * 
	 * @param entityType the entity type
	 * @param incomingRelation the incoming relation
	 */
	public void addMetaAttribute(EntityType entityType, Attribute<?, ?> metaAttribute);

	/**
	 * Gets the entity type reference.
	 * 
	 * @param propertyType the property type
	 * @return the entity type reference
	 */
	public EntityType<?> getEntityTypeReference(Class<?> propertyType);

	/**
	 * Gets the entity type reference.
	 * 
	 * @param entityName the entity name
	 * @return the entity type reference
	 */
	public EntityType<?> getEntityTypeReference(String entityName);

	/**
	 * Gets the type reference.
	 * 
	 * @param propertyType the property type
	 * @return the type reference
	 */
	public Type<?> getTypeReference(Class<?> propertyType);

	/**
	 * Checks for entity type reference.
	 * 
	 * @param mappedClass the mapped class
	 * @return true, if successful
	 */
	public boolean hasEntityTypeReference(Class mappedClass);

	/**
	 * Lazily initialized.
	 * 
	 * @param entityType the entity type
	 */
	public void lazilyInitialized(EntityType entityType);

	/**
	 * On phase.
	 * 
	 * @param phase the phase
	 */
	void onPhase(Phase phase);

}
