package org.atemsource.atem.api.extension;

import org.atemsource.atem.api.attribute.relation.SingleAttribute;
import org.atemsource.atem.api.type.EntityType;


public interface MetaAttributeService
{

	<J> SingleAttribute<J> addSingleMetaAttribute(String name, EntityType<?> holderType, EntityType<J> metaDataType);

	<J> SingleAttribute<J> getMetaAttribute(String name);

	Object getMetaData(String name, Object holder);

}