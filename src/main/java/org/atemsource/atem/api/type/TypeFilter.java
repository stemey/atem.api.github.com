package org.atemsource.atem.api.type;

import java.util.Collection;

import org.atemsource.atem.api.type.EntityType;

public interface TypeFilter<J> {
	public Collection<? extends EntityType<J>> getEntityTypes();
}
