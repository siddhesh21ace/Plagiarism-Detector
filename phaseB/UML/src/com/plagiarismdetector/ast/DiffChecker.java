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
package com.plagiarismdetector.ast;

import java.util.List;

import com.plagiarismdetector.miscellaneous.ComparisonBundle;
import com.plagiarismdetector.report.DiffStatistics;
import com.plagiarismdetector.report.SimilarityMetric;

/**
 * Helper class for checking the difference between two pieces of code
 *
 */
public class DiffChecker {

	/**
	 * 
	 */
	public DiffChecker() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param comparisonBundle i.e. a bundle of input data
	 * @return a statistics with diff characteristics
	 */
	public DiffStatistics diff(ComparisonBundle comparisonBundle) {
		List<SimilarityMetric> similarityMetric = null;
		for (String s1 : comparisonBundle.getInputText1()) {
			for (String s2 : comparisonBundle.getInputText2()) {
				ASTTree tree1 = ASTParser.parse(s1);
				ASTTree tree2 = ASTParser.parse(s2);
				similarityMetric = compare(tree1, tree2);
			}
		}
		return new DiffStatistics(similarityMetric);
	}

	/**
	 * @param tree1 i.e. AST representation of input string 1
	 * @param tree2 i.e. AST representation of input string 2
	 * @return a List of similarity metric for input string combinations
	 */
	private List<SimilarityMetric> compare(ASTTree tree1, ASTTree tree2) {
		return null;
	}

}
