/*******************************************************************************
 * Stefan Meyer, 2012
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 ******************************************************************************/
package org.atemsource.atem.api.meta;


import java.util.HashSet;
import java.util.Set;

import org.atemsource.atem.api.attribute.Attribute;
import org.atemsource.atem.api.attribute.annotation.Association;


/**
 * @author stemey ViewData is described by PojoEntityType // - InMemoryPersistenceService // -
 * InMemoryFindByTypedIdService // - InMemoryReverseAssociationService// // EntityTypePostprocessor processes EntityA//
 * - looks up view data by TypedId(annotation-class),// if none exists then creates a viewData and saves it - adds
 * attribute to viewData // Lookup view information:// - EntityA.entitType.getIncomingAssociation(ViewData.class)//
 */
public class ViewData
{
	private String name;

	@Association(targetType = Attribute.class)
	private Set<Attribute> attributes = new HashSet<Attribute>();

	public Set<Attribute> getAttributes()
	{
		return attributes;
	}

	public String getName()
	{
		return name;
	}

	public void setAttributes(Set<Attribute> attributes)
	{
		this.attributes = attributes;
	}

	public void setName(String name)
	{
		this.name = name;
	}

}
