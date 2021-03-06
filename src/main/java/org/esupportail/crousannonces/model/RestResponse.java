/**
 * Licensed to ESUP-Portail under one or more contributor license
 * agreements. See the NOTICE file distributed with this work for
 * additional information regarding copyright ownership.
 *
 * ESUP-Portail licenses this file to you under the Apache License,
 * Version 2.0 (the "License"); you may not use this file except in
 * compliance with the License. You may obtain a copy of the License at:
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.esupportail.crousannonces.model;

import java.util.List;

import org.codehaus.jackson.annotate.JsonProperty;

public class RestResponse {

	@JsonProperty("query")
	private QueryResponse query;

	@JsonProperty("results")
	private List results;
	
	public QueryResponse getQuery() {
		return query;
	}

	public List getResults() {
		return results;
	}
	
}
