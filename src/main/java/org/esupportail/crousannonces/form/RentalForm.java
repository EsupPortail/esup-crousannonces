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
package org.esupportail.crousannonces.form;

import java.util.HashMap;
import java.util.Map;
import java.util.Vector;

import org.esupportail.crousannonces.utils.URLUtils;

public class RentalForm {

	private Integer[] situation;
	private Integer[] type;
	private Integer[] contrat;
	private int   isPMR;
	private int   isLabel;
	private int   typeLieu;
	private int   codeLieu;
	private int   townCode;
	private int   departmentCode;
	private int   regionCode;
	private String order;
	private boolean savedSearch;

	public String buildQueryString(Map<String, String> defaults) {
	
		Map<String, String> argumentMap = new HashMap<String, String>();
		Vector<String> arrayQueryStrings = new Vector<String>();
		
		argumentMap.putAll(defaults);
		
		if(this.situation.length > 0) {
			arrayQueryStrings.add(URLUtils.arrayToQueryString("reflogsituation", this.situation));
		}
		if(this.type.length > 0) {
			arrayQueryStrings.add(URLUtils.arrayToQueryString("refloglogement", this.type));
		}
		if(this.contrat.length > 0) {
			arrayQueryStrings.add(URLUtils.arrayToQueryString("reflogmeuble", this.contrat));
		}
		if(this.isPMR > 0) {
			argumentMap.put("ispmr", this.isPMR + "");
		}
		if(this.isLabel > 0) {
			argumentMap.put("islabel", this.isLabel + "");
		}
		
		if(this.typeLieu > 0) {
			switch(this.typeLieu) {
				case 2:
					this.setCodeLieu(this.townCode);
					break;
				case 3:
					this.setCodeLieu(this.departmentCode);
					break;
				case 4:
					this.setCodeLieu(this.regionCode);
					break;
			}
			argumentMap.put("type_lieu", this.typeLieu + "");
			argumentMap.put("code_lieu", this.codeLieu + "");	
		}
		
		StringBuilder sb = new StringBuilder();
		
		sb.append(URLUtils.mapToString(argumentMap));
		for(String qs : arrayQueryStrings) {
			sb.append(qs);
		}
		
		return sb.toString();
	}
	
	public int getTypeLieu() {
		return typeLieu;
	}

	public void setTypeLieu(int typeLieu) {
		this.typeLieu = typeLieu;
	}

	public Integer[] getSituation() {
		return situation;
	}
	public void setSituation(Integer[] situation) {
		this.situation = situation;
	}
	public Integer[] getType() {
		return type;
	}
	public void setType(Integer[] type) {
		this.type = type;
	}
	public Integer[] getContrat() {
		return contrat;
	}
	public void setContrat(Integer[] contrat) {
		this.contrat = contrat;
	}
	public int getIsPMR() {
		return isPMR;
	}
	public void setIsPMR(int isPMR) {
		this.isPMR = isPMR;
	}
	public int getIsLabel() {
		return isLabel;
	}
	public void setIsLabel(int isLabel) {
		this.isLabel = isLabel;
	}
	public int getCodeLieu() {
		return codeLieu;
	}
	public void setCodeLieu(int codeLieu) {
		this.codeLieu = codeLieu;
	}
	public String getOrder() {
		return order;
	}
	public void setOrder(String order) {
		this.order = order;
	}
	public int getTownCode() {
		return townCode;
	}
	public void setTownCode(int townCode) {
		this.townCode = townCode;
	}
	public int getDepartmentCode() {
		return departmentCode;
	}
	public void setDepartmentCode(int departmentCode) {
		this.departmentCode = departmentCode;
	}
	public int getRegionCode() {
		return regionCode;
	}
	public void setRegionCode(int regionCode) {
		this.regionCode = regionCode;
	}
	public boolean isSavedSearch() {
		return savedSearch;
	}
	public void setSavedSearch(boolean saveSearch) {
		this.savedSearch = saveSearch;
	}
	
	public int codeLieuDecoder(int typeLieu) {
		switch(typeLieu) {
			case 2:
				return this.townCode;
			case 3:
				return this.departmentCode;
			case 4:
				return this.regionCode;
			default:
				return -1;
		} 
	}
	
}
