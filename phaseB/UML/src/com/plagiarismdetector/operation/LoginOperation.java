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

/**
 * @author Siddhesh
 *
 */
public class LoginOperation implements IOperation {

	/**
	 * nuid of the user
	 */
	private String nuid;
	/**
	 * password of the user
	 */
	private String password;

	/**
	 * 
	 */
	public LoginOperation() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param nuid
	 * @param password
	 */
	public LoginOperation(String nuid, String password) {
		super();
		this.nuid = nuid;
		this.password = password;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.plagiarismdetector.operation.IOperation#perform()
	 */
	@Override
	public Object perform() {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * @return nuid
	 */
	public String getNuid() {
		return nuid;
	}

	/**
	 * @param nuid
	 */
	public void setNuid(String nuid) {
		this.nuid = nuid;
	}

	/**
	 * @return password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password
	 */
	public void setPassword(String password) {
		this.password = password;
	}

}
