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

import com.plagiarismdetector.user.User;

/**
 * Add user operation
 *
 */
public class AddUserOperation implements IOperation {

	/**
	 * user to be added in the system
	 */
	private User user;
	/**
	 * 
	 */
	/**
	 * @param user
	 */
	public AddUserOperation(User user) {
		// TODO Auto-generated constructor stub
		this.setUser(user);
	}

	/* (non-Javadoc)
	 * @see com.plagiarismdetector.operation.IOperation#perform()
	 */
	@Override
	public Object perform() {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * @return user
	 */
	public User getUser() {
		return user;
	}

	/**
	 * @param user
	 */
	public void setUser(User user) {
		this.user = user;
	}

}
