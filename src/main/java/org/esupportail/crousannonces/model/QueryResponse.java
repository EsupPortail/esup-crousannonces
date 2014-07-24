package org.esupportail.crousannonces.model;

import java.net.URL;

import org.codehaus.jackson.annotate.JsonProperty;

public class QueryResponse {

	@JsonProperty("nb_results")
	private int nbResults;
	
	@JsonProperty("prev")
	private URL prev;
	
	@JsonProperty("next")
	private URL next;
	
	public int getNbResults() {
		return nbResults;
	}
	
	public URL getNext() {
		return next;
	}

	public URL getPrev() {
		return prev;
	}
	
	public String toString() {
		return "nb_results : " + this.nbResults + " | prev : " + this.prev + " | next : " + this.next;
	}
	
}
