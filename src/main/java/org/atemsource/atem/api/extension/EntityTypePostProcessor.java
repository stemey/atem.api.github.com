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
package org.atemsource.atem.api.extension;

import org.atemsource.atem.api.type.EntityType;
import org.atemsource.atem.spi.EntityTypeCreationContext;

/**
 * When an EntityType is constructed this interface can be used to be notified.
 * Usually one processes annotations on the EntityType's java class and adds
 * meta data to the ENtityType.
 * 
 * @author Stefan Meyer
 */
public interface EntityTypePostProcessor {

	/**
	 * postprocess the EntityType.
	 * 
	 * @param context
	 *            gives access to other types while the EntityTypeRepository is
	 *            initialized
	 * @param entityType
	 *            the entity type
	 */
	void postProcessEntityType(EntityTypeCreationContext context,
			EntityType<?> entityType);

}
