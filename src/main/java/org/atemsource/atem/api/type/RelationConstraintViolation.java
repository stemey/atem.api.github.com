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
package org.atemsource.atem.api.type;

import org.atemsource.atem.api.attribute.Attribute;


/**
 * The relation constraint violation issues the inability to delete a typed entity because of another entity referrering
 * to it with an entity relation attribute set to <code>"deny"</code>.
 * 
 * @author Thomas Jacob
 * @see EntityRelationAttribute
 */
public class RelationConstraintViolation extends ConstraintViolation
{
	/**
	 * The entity relation attribute that causes the violation.
	 */
	private Attribute attribute;

	/**
	 * Creates a new relation constraint violation.
	 * 
	 * @param sourceEntity The source entity that causes the violation.
	 * @param attribute The entity relation attribute that causes the violation.
	 */
	public RelationConstraintViolation(final Object sourceEntity, final Attribute attribute)
	{
		super(sourceEntity);

		this.attribute = attribute;
	}

	/**
	 * Returns the entity relation attribute that causes the violation.
	 * 
	 * @return The entity relation attribute.
	 */
	public Attribute getAttribute()
	{
		return attribute;
	}

	@Override
	public String toString()
	{
		return "RelationConstraintViolation(source=" + getSourceEntity() + ", attribute=" + attribute + ")";
	}
}
