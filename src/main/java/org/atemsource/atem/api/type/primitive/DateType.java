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
package org.atemsource.atem.api.type.primitive;

import java.util.Date;

import org.atemsource.atem.api.type.PrimitiveType;

// TODO: Auto-generated Javadoc
/**
 * The Interface DateType.
 */
public interface DateType extends PrimitiveType<Object> {

	/**
	 * The Enum Precision.
	 */
	public enum Precision {

		/** The DATE. */
		DATE,
		/** The TIME. */
		TIME,
		/** The DATETIME. */
		DATETIME;
	}

	/**
	 * Gets the current date.
	 * 
	 * @return the current date
	 */
	public Date getCurrentDate();

	/**
	 * Gets the precision.
	 * 
	 * @return the precision
	 */
	public Precision getPrecision();
}
