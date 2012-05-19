/*******************************************************************************
 * Stefan Meyer, 2012 Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 ******************************************************************************/
package org.atemsource.atem.api;

import static java.lang.annotation.ElementType.ANNOTATION_TYPE;

import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import org.atemsource.atem.api.infrastructure.meta.InitialzableByAnnotationBean;

// TODO: Auto-generated Javadoc
/**
 * The Class BeanReferenceData.
 */
public class BeanReferenceData implements
		InitialzableByAnnotationBean<BeanReferenceData.BeanReference> {

	/** The bean name. */
	private String beanName;

	/** The bean class. */
	private Class<?> beanClass;

	/** The qualifier. */
	private Class<? extends Annotation> qualifier;

	/**
	 * Gets the bean class.
	 * 
	 * @return the bean class
	 */
	public Class<?> getBeanClass() {
		return beanClass;
	}

	/**
	 * Gets the bean name.
	 * 
	 * @return the bean name
	 */
	public String getBeanName() {
		return beanName;
	}

	/**
	 * Gets the qualifier.
	 * 
	 * @return the qualifier
	 */
	public Class<? extends Annotation> getQualifier() {
		return qualifier;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.atemsource.atem.api.infrastructure.meta.InitialzableByAnnotationBean
	 * #initialize(java.lang.annotation.Annotation)
	 */
	@Override
	public void initialize(BeanReference a) {
		this.beanClass = a.beanClass();
		this.beanName = a.beanName();
		this.qualifier = a.qualifier();
	}

	/**
	 * Sets the bean class.
	 * 
	 * @param beanClass
	 *            the new bean class
	 */
	public void setBeanClass(Class<?> beanClass) {
		this.beanClass = beanClass;
	}

	/**
	 * Sets the bean name.
	 * 
	 * @param beanName
	 *            the new bean name
	 */
	public void setBeanName(String beanName) {
		this.beanName = beanName;
	}

	/**
	 * Sets the qualifier.
	 * 
	 * @param qualifier
	 *            the new qualifier
	 */
	public void setQualifier(Class<? extends Annotation> qualifier) {
		this.qualifier = qualifier;
	}

	/**
	 * The Interface BeanReference.
	 */
	@Retention(RetentionPolicy.RUNTIME)
	@Target({ ANNOTATION_TYPE })
	public @interface BeanReference {

		/**
		 * Bean class.
		 * 
		 * @return the class
		 */
		Class<?> beanClass() default Object.class;

		/**
		 * Bean name.
		 * 
		 * @return the string
		 */
		String beanName() default "";

		/**
		 * Qualifier.
		 * 
		 * @return the class<? extends annotation>
		 */
		Class<? extends Annotation> qualifier() default Annotation.class;

	}
}
