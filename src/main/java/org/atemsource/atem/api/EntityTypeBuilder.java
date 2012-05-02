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
package org.atemsource.atem.api;

import org.atemsource.atem.api.attribute.CollectionAttribute;
import org.atemsource.atem.api.attribute.CollectionSortType;
import org.atemsource.atem.api.attribute.MapAttribute;
import org.atemsource.atem.api.attribute.primitive.PrimitiveType;
import org.atemsource.atem.api.attribute.relation.SingleAttribute;
import org.atemsource.atem.api.type.EntityType;
import org.atemsource.atem.api.type.Type;


public interface EntityTypeBuilder
{
	public <K, V, R> MapAttribute<K, V, R> addMapAssociationAttribute(String code, Type<K> keyType, Type<V> valueType);

	public <J, R> CollectionAttribute<J, R> addMultiAssociationAttribute(String code, Type<J> targetType,
		CollectionSortType collectionSortType);

	public <J> SingleAttribute<J> addPrimitiveAttribute(String code, PrimitiveType<J> type);

	public <J> SingleAttribute<J> addSingleAssociationAttribute(String code, EntityType<J> targetType);

	public <J> SingleAttribute<J> addSingleAttribute(String code, Type<J> type);

	public EntityType<?> createEntityType();

	public EntityTypeBuilder setEntityClass(Class<?> entityClass);

}
