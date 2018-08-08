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
 * a user representation in the system
 */
package com.plagiarismdetector.user;

import com.plagiarismdetector.operation.IOperation;

public abstract class User {
	/**
	 * First Name
	 */
	private String firstName;
	/**
	 * Last Name
	 */
	private String lastName;
	/**
	 * NUID
	 */
	private String nuid;
	/**
	 * password
	 */
	private String password;
	/**
	 * email
	 */
	private String email;

	/**
	 * @return
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
	 * @return
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

	/**
	 * @return
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * @param firstName
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * @return
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * @param lastName
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * @return
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @param updated user object
	 * @return success/failure for the operation
	 */
	public boolean update(User user) {
		return false;
	}

	/**
	 * @param operation
	 * @return
	 */
	public Object login(IOperation operation) {
		// TODO Auto-generated method stub
		return operation.perform();
	}

}
