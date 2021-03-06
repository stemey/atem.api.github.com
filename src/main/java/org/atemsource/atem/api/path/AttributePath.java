package org.atemsource.atem.api.path;

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

import org.atemsource.atem.api.attribute.Attribute;

public interface AttributePath {
	public String getAsString();

	/**
	 * return the attribute that this path refers to. Might return null if the
	 * last path element is a key or index. returns null if the attribute haas
	 * no unique match
	 * 
	 * @return
	 */
	public Attribute getAttribute();


	
}
