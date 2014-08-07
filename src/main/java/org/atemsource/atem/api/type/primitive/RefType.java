package org.atemsource.atem.api.type.primitive;

import java.io.Serializable;

import org.atemsource.atem.api.type.EntityType;
import org.atemsource.atem.api.type.PrimitiveType;

public interface RefType<T> extends PrimitiveType<T> {
	/**
	 * 
	 * @return the codeof the referenced EntityType
	 */
	public <R> EntityType<R>[] getTargetTypes();

	public Serializable getId(T value);

	public <R> EntityType<R> getTargetType(T value);

	public <R> String createValue(EntityType<R> entityType, Serializable id);

}
