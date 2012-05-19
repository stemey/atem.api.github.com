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
package org.atemsource.atem.api.service;

import java.util.List;

// TODO: Auto-generated Javadoc
/**
 * The Class Result.
 */
public class Result {

	/** The entities. */
	private List entities;

	/** The count. */
	private int count;

	/**
	 * Instantiates a new result.
	 * 
	 * @param entities
	 *            the entities
	 * @param count
	 *            the count
	 */
	public Result(final List entities, final int count) {
		super();
		this.entities = entities;
		this.count = count;
	}

	/**
	 * Gets the count.
	 * 
	 * @return the count
	 */
	public int getCount() {
		return count;
	}

	/**
	 * Gets the entities.
	 * 
	 * @return the entities
	 */
	public List getEntities() {
		return entities;
	}

	/**
	 * Sets the count.
	 * 
	 * @param count
	 *            the new count
	 */
	public void setCount(final int count) {
		this.count = count;
	}

	/**
	 * Sets the entities.
	 * 
	 * @param entities
	 *            the new entities
	 */
	public void setEntities(final List entities) {
		this.entities = entities;
	}
}
