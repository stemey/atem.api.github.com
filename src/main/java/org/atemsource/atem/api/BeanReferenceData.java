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


public class BeanReferenceData implements InitialzableByAnnotationBean<BeanReferenceData.BeanReference>
{

	private String beanName;

	private Class<?> beanClass;

	private Class<? extends Annotation> qualifier;

	public Class<?> getBeanClass()
	{
		return beanClass;
	}

	public String getBeanName()
	{
		return beanName;
	}

	public Class<? extends Annotation> getQualifier()
	{
		return qualifier;
	}

	@Override
	public void initialize(BeanReference a)
	{
		this.beanClass = a.beanClass();
		this.beanName = a.beanName();
		this.qualifier = a.qualifier();
	}

	public void setBeanClass(Class<?> beanClass)
	{
		this.beanClass = beanClass;
	}

	public void setBeanName(String beanName)
	{
		this.beanName = beanName;
	}

	public void setQualifier(Class<? extends Annotation> qualifier)
	{
		this.qualifier = qualifier;
	}

	@Retention(RetentionPolicy.RUNTIME)
	@Target({ANNOTATION_TYPE})
	public @interface BeanReference
	{

		Class<?> beanClass() default Object.class;

		String beanName() default "";

		Class<? extends Annotation> qualifier() default Annotation.class;

	}
}
