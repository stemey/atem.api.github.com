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

import org.atemsource.atem.api.attribute.Attribute;
import org.atemsource.atem.api.type.EntityType;
import org.atemsource.atem.api.type.Type;


public interface EntityTypeCreationContext
{

	public void addIncomingAssociation(EntityType entityType, Attribute<?, ?> incomingRelation);

	public void addListener(EntityTypeRepositoryListener entityTypeRepositoryListener);

	public EntityType<?> getEntityTypeReference(Class<?> propertyType);

	public EntityType<?> getEntityTypeReference(String entityName);

	public Type<?> getTypeReference(Class<?> propertyType);

	public boolean hasEntityTypeReference(Class mappedClass);

	public void lazilyInitialized(EntityType entityType);

	void onPhase(Phase phase);

}
