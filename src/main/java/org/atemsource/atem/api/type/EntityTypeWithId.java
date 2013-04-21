package org.atemsource.atem.api.type;

import java.io.Serializable;

import org.atemsource.atem.api.attribute.relation.SingleAttribute;

public interface EntityTypeWithId<J> extends EntityType<J> {
	SingleAttribute<? extends Serializable> getIdAttribute();
}
