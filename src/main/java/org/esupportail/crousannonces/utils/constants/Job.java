package org.esupportail.crousannonces.utils.constants;

import java.util.HashMap;
import java.util.Map;

public class Job {
	
	public static final Map<Integer, String> FIELD = new HashMap<Integer, String>();
	public static final Map<Integer, String> TYPE = new HashMap<Integer, String>();
	public static final Map<Integer, String> CONTRACT_TYPE = new HashMap<Integer, String>();
	public static final Map<Integer, String> EMPLOYER_TYPE = new HashMap<Integer, String>();
	public static final Map<Integer, String> PLACE_FILTER = new HashMap<Integer, String>();
	public static final Map<Integer, String> PLACE_CODE = new HashMap<Integer, String>();
	
	static {
		Job.FIELD.put(4, "Aide à domicile");
		Job.FIELD.put(2, "Animation");
		Job.FIELD.put(1, "Autres domaine");
		Job.FIELD.put(5, "Bureau");
		Job.FIELD.put(3, "Hôtellerie");
		Job.FIELD.put(6, "Vente");
		
		Job.CONTRACT_TYPE.put(1, "CDD");
		Job.CONTRACT_TYPE.put(3, "CDI");
		Job.CONTRACT_TYPE.put(2, "Mission");
		
		Job.EMPLOYER_TYPE.put(1, "Administration");
		Job.EMPLOYER_TYPE.put(2, "Association");
		Job.EMPLOYER_TYPE.put(3, "CROUS");
		Job.EMPLOYER_TYPE.put(4, "Entreprise");
		Job.EMPLOYER_TYPE.put(5, "Particulier");
		
		Job.PLACE_FILTER.put(1, "Commune");
		Job.PLACE_FILTER.put(2, "Agglomération");
		Job.PLACE_FILTER.put(3, "Département");
		Job.PLACE_FILTER.put(4, "Région");
	}
	
}
