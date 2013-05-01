package org.atemsource.atem.api.view;

import org.atemsource.atem.api.attribute.Attribute;

public class AttributeView {
private Attribute<?,?> attribute;
public AttributeView(Attribute<?, ?> attribute, View targetView) {
	super();
	this.attribute = attribute;
	this.targetView = targetView;
}
public Attribute<?, ?> getAttribute() {
	return attribute;
}
public View getTargetView() {
	return targetView;
}
private View targetView;
}
