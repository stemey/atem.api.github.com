package org.atemsource.atem.api.service;

import java.io.Serializable;

import org.atemsource.atem.api.attribute.relation.SingleAttribute;
import org.atemsource.atem.api.type.EntityType;


public interface IdentityAttributeService extends IdentityService
{
	public SingleAttribute<? extends Serializable> getIdAttribute(EntityType<?> entityType);
}
