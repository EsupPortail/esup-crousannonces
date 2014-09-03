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

import java.net.URL;
import java.util.Date;
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
		return this.id;
	}
	public String getReference() {
		return this.reference;
	}
	public String getSituation() {
		return this.situation;
	}
	public int getType() {
		return this.type;
	}
	public long getSurface() {
		return this.surface;
	}
	public int getContract() {
		return this.contract;
	}
	public String getAddress() {
		return this.address;
	}
	public String getCity() {
		return this.city;
	}
	public Date getAvailability() {
		return this.availabilityDate;
	}
	public long getRent() {
		return this.rent;
	}
	public long getCharges() {
		return this.charges;
	}
	public int getServices() {
		return this.services;
	}
	public int getLabel() {
		return this.label;
	}
	public int getPmr() {
		return this.pmr;
	}
	public Date getPublishingDate() {
		return this.publishingDate;
	}
	public URL getThumbnail() {
		return this.thumbnail;
	}
	public URL getAdvertisement() {
		return this.advertisement;
	}
	
}
