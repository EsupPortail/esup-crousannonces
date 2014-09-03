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
import java.util.HashMap;
import java.util.Map;

import org.codehaus.jackson.annotate.JsonProperty;

public class JobAdvertisement {
	
	@JsonProperty("id")
	private int id;
	@JsonProperty("reference")
	private String reference;
	@JsonProperty("domaine")
	private String field;
	@JsonProperty("type")
	private int type;
	@JsonProperty("contrat")
	private int contract;
	@JsonProperty("duree")
	private int length;
	@JsonProperty("type_duree")
	private String lengthType;
	@JsonProperty("volume")
	private int volume;
	@JsonProperty("remuneration")
	private long remuneration;
	@JsonProperty("periode")
	private String remunarationBase;
	@JsonProperty("type_renum")
	private String remunerationType;
	@JsonProperty("type_employeur")
	private String employerType;
	@JsonProperty("commune")
	private String city;
	@JsonProperty("cp")
	private int zipCode;
	@JsonProperty("displonibilite")
	private Date availabilityDate;
	@JsonProperty("publication")
	private Date publishingDate;
	@JsonProperty("url")
	private URL advertisement;
	
	public int getId() {
		return id;
	}
	public String getReference() {
		return reference;
	}
	public String getField() {
		return field;
	}
	public int getType() {
		return type;
	}
	public int getContract() {
		return contract;
	}
	public int getLength() {
		return length;
	}
	public String getLengthType() {
		return lengthType;
	}
	public int getVolume() {
		return volume;
	}
	public long getRemuneration() {
		return remuneration;
	}
	public String getRemunarationBase() {
		return remunarationBase;
	}
	public String getRemunerationType() {
		return remunerationType;
	}
	public String getEmployerType() {
		return employerType;
	}
	public String getCity() {
		return city;
	}
	public int getZipCode() {
		return zipCode;
	}
	public Date getAvailabilityDate() {
		return availabilityDate;
	}
	public Date getPublishingDate() {
		return publishingDate;
	}
	public URL getAdvertisement() {
		return advertisement;
	}
	
}
