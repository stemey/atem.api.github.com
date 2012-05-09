/*******************************************************************************
 * Stefan Meyer, 2012 Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 ******************************************************************************/
package org.atemsource.atem.api.attribute;

import org.atemsource.atem.api.attribute.annotation.Cardinality;
import org.atemsource.atem.api.type.EntityType;
import org.atemsource.atem.api.type.Type;


public interface Attribute<J, R>
{
	public Class<R> getAssociationType();

	/**
	 * Returns the code (a unique identifier) of the attribute within the entity type.
	 * 
	 * @return The code.
	 */
	public String getCode();

	/**
	 * Returns the entity type this attribute belongs to.
	 * 
	 * @return The entity type this attribute belongs to.
	 */
	public EntityType getEntityType();

	public Class<R> getReturnType();

	public Cardinality getTargetCardinality();

	public Type<J> getTargetType();

	public Type<J> getTargetType(J value);

	public R getValue(final Object entity);

	public boolean isComposition();

	public boolean isEqual(Object entity, Object other);

	public boolean isRequired();

	public boolean isWriteable();

	public void setValue(final Object entity, R value);
}
