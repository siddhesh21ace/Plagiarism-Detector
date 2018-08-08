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
package com.plagiarismdetector.report;

import java.util.List;

/**
 * output of comparison between codes
 */
public class DiffStatistics {
	/**
	 * List of similarity between pieces of code
	 */
	private List<SimilarityMetric> copiedLines;

	/**
	 * @param copiedLines
	 */
	public DiffStatistics(List<SimilarityMetric> copiedLines) {
		super();
		this.copiedLines = copiedLines;
	}

	/**
	 * @return list of SimilarityMetric
	 */
	public List<SimilarityMetric> getCopiedLines() {
		return copiedLines;
	}

	/**
	 * @param copiedLines
	 */
	public void setCopiedLines(List<SimilarityMetric> copiedLines) {
		this.copiedLines = copiedLines;
	}

}
