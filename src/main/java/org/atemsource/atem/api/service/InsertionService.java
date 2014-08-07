package org.atemsource.atem.api.service;

import java.io.Serializable;

import org.atemsource.atem.api.type.EntityType;

public interface InsertionService {
	public <O> Serializable insert(EntityType<O> entityType, InsertionCallback<O> callback);
	/**
	 * Checks if is persistent.
	 * 
	 * @param intermediate the intermediate
	 * @return true, if is persistent
	 */
	public <E> boolean isPersistent(EntityType<E> entityType, E entity);
}
