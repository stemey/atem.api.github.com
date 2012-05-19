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
package org.atemsource.atem.api.attribute.primitive;

import java.util.Currency;
import java.util.List;

import org.atemsource.atem.api.type.PrimitiveType;

// TODO: Auto-generated Javadoc
/**
 * The Interface CurrencyAmountType.
 * 
 * @param <J>
 *            the generic type
 */
public interface CurrencyAmountType<J> extends PrimitiveType<J> {

	/**
	 * Creates the instance.
	 * 
	 * @param amount
	 *            the amount
	 * @param currencyCode
	 *            the currency code
	 * @return the j
	 */
	J createInstance(Double amount, String currencyCode);

	/**
	 * Gets the amount as double.
	 * 
	 * @param value
	 *            the value
	 * @return the amount as double
	 */
	Double getAmountAsDouble(J value);

	/**
	 * Gets the currencies set.
	 * 
	 * @return the currencies set
	 */
	List<Currency> getCurrenciesSet();

	/**
	 * Gets the currency code.
	 * 
	 * @param value
	 *            the value
	 * @return the currency code
	 */
	String getCurrencyCode(J value);

}
