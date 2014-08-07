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

import java.util.Collection;
import java.util.Iterator;

/**
 * Attributes that hold more than one value (collections and arrays).
 * 
 * @param <J>
 *            the target type
 * @param <R>
 *            the return type
 */
public interface CollectionAttribute<J, R> extends Attribute<J, R> {

	/**
	 * Adds an element.
	 * 
	 * @param entity
	 *            the entity
	 * @param element
	 *            the element
	 */
	public void addElement(Object entity, J element);

	/**
	 * Removes all elements.
	 * 
	 * @param entity
	 *            the entity
	 */
	public void clear(Object entity);

	/**
	 * Check if the element is contained
	 * 
	 * @param entity
	 *            the entity
	 * @param element
	 *            the element
	 * @return true, if the given element is contained in the collection.
	 */
	public boolean contains(Object entity, J element);

	/**
	 * Gets the collection sort type.
	 * 
	 * @return the collection sort type
	 */
	public CollectionSortType getCollectionSortType();

	/**
	 * Gets the elements as a collection. Changes to the collection may or may not affect the attrubute's value.
	 * 
	 * @param entity
	 *            the entity
	 * @return the elements
	 */
	public Collection<J> getElements(Object entity);

	/**
	 * Gets the value of an empty collection. 
	 * 
	 * @param entity
	 *            the entity
	 * @return the empty collection
	 */
	//public R getEmptyCollection(Object entity);

	/**
	 * Gets the iterator to iterate over the elements.
	 * 
	 * @param entity
	 *            the entity
	 * @return the iterator
	 */
	public Iterator<J> getIterator(Object entity);

	/**
	 * Gets the size of the collection.
	 * 
	 * @param entity
	 *            the entity
	 * @return the size
	 */
	public int getSize(Object entity);

	/**
	 * Removes the given element.
	 * 
	 * @param entity
	 *            the entity
	 * @param element
	 *            the element
	 */
	public void removeElement(Object entity, J element);
}
