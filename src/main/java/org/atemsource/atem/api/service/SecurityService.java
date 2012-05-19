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
	boolean hasAttributeModificationPermission(Attribute attribute);

	/**
	 * Checks for attribute reading permission.
	 * 
	 * @param attribute
	 *            the attribute
	 * @return true, if successful
	 */
	boolean hasAttributeReadingPermission(Attribute attribute);

	/**
	 * Checks for creation permission.
	 * 
	 * @return true, if successful
	 */
	boolean hasCreationPermission();

	/**
	 * Checks for deletion permission.
	 * 
	 * @return true, if successful
	 */
	boolean hasDeletionPermission();

	/**
	 * Checks for deletion permission.
	 * 
	 * @param entity
	 *            the entity
	 * @return true, if successful
	 */
	boolean hasDeletionPermission(Object entity);

	/**
	 * Checks for type modification permission.
	 * 
	 * @return true, if successful
	 */
	boolean hasTypeModificationPermission();

	/**
	 * Checks for type permission.
	 * 
	 * @param operation
	 *            the operation
	 * @return true, if successful
	 */
	boolean hasTypePermission(Operation operation);

	/**
	 * Checks for type reading permission.
	 * 
	 * @return true, if successful
	 */
	boolean hasTypeReadingPermission();

}
