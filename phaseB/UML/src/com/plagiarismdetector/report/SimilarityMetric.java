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
package com.plagiarismdetector.report;

import java.util.List;

/**
 * a metric for showing diff characteristics between two pieces of code
 *
 */
public class SimilarityMetric {
	/**
	 * percentage of match
	 */
	private Float matchPercentage;
	/**
	 * matched line in first piece of code
	 */
	private List<Chunk> matchedLines1;
	/**
	 * matched line in second piece of code
	 */
	private List<Chunk> matchedLines2;

	/**
	 * @param matchPercentage
	 * @param matchedLines1
	 * @param matchedLines2
	 */
	public SimilarityMetric(Float matchPercentage, List<Chunk> matchedLines1, List<Chunk> matchedLines2) {
		super();
		this.matchPercentage = matchPercentage;
		this.matchedLines1 = matchedLines1;
		this.matchedLines2 = matchedLines2;
	}

	/**
	 * @return
	 */
	public List<Chunk> getMatchedLines1() {
		return matchedLines1;
	}

	/**
	 * @param matchedLines1
	 */
	public void setMatchedLines1(List<Chunk> matchedLines1) {
		this.matchedLines1 = matchedLines1;
	}

	/**
	 * @return
	 */
	public List<Chunk> getMatchedLines2() {
		return matchedLines2;
	}

	/**
	 * @param matchedLines2
	 */
	public void setMatchedLines2(List<Chunk> matchedLines2) {
		this.matchedLines2 = matchedLines2;
	}

	/**
	 * @return
	 */
	public Float getMatchPercentage() {
		return matchPercentage;
	}

	/**
	 * @param matchPercentage
	 */
	public void setMatchPercentage(Float matchPercentage) {
		this.matchPercentage = matchPercentage;
	}

}
