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

// TODO: Auto-generated Javadoc
/**
 * The Interface OrderableCollection.
 * 
 * @param <J>
 *            the generic type
 * @param <R>
 *            the generic type
 */
public interface OrderableCollection<J, R> extends CollectionAttribute<J, R> {

	/**
	 * Adds the element.
	 * 
	 * @param entity
	 *            the entity
	 * @param index
	 *            the index
	 * @param value
	 *            the value
	 */
	void addElement(Object entity, int index, J value);

	/**
	 * Gets the element.
	 * 
	 * @param entity
	 *            the entity
	 * @param index
	 *            the index
	 * @return the element
	 */
	Object getElement(Object entity, int index);

	/**
	 * Gets the index.
	 * 
	 * @param entity
	 *            the entity
	 * @param value
	 *            the value
	 * @return the index
	 */
	int getIndex(Object entity, J value);

	/**
	 * Move element.
	 * 
	 * @param entity
	 *            the entity
	 * @param fromIndex
	 *            the from index
	 * @param toIndex
	 *            the to index
	 */
	void moveElement(Object entity, int fromIndex, int toIndex);

	/**
	 * Removes the element.
	 * 
	 * @param entity
	 *            the entity
	 * @param index
	 *            the index
	 * @return the object
	 */
	Object removeElement(Object entity, int index);

}
