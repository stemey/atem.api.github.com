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

import java.util.Arrays;


/**
 * Indicates that an entity cannot be saved or deleted, because another entity points to an entity to be deleted, and
 * the constraint is set to {@link ConstraintType#DENY}.
 * 
 * @author Thomas Jacob
 */
public class ConstraintViolationException extends RuntimeException
{
	/**
	 * The constraint violations causing the exception.
	 */
	private ConstraintViolation[] constraintViolations;

	/**
	 * Creates a new constraint violation exception.
	 * 
	 * @param message The message of the exception.
	 * @param constraintViolations The constraint violations causing the exception.
	 */
	public ConstraintViolationException(final String message, final ConstraintViolation[] constraintViolations)
	{
		super(message);
		this.constraintViolations = constraintViolations;
	}

	/**
	 * Creates a new constraint violation exception.
	 * 
	 * @param message The message of the exception.
	 * @param cause The root cause.
	 * @param constraintViolations The constraint violations causing the exception.
	 */
	public ConstraintViolationException(final String message, final Throwable cause,
		final ConstraintViolation[] constraintViolations)
	{
		super(message, cause);
		this.constraintViolations = constraintViolations;
	}

	/**
	 * Returns the constraint violations causing the exception.
	 * 
	 * @return The constraint violations causing the exception.
	 */
	public ConstraintViolation[] getConstraintViolations()
	{
		return constraintViolations;
	}

	@Override
	public String getMessage()
	{
		return super.getMessage() + Arrays.asList(constraintViolations).toString();
	}
}
