/*******************************************************************************
 * Copyright 2018 Team-108
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License.  You may obtain a copy
 * of the License at
 * 
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.  See the
 * License for the specific language governing permissions and limitations under
 * the License.
 ******************************************************************************/
/**
 * 
 */
package com.plagiarismdetector.user;

import java.util.Set;

/**
 * Professor representation in the system
 */
public class Professor extends Faculty {
	/**
	 * TAs under a professor
	 */
	private Set<TeachingAssistant> teachingAssistants;

	/**
	 * @return teachingAssistants
	 */
	public Set<TeachingAssistant> getTeachingAssistants() {
		return teachingAssistants;
	}

	/**
	 * @param teachingAssistants
	 */
	public void setTeachingAssistants(Set<TeachingAssistant> teachingAssistants) {
		this.teachingAssistants = teachingAssistants;
	}

	/**
	 * @param teachingAssistant to be added
	 * @return success/failure flag
	 */
	public boolean addTeachingAssistant(TeachingAssistant teachingAssistant) {
		return teachingAssistants.add(teachingAssistant);
	}

	/**
	 * @param teachingAssistant to be removed
	 * @return success/failure flag
	 */
	public boolean removeTeachingAssistant(TeachingAssistant teachingAssistant) {
		return teachingAssistants.remove(teachingAssistant);
	}

}
