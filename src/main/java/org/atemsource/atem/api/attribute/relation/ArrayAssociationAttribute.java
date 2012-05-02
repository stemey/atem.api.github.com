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
package org.atemsource.atem.api.attribute.relation;

import org.atemsource.atem.api.attribute.CollectionAttribute;
import org.atemsource.atem.api.attribute.OrderableCollection;


/**
 * The multi association attribute is an association attribute for 'to many' relations. Each value is an array of
 * entities in this case.
 * 
 * @author Thomas Jacob
 */
public interface ArrayAssociationAttribute<J> extends CollectionAttribute<J, J[]>, OrderableCollection<J, J[]>
{

	/**
	 * Returns the associated entities in this attribute's entity list of a given typed entity.
	 * 
	 * @param entity The entity to return the associated entities of.
	 * @param variantId The ID of the variant. Use {@link VariantId#EMPTY} for plain attributes (neither client aware,
	 * nor localizable, nor stageable).
	 */
	public J[] getArray(final Object entityd);

	public void setArray(Object object, J[] associatedEntities);

}
