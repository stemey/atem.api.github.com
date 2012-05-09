/*******************************************************************************
 * Stefan Meyer, 2012 Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 ******************************************************************************/
package org.atemsource.atem.api.service;

import java.io.Serializable;

import org.atemsource.atem.api.attribute.Attribute;


public class EntityProblem implements Serializable
{
	/**
	 * The attribute that causes the problem, if it is so. Only one of {@link #getAttribute()} and
	 * {@link #getPropertyName()}, or none of both is set.
	 */
	private Attribute attribute;

	/**
	 * The entity that has the problem.
	 */
	private Object entity;

	/**
	 * The human friendly message describing the problem.
	 */
	private String message;

	/**
	 * The standard property that causes the problem, if it is so. Only one of {@link #getAttribute()} and
	 * {@link #getPropertyName()}, or none of both is set.
	 */
	private String propertyName;

	/**
	 * The type of the problem.
	 */
	private Type type;

	/**
	 * Returns the attribute that causes the problem, if it is so. Only one of {@link #getAttribute()} and
	 * {@link #getPropertyName()}, or none of both is set.
	 * 
	 * @return the attribute or <code>null</code>.
	 */
	public Attribute getAttribute()
	{
		return attribute;
	}

	/**
	 * Returns the entity that has the problem.
	 * 
	 * @return The entity.
	 */
	public Object getEntity()
	{
		return entity;
	}

	public String getMessage()
	{
		return message;
	}

	/**
	 * Returns the standard property that causes the problem, if it is so. Only one of {@link #getAttribute()} and
	 * {@link #getPropertyName()}, or none of both is set.
	 * 
	 * @return The standard property name or <code>null</code>.
	 */
	public String getPropertyName()
	{
		return propertyName;
	}

	/**
	 * Returns the type of the problem.
	 * 
	 * @return The type of the problem.
	 */
	public Type getType()
	{
		return type;
	}

	/**
	 * Sets the the attribute that causes the problem, if it is so. Only one of {@link #getAttribute()} and
	 * {@link #getPropertyName()}, or none of both is set.
	 * 
	 * @param attributeName The attribute or <code>null</code>.
	 */
	public void setAttribute(final Attribute attribute)
	{
		this.attribute = attribute;
	}

	/**
	 * Sets the entity that has the problem.
	 * 
	 * @param entity The entity.
	 */
	public void setEntity(final Object entity)
	{
		this.entity = entity;
	}

	public void setMessage(String message)
	{
		this.message = message;
	}

	public void setPropertyName(final String propertyName)
	{
		this.propertyName = propertyName;
	}

	public void setType(final Type type)
	{
		this.type = type;
	}

	public enum Type
	{
		/**
		 * The attribute value is invalid, so the entity itself is declared invalid. Invalid values can be persisted, but
		 * they are not offered in the Shop.
		 */
		INVALID,

		/**
		 * The attribute value is unpersistable, so the entity cannot be saved in this state.
		 */
		UNPERSISTABLE;
	}

}
