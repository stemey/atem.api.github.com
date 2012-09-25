package org.atemsource.atem.api.extension;

import org.atemsource.atem.spi.EntityTypeCreationContext;

public interface EntityTypeRepositoryPostProcessor {
	void initialize(EntityTypeCreationContext entityTypeCreationContext);
}
