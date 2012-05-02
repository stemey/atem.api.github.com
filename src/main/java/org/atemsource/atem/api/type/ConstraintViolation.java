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
 * The constraint violation issues the inability to delete a typed entity because of another entity referrering to it.
 * 
 * @author Thomas Jacob
 */
public abstract class ConstraintViolation
{
	/**
	 * The source entity that causes the violation.
	 */
	private Object sourceEntity;

	/**
	 * Creates a new constraint violation.
	 * 
	 * @param attribute The entity relation attribute that causes the violation.
	 * @param sourceEntity The source entity that causes the violation.
	 */
	public ConstraintViolation(final Object sourceEntity)
	{
		this.sourceEntity = sourceEntity;
	}

	/**
	 * Returns the source entity that causes the violation.
	 * 
	 * @return The source entity.
	 */
	public Object getSourceEntity()
	{
		return sourceEntity;
	}
}
