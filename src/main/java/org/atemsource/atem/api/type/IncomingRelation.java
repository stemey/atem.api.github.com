package org.atemsource.atem.api.type;

import org.atemsource.atem.api.attribute.Attribute;

public interface IncomingRelation<J,R> extends Attribute<J,R>{
	public Attribute<?, ?> getAttribute();
}
