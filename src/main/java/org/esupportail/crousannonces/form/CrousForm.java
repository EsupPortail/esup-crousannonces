package org.esupportail.crousannonces.form;

import java.lang.reflect.Field;

public abstract class CrousForm {

	public String[] fieldsToArray() throws IllegalAccessException {
		
		Field[] fields = getClass().getDeclaredFields();		
		String[] arr = new String[fields.length];
		
		for(int i=0; i<fields.length; i++) {
			arr[i] = fields[i].getName() + "=" + fields[i].get(this);
		}
	
		return arr;
	}	
}
