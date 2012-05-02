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


public interface CollectionAttribute<J, R> extends Attribute<J, R>
{
	public void addElement(Object entity, J element);

	public void clear(Object entity);

	public boolean contains(Object entity, J element);

	public CollectionSortType getCollectionSortType();

	public Collection<J> getElements(Object entity);

	public R getEmptyCollection(Object entity);

	public Iterator<J> getIterator(Object entity);

	public int getSize(Object entity);

	public void removeElement(Object entity, J element);
}
