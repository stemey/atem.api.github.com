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
 * some of the information provided here may already be defined in a supporting
 * framework (e.g. jpa).
 * 
 * @author stemey
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ METHOD, FIELD })
public @interface MapAssociation {

	/**
	 * Key type.
	 * 
	 * @return the class
	 */
	Class keyType();

	/**
	 * use this to model virtual attribute on the other end.
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
