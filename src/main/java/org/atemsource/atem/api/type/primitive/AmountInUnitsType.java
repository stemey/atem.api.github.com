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

import java.text.NumberFormat;
import java.util.List;

import org.atemsource.atem.api.type.PrimitiveType;

// TODO: Auto-generated Javadoc
/**
 * The Interface AmountInUnitsType.
 * 
 * @param <J>
 *            the generic type
 * @param <U>
 *            the generic type
 */
public interface AmountInUnitsType<J, U extends Unit> extends PrimitiveType<J> {

	/**
	 * Creates the instance.
	 * 
	 * @param amount
	 *            the amount
	 * @param unitCode
	 *            the unit code
	 * @return the j
	 */
	J createInstance(Number amount, String unitCode);

	/**
	 * Gets the amount.
	 * 
	 * @param value
	 *            the value
	 * @return the amount
	 */
	Number getAmount(J value);

	/**
	 * Gets the format.
	 * 
	 * @return the format
	 */
	NumberFormat getFormat();

	/**
	 * Gets the unit.
	 * 
	 * @param value
	 *            the value
	 * @return the unit
	 */
	U getUnit(J value);

	/**
	 * Gets the units.
	 * 
	 * @return the units
	 */
	List<U> getUnits();

}
