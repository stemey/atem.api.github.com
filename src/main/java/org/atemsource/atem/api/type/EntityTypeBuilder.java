/*******************************************************************************
 * Stefan Meyer, 2012 Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 ******************************************************************************/
package org.atemsource.atem.api.type;

import org.atemsource.atem.api.attribute.CollectionAttribute;
import org.atemsource.atem.api.attribute.CollectionSortType;
import org.atemsource.atem.api.attribute.MapAttribute;
import org.atemsource.atem.api.attribute.relation.SingleAttribute;


// TODO: Auto-generated Javadoc
/**
 * This builder allows to define an EntityType at run time. These EntityTypes are called dynamic.
 * 
 * @author Stefan Meyer
 */
public interface EntityTypeBuilder
{

	/**
	 * Adds the map association attribute.
	 * 
	 * @param <K> the key type
	 * @param <V> the value type
	 * @param <R> the generic type
	 * @param code the code
	 * @param keyType the key type
	 * @param valueType the value type
	 * @return the map attribute
	 */
	public <K, V, R> MapAttribute<K, V, R> addMapAssociationAttribute(String code, Type<K> keyType, Type<V> valueType,
		boolean sorted);

	public <K, V, R> MapAttribute<K, V, R> addMapAssociationAttribute(String code, Type<K> keyType, Type<V> valueType,
		boolean sorted, Type[] validTypes);

	
	public EntityType<?> getReference();
	/**
	 * Adds the multi association attribute.
	 * 
	 * @param <J> the generic type
	 * @param <R> the generic type
	 * @param code the code
	 * @param targetType the target type
	 * @param collectionSortType the collection sort type
	 * @return the collection attribute
	 */
	public <J, R> CollectionAttribute<J, R> addMultiAssociationAttribute(String code, Type<J> targetType,
		CollectionSortType collectionSortType);

	public <J, R> CollectionAttribute<J, R> addMultiAssociationAttribute(String code, Type<J> targetType,
		Type[] validTypes, CollectionSortType collectionSortType);

	/**
	 * Adds the primitive attribute.
	 * 
	 * @param <J> the generic type
	 * @param code the code
	 * @param type the type
	 * @return the single attribute
	 */
	public <J> SingleAttribute<J> addPrimitiveAttribute(String code, PrimitiveType<J> type);

	/**
	 * Adds the single association attribute.
	 * 
	 * @param <J> the generic type
	 * @param code the code
	 * @param targetType the target type
	 * @return the single attribute
	 */
	public <J> SingleAttribute<J> addSingleAssociationAttribute(String code, EntityType<J> targetType);
	public <J> SingleAssociationAttributeBuilder<J> addSingleAssociationAttribute(String code);
	public <R,J> MultiAssociationAttributeBuilder<R,J> addMultiAssociationAttribute(String code);

	public <J> SingleAttribute<J> addSingleAttribute(String code, Class<J> javaType);

	public <J> SingleAttribute<J> addSingleAttribute(String code, Class<J> javaType, Class[] validClasses);

	/**
	 * Adds the single attribute.
	 * 
	 * @param <J> the generic type
	 * @param code the code
	 * @param type the type
	 * @return the single attribute
	 */
	public <J> SingleAttribute<J> addSingleAttribute(String code, Type<J> type);

	public <J> SingleAttribute<J> addSingleAttribute(String code, Type<J> type, Type[] validTypes);

	/**
	 * Creates the entity type.
	 * 
	 * @return the entity type
	 */
	public EntityType<?> createEntityType();

	public void mixin(EntityType<?> mixinType);

	/**
	 * Sets the entity class.
	 * 
	 * @param entityClass the entity class
	 * @return the entity type builder
	 */
	public EntityTypeBuilder setEntityClass(Class<?> entityClass);

	public void superType(EntityType<?> superType);

	public void setAbstract(boolean abstractType);


}
