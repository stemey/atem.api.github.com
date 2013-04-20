package org.atemsource.atem.api.method;

import org.atemsource.atem.api.attribute.Attribute;
import org.atemsource.atem.api.type.EntityType;

public interface ParameterType extends EntityType<Object[]> {
	int getParameterCount();

	Attribute<?, ?> getParameter(int index);

	public Method getMethod();

	int indexOf(Attribute<?, ?> attribute);
}
