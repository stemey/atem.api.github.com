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


public class Sorting
{
	public static class AttributeSorting
	{
		private String code;

		private String filter;

		private boolean ascending;

		public String getCode()
		{
			return code;
		}

		public String getFilter()
		{
			return filter;
		}

		public boolean isAscending()
		{
			return ascending;
		}

		public void setAscending(final boolean ascending)
		{
			this.ascending = ascending;
		}

		public void setCode(final String code)
		{
			this.code = code;
		}

		public void setFilter(final String filter)
		{
			this.filter = filter;
		}
	}

	private List<AttributeSorting> sortings;

	public List<AttributeSorting> getSortings()
	{
		return sortings;
	}

	public void setSortings(final List<AttributeSorting> sortings)
	{
		this.sortings = sortings;
	}

}
