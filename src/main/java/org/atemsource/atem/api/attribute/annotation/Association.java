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
package org.atemsource.atem.api.attribute.annotation;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.METHOD;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * For ATEM attributes to be able to provide the target type of collection attributes, the target type needs to be provided by extra meta data like this annotation.
 * 
 * @author stemey
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ METHOD, FIELD })
public @interface Association {

	/**
	 * This is a hint for utilities based on ATEM.
	 * 
	 * @return true, if successful
	 */
	boolean composition() default false;

	/**
	 * If this is a unidirectional association you can set a name for the incoming assocaition attribute in the target type.
	 * 
	 * @return the string
	 */
	String targetAttribute() default "";

	/**
	 * Define the cardinality on the other side of the association.
	 * 
	 * @return the cardinality
	 */
	Cardinality targetCardinality() default Cardinality.ZERO_TO_MANY;

	/**
	 * Target type.
	 * 
	 * @return the class
	 */
	Class targetType();
}
