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

import com.plagiarismdetector.operation.IOperation;

/**
 * a commitee member with access to cumulative reports
 *
 */
public class CommitteMember extends User {

	/**
	 * @param cumulative report operation
	 * @return an object with cumulative report representation i.e. university wide etc
	 */
	public Object getCumulativeReport(IOperation operation) {
		return operation.perform();
	}

}
