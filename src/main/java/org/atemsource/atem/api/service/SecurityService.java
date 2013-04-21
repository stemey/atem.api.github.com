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
package org.atemsource.atem.api.service;

import org.atemsource.atem.api.attribute.Attribute;
import org.atemsource.atem.api.type.EntityType;

// TODO: Auto-generated Javadoc
/**
 * The Interface SecurityService.
 */
public interface SecurityService {

	/**
	 * Checks for attribute modification permission.
	 * 
	 * @param attribute
	 *            the attribute
	 * @return true, if successful
	 */
	boolean hasAttributePermission(Attribute<?,?> attribute, Operation operation);

	/**
	 * Checks for attribute modification permission.
	 * 
	 * @param attribute
	 *            the attribute
	 * @return true, if successful
	 */
	boolean hasTypePermission(EntityType<?> entityType, Operation operation);

	/**
	 * Checks for attribute modification permission.
	 * 
	 * @param attribute
	 *            the attribute
	 * @return true, if successful
	 */
	<E> boolean  hasInstancePermission(EntityType<E> entityType, E entity,Operation operation);


}
