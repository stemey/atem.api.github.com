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

import org.atemsource.atem.api.type.EntityType;

// TODO: Auto-generated Javadoc
/**
 * The Interface PublicationService.
 */
public interface PublicationService {

	/**
	 * Checks if is publication allowed.
	 * 
	 * @param entity
	 *            the entity
	 * @return true, if is publication allowed
	 */
	boolean isPublicationAllowed(EntityType<?> entity);

	/**
	 * Publish.
	 * 
	 * @param entity
	 *            the entity
	 */
	void publish(Object entity);

	/**
	 * Revert.
	 * 
	 * @param entity
	 *            the entity
	 * @return the object
	 */
	Object revert(Object entity);

}
