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


import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import org.atemsource.atem.api.type.Type;


public interface MapAttribute<K, V, R> extends Attribute<V, R>
{
	public void clear(Object entity);

	public boolean containsValue(Object entity, V element);

	public CollectionSortType getCollectionSortType();

	public V getElement(Object entity, K keye);

	public R getEmptyMap();

	public Iterator<Map.Entry<?, ?>> getIterator(Object entity);

	public Set<K> getKeySet(Object a);

	public Type<K> getKeyType();

	public abstract Type<K> getKeyType(K key);

	public int getSize(Object entity);

	public void putElement(Object entity, K key, V value);

	public void removeKey(Object entity, K key);

	public void removeValue(Object entity, V value);
}
