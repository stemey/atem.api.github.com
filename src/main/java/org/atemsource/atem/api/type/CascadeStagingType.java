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
package org.atemsource.atem.api.type;

/**
 * Defines how to cascade staging operations ({@link TypedEntity#publish()}, {@link TypedEntity#revert()}) to parents,
 * children, or related entities.
 * 
 * @author Thomas Jacob
 */
public enum CascadeStagingType
{
	/**
	 * Cascade both publications {@link TypedEntity#publish()} and reverts {@link TypedEntity#revert()}.
	 */
	ALL,

	/**
	 * Cascade neither publications {@link TypedEntity#publish()}, nor reverts {@link TypedEntity#revert()}. This is the
	 * default.
	 */
	NONE,

	/**
	 * Cascade publications only {@link TypedEntity#publish()}, do not cascade reverts {@link TypedEntity#revert()}.
	 */
	PUBLISH,

	/**
	 * Cascade reverts only {@link TypedEntity#revert()}, do not cascade publications {@link TypedEntity#publish()}.
	 */
	REVERT;

	/**
	 * Returns whether the type cascades to a given kind of staging operation.
	 * 
	 * @param publication Whether to return the cascade for a publication. <code>false</code> returns the cascade for a
	 * revert.
	 * @return Whether the type cascades.
	 */
	public boolean isCascading(final boolean publication)
	{
		return equals(publication ? PUBLISH : REVERT) || equals(ALL);
	}

	/**
	 * Returns whether publications {@link TypedEntity#publish()} are cascaded.
	 * 
	 * @return Whether publications {@link TypedEntity#publish()} are cascaded.
	 */
	public boolean isCascadingPublications()
	{
		return equals(PUBLISH) || equals(ALL);
	}

	/**
	 * Returns whether reverts {@link TypedEntity#revert()} are cascaded.
	 * 
	 * @return Whether reverts {@link TypedEntity#revert()} are cascaded.
	 */
	public boolean isCascadingReverts()
	{
		return equals(REVERT) || equals(ALL);
	}
}
