package org.atemsource.atem.api.infrastructure.bean;

/**
 * Resolvable reference to a bean instance with additional functionality.
 * 
 * @author sven
 */
public interface Bean<T>
{

	/**
	 * @return true, if the instance exists in the configured scope, false otherwise
	 */
	public boolean existsInScope();

	/**
	 * @return the instance of this bean, creating it, if it does not exists
	 */
	public T get();

	public Class<T> getBeanClass();

	public String getBeanName();

	public boolean isScopedTarget();

	public void remove();

}
