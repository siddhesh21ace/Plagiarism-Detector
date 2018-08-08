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
package com.plagiarismdetector.user;

import java.util.Set;

import com.plagiarismdetector.miscellaneous.Course;
import com.plagiarismdetector.operation.IOperation;

/**
 * Faculty member representation
 *
 */
public abstract class Faculty extends User {
	/**
	 * set of courses teaching
	 */
	private Set<Course> courses;

	/**
	 * @return courses
	 */
	public Set<Course> getCourses() {
		return courses;
	}

	/**
	 * @param courses
	 */
	public void setCourses(Set<Course> courses) {
		this.courses = courses;
	}
	
	/**
	 * @param compare operation
	 * @return a diff statistics
	 */
	public Object compare(IOperation operation) {
		return operation.perform();
	}

	/**
	 * @param operation
	 * @return formatted report of diff statistics
	 */
	public Object getReport(IOperation operation) {
		return operation.perform();
	}
}
