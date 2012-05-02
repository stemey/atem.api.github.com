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

/**
 * The parent constraint violation issues the inability to delete a typed entity because another entity is a child of
 * this entity and <code>composition</code> is "false".
 * 
 * @author Thomas Jacob
 * @see Category
 */
public class ParentConstraintViolation extends ConstraintViolation
{
	/**
	 * Creates a new relation constraint violation.
	 * 
	 * @param sourceEntity The source entity that causes the violation.
	 */
	public ParentConstraintViolation(final Object sourceEntity)
	{
		super(sourceEntity);
	}

	@Override
	public String toString()
	{
		return "ParentConstraintViolation(source=" + getSourceEntity() + ")";
	}
}
