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
 * The Class Sorting.
 */
public class Sorting {

	/**
	 * The Class AttributeSorting.
	 */
	public static class AttributeSorting {

		/** The code. */
		private String code;

		/** The filter. */
		private String filter;

		/** The ascending. */
		private boolean ascending;

		/**
		 * Gets the code.
		 * 
		 * @return the code
		 */
		public String getCode() {
			return code;
		}

		/**
		 * Gets the filter.
		 * 
		 * @return the filter
		 */
		public String getFilter() {
			return filter;
		}

		/**
		 * Checks if is ascending.
		 * 
		 * @return true, if is ascending
		 */
		public boolean isAscending() {
			return ascending;
		}

		/**
		 * Sets the ascending.
		 * 
		 * @param ascending
		 *            the new ascending
		 */
		public void setAscending(final boolean ascending) {
			this.ascending = ascending;
		}

		/**
		 * Sets the code.
		 * 
		 * @param code
		 *            the new code
		 */
		public void setCode(final String code) {
			this.code = code;
		}

		/**
		 * Sets the filter.
		 * 
		 * @param filter
		 *            the new filter
		 */
		public void setFilter(final String filter) {
			this.filter = filter;
		}
	}

	/** The sortings. */
	private List<AttributeSorting> sortings;

	/**
	 * Gets the sortings.
	 * 
	 * @return the sortings
	 */
	public List<AttributeSorting> getSortings() {
		return sortings;
	}

	/**
	 * Sets the sortings.
	 * 
	 * @param sortings
	 *            the new sortings
	 */
	public void setSortings(final List<AttributeSorting> sortings) {
		this.sortings = sortings;
	}

}
