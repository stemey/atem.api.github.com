package org.atemsource.atem.api.type;

import org.atemsource.atem.api.attribute.annotation.Cardinality;
import org.atemsource.atem.api.attribute.relation.SingleAttribute;

public interface SingleAssociationAttributeBuilder<T> extends SingleAttributeBuilder<T,SingleAssociationAttributeBuilder<T>> {
	
	public SingleAssociationAttributeBuilder<T> cardinality(Cardinality cardinality);

	public SingleAssociationAttributeBuilder<T> composition(boolean composition);

	public SingleAttribute<T> create();

}
