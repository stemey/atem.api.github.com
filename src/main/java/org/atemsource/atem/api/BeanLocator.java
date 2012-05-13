package org.atemsource.atem.api;

import java.util.Collection;
import java.util.Set;

import org.atemsource.atem.api.BeanReferenceData.BeanReference;
import org.atemsource.atem.api.infrastructure.bean.Bean;


public abstract class BeanLocator
{

	public static BeanLocator getInstance()
	{
		return null;
	}

	public abstract Bean<?> getBean(BeanReferenceData beanReferenceData);

	public abstract <T> Bean<T> getBean(Class<T> beanType);

	public abstract Bean<?> getBean(String beanName);

	public abstract String getBeanName(Object object);

	public abstract <T> Set<? extends Bean<T>> getBeans(Class<T> beanType);

	public abstract Object getInstance(BeanReferenceData beanReferenceData);

	public abstract <T> T getInstance(Class<T> beanType);

	public abstract <T> T getInstance(String configurationId);

	public abstract <T> Collection<T> getInstances(Class<T> beanType);

	public abstract Collection<? extends Bean<?>> getUserBeans();

	public abstract boolean isDefined(BeanReference candidatesServiceBean);

	public abstract void remove(Bean<?> bean);

}