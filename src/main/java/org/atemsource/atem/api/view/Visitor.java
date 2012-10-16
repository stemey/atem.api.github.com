package org.atemsource.atem.api.view;

public interface Visitor<C> {
void visit(C context);
}
