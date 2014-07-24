package org.esupportail.crousannonces.model;

import org.codehaus.jackson.annotate.JsonProperty;

public class RestResponse {

	@JsonProperty("query")
	private QueryResponse query;

	@JsonProperty("results")
	private ResultObject results;
	
	public QueryResponse getQuery() {
		return query;
	}

	public ResultObject getResults() {
		return results;
	}
	
}
