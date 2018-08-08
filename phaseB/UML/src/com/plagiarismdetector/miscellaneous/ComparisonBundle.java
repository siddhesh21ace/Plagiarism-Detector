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
package com.plagiarismdetector.miscellaneous;

import java.util.List;

import com.plagiarismdetector.user.User;

/**
 * A wrapper class for mainataining input information
 *
 */
public class ComparisonBundle {
	/**
	 * input text 1
	 */
	private List<String> inputText1;
	/**
	 * input text 2
	 */
	private List<String> inputText2;
	/**
	 * nuid of student 1
	 */
	private String nuid1;
	/**
	 * nuid of student 2
	 */
	private String nuid2;
	/**
	 * user who is performing the check
	 */
	private User initiator;

	/**
	 * @return input text 1
	 */
	public List<String> getInputText1() {
		return inputText1;
	}

	/**
	 * @param inputText1
	 */
	public void setInputText1(List<String> inputText1) {
		this.inputText1 = inputText1;
	}

	/**
	 * @return input text 2
	 */
	public List<String> getInputText2() {
		return inputText2;
	}

	/**
	 * @param inputText2
	 */
	public void setInputText2(List<String> inputText2) {
		this.inputText2 = inputText2;
	}

	/**
	 * @return nuid 1
	 */
	public String getNuid1() {
		return nuid1;
	}

	/**
	 * @param nuid1
	 */
	public void setNuid1(String nuid1) {
		this.nuid1 = nuid1;
	}

	/**
	 * @return nuid 2
	 */
	public String getNuid2() {
		return nuid2;
	}

	/**
	 * @param nuid2
	 */
	public void setNuid2(String nuid2) {
		this.nuid2 = nuid2;
	}

	/**
	 * @return initiator
	 */
	public User getInitiator() {
		return initiator;
	}

	/**
	 * @param initiator
	 */
	public void setInitiator(User initiator) {
		this.initiator = initiator;
	}

}
