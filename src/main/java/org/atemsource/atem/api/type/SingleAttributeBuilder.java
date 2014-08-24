package org.atemsource.atem.api.type;

import org.atemsource.atem.api.attribute.Attribute;
import org.atemsource.atem.api.attribute.relation.SingleAttribute;

public interface SingleAttributeBuilder<T,B extends SingleAttributeBuilder<T, B>> {
	public B required(boolean required);

	public B type(Type<T> targetType);

	public B type(Class<T> javaType);

	public Attribute<?,T> create();

}
