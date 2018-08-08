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
package com.plagiarismdetector.operation;

import com.plagiarismdetector.ast.DiffChecker;
import com.plagiarismdetector.miscellaneous.ComparisonBundle;
import com.plagiarismdetector.report.DiffStatistics;

/**
 * code compare operation
 *
 */
public class CompareOperation implements IOperation {

	/**
	 * a helper object
	 */
	private DiffChecker diffChecker;
	/**
	 * an input information bundle
	 */
	private ComparisonBundle comparisonBundle;

	/**
	 * @param diffChecker
	 * @param comparisonBundle
	 */
	public CompareOperation(DiffChecker diffChecker, ComparisonBundle comparisonBundle) {
		super();
		this.diffChecker = diffChecker;
		this.comparisonBundle = comparisonBundle;
	}

	/* (non-Javadoc)
	 * @see com.plagiarismdetector.operation.IOperation#perform()
	 */
	@Override
	public Object perform() {
		// TODO Auto-generated method stub
		DiffStatistics diffStatistics = diffChecker.diff(comparisonBundle);
		return diffStatistics;
	}

}
