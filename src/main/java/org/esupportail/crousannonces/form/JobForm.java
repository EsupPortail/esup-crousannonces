package org.esupportail.crousannonces.form;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;
import java.util.Vector;

import org.esupportail.crousannonces.utils.URLUtils;

public class JobForm {

	private int domaine;
	private Integer[] type;

	private Integer[] aideADomicile;
	private Integer[] animation;
	private Integer[] autres;
	private Integer[] bureau;
	private Integer[] hotellerie;
	private Integer[] vente;
	private Integer[] contrat;
	private int teletravail;
	private int typeLieu;
	private int codeLieu;
	private int townCode;
	private int departmentCode;
	private int regionCode;
	private String order;
	private boolean isSavedSearch;
	
	public String buildQueryString(Map<String, String> defaults) {
		
		Map<String, String> argumentMap = new HashMap<String, String>();
		Vector<String> arrayQueryStrings = new Vector<String>();
		
		argumentMap.putAll(defaults);
		
		if(this.domaine > 0) {
			switch(this.domaine) {
				case 4 : 
					if(this.aideADomicile.length > 0) {
						this.type = this.aideADomicile;
					}
					break;
				case 2 : 
					if(this.animation.length > 0) {
						this.type = this.animation;
					}
					break;
				case 1 : 
					if(this.autres.length > 0) {
						this.type = this.autres;
					}
					break;
				case 5 : 
					if(this.bureau.length > 0) {
						this.type = this.bureau;
					}
					break;
				case 3 : 
					if(this.hotellerie.length > 0) {
						this.type = this.hotellerie;
					}
					break;
				case 6 : 
					if(this.vente.length > 0) {
						this.type = this.vente;
					}
					break;
			}
			
			argumentMap.put("domaine", this.domaine+"");
			
			if(this.type != null) {
				arrayQueryStrings.add(URLUtils.arrayToQueryString("type", this.type));				
			}
		}
		if(this.contrat.length > 0) {
			arrayQueryStrings.add(URLUtils.arrayToQueryString("contrat", this.contrat));
		}
		if(this.teletravail > 0) {
			argumentMap.put("teletravail", this.teletravail+"");
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
	
	public int getDomaine() {
		return domaine;
	}
	public void setDomaine(int domaine) {
		this.domaine = domaine;
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
	public int getTeletravail() {
		return teletravail;
	}
	public void setTeletravail(int teletravail) {
		this.teletravail = teletravail;
	}
	public int getTypeLieu() {
		return typeLieu;
	}
	public void setTypeLieu(int typeLieu) {
		this.typeLieu = typeLieu;
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
	public boolean isSavedSearch() {
		return isSavedSearch;
	}
	public void setSavedSearch(boolean isSavedSearch) {
		this.isSavedSearch = isSavedSearch;
	}

	public Integer[] getAideADomicile() {
		return aideADomicile;
	}

	public void setAideADomicile(Integer[] aideADomicile) {
		this.aideADomicile = aideADomicile;
	}

	public Integer[] getAnimation() {
		return animation;
	}

	public void setAnimation(Integer[] animation) {
		this.animation = animation;
	}

	public Integer[] getAutres() {
		return autres;
	}

	public void setAutres(Integer[] autres) {
		this.autres = autres;
	}

	public Integer[] getBureau() {
		return bureau;
	}

	public void setBureau(Integer[] bureau) {
		this.bureau = bureau;
	}

	public Integer[] getHotellerie() {
		return hotellerie;
	}

	public void setHotellerie(Integer[] hotellerie) {
		this.hotellerie = hotellerie;
	}

	public Integer[] getVente() {
		return vente;
	}

	public void setVente(Integer[] vente) {
		this.vente = vente;
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
	
	public String[] fieldsToArray() throws IllegalAccessException {
		
		Field[] fields = getClass().getDeclaredFields();		
		String[] arr = new String[fields.length];
		
		for(int i=0; i<fields.length; i++) {
			arr[i] = fields[i].getName() + "=" + fields[i].get(this);
		}
	
		return arr;
	}
	
}
