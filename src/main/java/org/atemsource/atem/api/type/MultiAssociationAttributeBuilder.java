package org.atemsource.atem.api.type;

import org.atemsource.atem.api.attribute.Attribute;
import org.atemsource.atem.api.attribute.CollectionAttribute;
import org.atemsource.atem.api.attribute.annotation.Cardinality;


public interface MultiAssociationAttributeBuilder<R,T> extends SingleAssociationAttributeBuilder<T> {
	
	public SingleAssociationAttributeBuilder<T> cardinality(Cardinality cardinality);

	public SingleAssociationAttributeBuilder<T> composition(boolean composition);

	public Attribute<R,T> create();


}
