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

// TODO: Auto-generated Javadoc
/**
 * The Interface CollectionAttribute.
 * 
 * @param <J>
 *            the generic type
 * @param <R>
 *            the generic type
 */
public interface CollectionAttribute<J, R> extends Attribute<J, R> {

	/**
	 * Adds the element.
	 * 
	 * @param entity
	 *            the entity
	 * @param element
	 *            the element
	 */
	public void addElement(Object entity, J element);

	/**
	 * Clear.
	 * 
	 * @param entity
	 *            the entity
	 */
	public void clear(Object entity);

	/**
	 * Contains.
	 * 
	 * @param entity
	 *            the entity
	 * @param element
	 *            the element
	 * @return true, if successful
	 */
	public boolean contains(Object entity, J element);

	/**
	 * Gets the collection sort type.
	 * 
	 * @return the collection sort type
	 */
	public CollectionSortType getCollectionSortType();

	/**
	 * Gets the elements.
	 * 
	 * @param entity
	 *            the entity
	 * @return the elements
	 */
	public Collection<J> getElements(Object entity);

	/**
	 * Gets the empty collection.
	 * 
	 * @param entity
	 *            the entity
	 * @return the empty collection
	 */
	public R getEmptyCollection(Object entity);

	/**
	 * Gets the iterator.
	 * 
	 * @param entity
	 *            the entity
	 * @return the iterator
	 */
	public Iterator<J> getIterator(Object entity);

	/**
	 * Gets the size.
	 * 
	 * @param entity
	 *            the entity
	 * @return the size
	 */
	public int getSize(Object entity);

	/**
	 * Removes the element.
	 * 
	 * @param entity
	 *            the entity
	 * @param element
	 *            the element
	 */
	public void removeElement(Object entity, J element);
}
