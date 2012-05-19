package org.atemsource.atem.api.infrastructure.bean;

// TODO: Auto-generated Javadoc
/**
 * Resolvable reference to a bean instance with additional functionality.
 * 
 * @param <T>
 *            the generic type
 * @author sven
 */
public interface Bean<T> {

	/**
	 * Exists in scope.
	 * 
	 * @return true, if the instance exists in the configured scope, false
	 *         otherwise
	 */
	public boolean existsInScope();

	/**
	 * Gets the.
	 * 
	 * @return the instance of this bean, creating it, if it does not exists
	 */
	public T get();

	/**
	 * Gets the bean class.
	 * 
	 * @return the bean class
	 */
	public Class<T> getBeanClass();

	/**
	 * Gets the bean name.
	 * 
	 * @return the bean name
	 */
	public String getBeanName();

	/**
	 * Checks if is scoped target.
	 * 
	 * @return true, if is scoped target
	 */
	public boolean isScopedTarget();

	/**
	 * Removes the.
	 */
	public void remove();

}
