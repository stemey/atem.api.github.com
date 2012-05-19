/*******************************************************************************
 * Stefan Meyer, 2012 Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 ******************************************************************************/
package org.atemsource.atem.api.attribute.relation;

import org.atemsource.atem.api.attribute.CollectionAttribute;
import org.atemsource.atem.api.attribute.OrderableCollection;

// TODO: Auto-generated Javadoc
/**
 * The Interface ArrayAssociationAttribute.
 * 
 * @param <J>
 *            the generic type
 */
public interface ArrayAssociationAttribute<J> extends
		CollectionAttribute<J, J[]>, OrderableCollection<J, J[]> {

	/**
	 * Gets the array.
	 * 
	 * @param entityd
	 *            the entityd
	 * @return the array
	 */
	public J[] getArray(final Object entityd);

	/**
	 * Sets the array.
	 * 
	 * @param object
	 *            the object
	 * @param associatedEntities
	 *            the associated entities
	 */
	public void setArray(Object object, J[] associatedEntities);

}
