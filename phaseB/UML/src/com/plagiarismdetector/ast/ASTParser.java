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

/**
 * Helper class for creating and parsing AST from a text string
 *
 */
public class ASTParser {
	/**
	 * @param text
	 * @return an AST representation of a text i.e. code
	 */
	public static ASTTree parse(String text) {
		// some logic
		return new ASTTree(text);
	}
}
