/*******************************************************************************
 * Stefan Meyer, 2012 Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 ******************************************************************************/
package org.atemsource.atem.api.view;

import org.atemsource.atem.api.attribute.Attribute;

/**
 * 
 * This visitor can be used to visit a type its attributes, super and sub types. The state of the visiting can be put into a separate context object.
 *
 * @param <C>
 */
public interface ViewVisitor<C>
{

	/**
	 * visit an attribute of the curent type.
	 * @param context
	 * @param attribute
	 */
	void visit(C context, Attribute attribute);

	/**
	 * visit an attribute with a complex target type of the current type.
	 * @param context
	 * @param attribute
	 */
	void visit(C context, Attribute attribute, Visitor<C> targetTypeVisitor);

	/**
	 * visit a subtype of the current type.
	 * @param context
	 * @param view
	 * @param subViewVisitor call visit t visit the subtype's attributes and subtypes.
	 */
	void visitSubView(C context, View view, Visitor<C> subViewVisitor);


	/**
	 * visit a super type of the current type.
	 * @param context
	 * @param view
	 * @param subViewVisitor call visit to visit the supertype's attributes and sibling types.
	 */
	void visitSuperView(C context, View view, Visitor<C> superViewVisitor);
}
