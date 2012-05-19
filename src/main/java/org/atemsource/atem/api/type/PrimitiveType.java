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

import java.io.Serializable;


// TODO: Auto-generated Javadoc
/**
 * The Interface PrimitiveType.
 * 
 * @param <J>
 *            the generic type
 */
public interface PrimitiveType<J> extends Type<J> {

	/**
	 * Clone.
	 * 
	 * @param value
	 *            the value
	 * @return the j
	 */
	public J clone(J value);

	/**
	 * Deserialize.
	 * 
	 * @param value
	 *            the value
	 * @return the j
	 */
	public J deserialize(Serializable value);

	/**
	 * Checks if is nullable.
	 * 
	 * @return true, if is nullable
	 */
	public boolean isNullable();

	/**
	 * Serialize.
	 * 
	 * @param value
	 *            the value
	 * @return the serializable
	 */
	public Serializable serialize(J value);

}
