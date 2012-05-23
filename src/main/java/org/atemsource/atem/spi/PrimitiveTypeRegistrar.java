package org.atemsource.atem.spi;

import org.atemsource.atem.api.type.PrimitiveType;

public interface PrimitiveTypeRegistrar
{
	public PrimitiveType<?>[] getTypes();
}
