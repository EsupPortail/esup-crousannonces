package org.esupportail.crousannonces.model;

import java.net.URL;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.codehaus.jackson.annotate.JsonProperty;

public class RentalAdvertisement {
	
	@JsonProperty("id")
	private int id;
	@JsonProperty("reference")
	private String reference;
	@JsonProperty("situation")
	private String situation;
	@JsonProperty("type")
	private int type;
	@JsonProperty("superficie")
	private long surface;
	@JsonProperty("contrat")
	private int contract;
	@JsonProperty("adresse")
	private String address;
	@JsonProperty("complement_adresse")
	private String extraAddress;
	@JsonProperty("commune")
	private String city;
	@JsonProperty("disponibilite")
	private Date availabilityDate;
	@JsonProperty("loyer")
	private long rent;
	@JsonProperty("charges")
	private long charges;
	@JsonProperty("services")
	private int services;
	@JsonProperty("label")
	private int label;
	@JsonProperty("pmr")
	private int pmr;
	@JsonProperty("publication")
	private Date publishingDate;
	@JsonProperty("thumbnail")
	private URL thumbnail;
	@JsonProperty("url")
	private URL advertisement;
	
	public int getId() {
		return id;
	}
	public String getReference() {
		return reference;
	}
	public String getSituation() {
		return situation;
	}
	public int getType() {
		return type;
	}
	public long getSurface() {
		return surface;
	}
	public int getContract() {
		return contract;
	}
	public String getAddress() {
		return address;
	}
	public String getCity() {
		return city;
	}
	public Date getAvailability() {
		return availabilityDate;
	}
	public long getRent() {
		return rent;
	}
	public long getCharges() {
		return charges;
	}
	public int getServices() {
		return services;
	}
	public int getLabel() {
		return label;
	}
	public int getPmr() {
		return pmr;
	}
	public Date getPublishingDate() {
		return publishingDate;
	}
	public URL getThumbnail() {
		return thumbnail;
	}
	public URL getAdvertisement() {
		return advertisement;
	}
	
}
