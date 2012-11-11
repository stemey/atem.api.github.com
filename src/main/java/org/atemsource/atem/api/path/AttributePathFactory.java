package org.atemsource.atem.api.path;

import org.atemsource.atem.api.type.EntityType;

public interface AttributePathFactory {
	AttributePath create(String path, EntityType<?> baseType);


}
