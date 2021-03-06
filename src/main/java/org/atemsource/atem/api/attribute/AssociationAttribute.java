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

import org.atemsource.atem.api.type.EntityType;

// TODO: Auto-generated Javadoc
/**
 * The Interface AssociationAttribute.
 * 
 * @param <J>
 *            the generic type
 * @param <R>
 *            the generic type
 */
public interface AssociationAttribute<J, R> extends Attribute<J, R> {

	/**
	 * Gets the incoming relation.
	 * 
	 * @return the incoming relation
	 */
	public AssociationAttribute<?, ?> getIncomingRelation();

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.atemsource.atem.api.attribute.Attribute#getTargetType()
	 */
	@Override
	EntityType<J> getTargetType();
	
	public <T extends J> T createTarget(EntityType<T> targetType, Object parent);


}
