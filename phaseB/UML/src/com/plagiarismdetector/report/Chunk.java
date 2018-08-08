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

/**
 * representation of copied code
 *
 */
public class Chunk {
	/**
	 * copied code start line no.
	 */
	private Integer from;
	/**
	 * copied code end line no.
	 */
	private Integer to;

	/**
	 * @param from
	 * @param to
	 */
	public Chunk(Integer from, Integer to) {
		super();
		this.from = from;
		this.to = to;
	}

	/**
	 * @return
	 */
	public Integer getFrom() {
		return from;
	}

	/**
	 * @param from
	 */
	public void setFrom(Integer from) {
		this.from = from;
	}

	/**
	 * @return
	 */
	public Integer getTo() {
		return to;
	}

	/**
	 * @param to
	 */
	public void setTo(Integer to) {
		this.to = to;
	}

}
