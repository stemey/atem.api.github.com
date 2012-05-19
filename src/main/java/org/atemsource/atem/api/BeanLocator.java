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
package org.atemsource.atem.api;

import java.util.Collection;
import java.util.Set;

import org.atemsource.atem.api.BeanReferenceData.BeanReference;
import org.atemsource.atem.api.infrastructure.bean.Bean;

// TODO: Auto-generated Javadoc
/**
 * 
 * The BeanLocator is an application singleton that provides access to the
 * dependency injection container components/beans.
 * 
 * @author Stefan Meyer
 * 
 */
public abstract class BeanLocator {
	/**
	 * get access to di components from a plain pojo.
	 * 
	 * @return the singleton instance
	 */
	public static BeanLocator getInstance() {
		return INSTANCE;
	}

	private static BeanLocator INSTANCE;
	
	protected static void setInstance(BeanLocator beanLocator) {
		INSTANCE=beanLocator;
	}

	/**
	 * get a bean reference by the bean reference definition.
	 * 
	 * @param beanReferenceData
	 *            the bean reference data
	 * @return a bean reference
	 */
	public abstract Bean<?> getBean(BeanReferenceData beanReferenceData);

	/**
	 * get a bean reference by the bean's class.
	 * 
	 * @param <T>
	 *            the generic type
	 * @param beanType
	 *            the bean type
	 * @return a bean reference
	 */
	public abstract <T> Bean<T> getBean(Class<T> beanType);

	/**
	 * get a bean reference by the bean's name.
	 * 
	 * @param beanName
	 *            the bean name
	 * @return a bean reference
	 */
	public abstract Bean<?> getBean(String beanName);

	/**
	 * get a bean' name.
	 * 
	 * @param object
	 *            the object
	 * @return the beans's name
	 */
	public abstract String getBeanName(Object object);

	/**
	 * get all bean references for a certain bean class.
	 * 
	 * @param <T>
	 *            the generic type
	 * @param beanType
	 *            the bean type
	 * @return the beans' references
	 */
	public abstract <T> Set<Bean<T>> getBeans(Class<T> beanType);

	/**
	 * get the bean by the reference data.
	 * 
	 * @param beanReferenceData
	 *            the bean reference data
	 * @return the bean's instance
	 */
	public abstract Object getInstance(BeanReferenceData beanReferenceData);

	/**
	 * get the bean by the bean's class.
	 * 
	 * @param <T>
	 *            the generic type
	 * @param beanType
	 *            the bean type
	 * @return the bean's instance
	 */
	public abstract <T> T getInstance(Class<T> beanType);

	/**
	 * get the bean by the bean's name.
	 * 
	 * @param <T>
	 *            the generic type
	 * @param beanName
	 *            the bean name
	 * @return the bean's instance
	 */
	public abstract <T> T getInstance(String beanName);

	/**
	 * get all beans of a certain class.
	 * 
	 * @param <T>
	 *            the generic type
	 * @param beanType
	 *            the bean type
	 * @return the bean instances
	 */
	public abstract <T> Collection<T> getInstances(Class<T> beanType);

	/**
	 * remove the bean from the container.
	 * 
	 * @param bean
	 *            the bean
	 */
	public abstract void remove(Bean<?> bean);

}
