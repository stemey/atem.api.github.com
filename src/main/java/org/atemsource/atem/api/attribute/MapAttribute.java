/*******************************************************************************
 * Stefan Meyer, 2012 Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 ******************************************************************************/
package org.atemsource.atem.api.attribute;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.atemsource.atem.api.type.Type;


/**
 * The Interface MapAttribute offers manipulation methods for maps.
 * 
 * @param <K> the key type
 * @param <V> the target type
 * @param <R> the map type
 */
public interface MapAttribute<K, V, R> extends Attribute<V, R>
{

	/**
	 * Clear.
	 * 
	 * @param entity the entity
	 */
	public void clear(Object entity);

	/**
	 * Contains value.
	 * 
	 * @param entity the entity
	 * @param element the element
	 * @return true, if successful
	 */
	public boolean containsValue(Object entity, V element);

	/**
	 * Gets the element.
	 * 
	 * @param entity the entity
	 * @param keye the keye
	 * @return the element
	 */
	public V getElement(Object entity, K keye);

	/**
	 * Gets the empty map.
	 * 
	 * @return the empty map
	 */
	public R getEmptyMap();

	/**
	 * Gets the iterator.
	 * 
	 * @param entity the entity
	 * @return the iterator
	 */
	public Iterator<Map.Entry<?, ?>> getIterator(Object entity);

	/**
	 * Gets the key set.
	 * 
	 * @param a the a
	 * @return the key set
	 */
	public Set<K> getKeySet(Object a);

	/**
	 * Gets the key type.
	 * 
	 * @return the key type
	 */
	public Type<K> getKeyType();

	/**
	 * Gets the key type.
	 * 
	 * @param key the key
	 * @return the key type
	 */
	public abstract Type<K> getKeyType(K key);

	/**
	 * Gets the size.
	 * 
	 * @param entity the entity
	 * @return the size
	 */
	public int getSize(Object entity);

	/**
	 * Gets the collection sort type.
	 * 
	 * @return the collection sort type
	 */
	public boolean isSorted();

	/**
	 * Put element.
	 * 
	 * @param entity the entity
	 * @param key the key
	 * @param value the value
	 */
	public void putElement(Object entity, K key, V value);

	/**
	 * Removes the key.
	 * 
	 * @param entity the entity
	 * @param key the key
	 */
	public void removeKey(Object entity, K key);

	/**
	 * Removes the value.
	 * 
	 * @param entity the entity
	 * @param value the value
	 */
	public void removeValue(Object entity, V value);
}
