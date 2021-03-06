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
package org.atemsource.atem.spi;

// TODO: Auto-generated Javadoc
/**
 * The Class PhaseEvent.
 */
public class PhaseEvent {

	/** The context. */
	private EntityTypeCreationContext context;

	/** The phase. */
	private Phase phase;

	/**
	 * Instantiates a new phase event.
	 * 
	 * @param context
	 *            the context
	 * @param phase
	 *            the phase
	 */
	public PhaseEvent(EntityTypeCreationContext context, Phase phase) {
		super();
		this.context = context;
		this.phase = phase;
	}

	/**
	 * Gets the context.
	 * 
	 * @return the context
	 */
	public EntityTypeCreationContext getContext() {
		return context;
	}

	/**
	 * Gets the phase.
	 * 
	 * @return the phase
	 */
	public Phase getPhase() {
		return phase;
	}

}
