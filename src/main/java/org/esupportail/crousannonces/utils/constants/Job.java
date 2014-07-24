package org.esupportail.crousannonces.utils.constants;

import java.util.HashMap;
import java.util.Map;

public class Job {
	
	public static final Map<Integer, String> FIELD = new HashMap<Integer, String>();
	public static final Map<Integer, String> CONTRACT_TYPE = new HashMap<Integer, String>();
	public static final Map<String, String> EMPLOYER_TYPE = new HashMap<String, String>();
	public static final Map<Integer, String> PLACE_FILTER = new HashMap<Integer, String>();
	public static final Map<Integer, String> PLACE_CODE = new HashMap<Integer, String>();
	
	public static final Map<Integer, String> TYPE_AIDE_A_DOMICILE = new HashMap<Integer, String>();
	public static final Map<Integer, String> TYPE_ANIMATION = new HashMap<Integer, String>();
	public static final Map<Integer, String> TYPE_AUTRES = new HashMap<Integer, String>();
	public static final Map<Integer, String> TYPE_BUREAU = new HashMap<Integer, String>();
	public static final Map<Integer, String> TYPE_HOTELLERIE = new HashMap<Integer, String>();
	public static final Map<Integer, String> TYPE_VENTE = new HashMap<Integer, String>();
	
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
		
		Job.EMPLOYER_TYPE.put("administration", "Administration");
		Job.EMPLOYER_TYPE.put("association", "Association");
		Job.EMPLOYER_TYPE.put("crous", "CROUS");
		Job.EMPLOYER_TYPE.put("entreprise", "Entreprise");
		Job.EMPLOYER_TYPE.put("particulier", "Particulier");
		
		Job.PLACE_FILTER.put(1, "Commune");
		Job.PLACE_FILTER.put(2, "Agglomération");
		Job.PLACE_FILTER.put(3, "Département");
		Job.PLACE_FILTER.put(4, "Région");

		Job.TYPE_AIDE_A_DOMICILE.put(8, "Aide aux devoirs");
		Job.TYPE_AIDE_A_DOMICILE.put(9, "Aide ménagère");
		Job.TYPE_AIDE_A_DOMICILE.put(28, "Aides aux personnes en difficulté");
		Job.TYPE_AIDE_A_DOMICILE.put(23, "Au pair");
		Job.TYPE_AIDE_A_DOMICILE.put(32, "Autres");
		Job.TYPE_AIDE_A_DOMICILE.put(46, "Bricolage");
		Job.TYPE_AIDE_A_DOMICILE.put(7, "Cours particuliers");
		Job.TYPE_AIDE_A_DOMICILE.put(36, "Garde d'animaux");
		Job.TYPE_AIDE_A_DOMICILE.put(6, "Garde d'enfant à domicile");

		Job.TYPE_ANIMATION.put(2, "Animateur");
		Job.TYPE_ANIMATION.put(37, "Animateur centre loisirs");
		Job.TYPE_ANIMATION.put(4, "Animateur sportif");
		Job.TYPE_ANIMATION.put(14, "Autres");
		Job.TYPE_ANIMATION.put(45, "Directeur centre loisirs");
		Job.TYPE_ANIMATION.put(42, "Guide touristique");
		Job.TYPE_ANIMATION.put(43, "Spectacle");
		Job.TYPE_ANIMATION.put(44, "Surveillant de baignade");

		Job.TYPE_AUTRES.put(1, "Divers");
		Job.TYPE_AUTRES.put(29, "Enquêtes");
		Job.TYPE_AUTRES.put(12, "Langues");
		Job.TYPE_AUTRES.put(19, "Ouvrier");
		Job.TYPE_AUTRES.put(22, "Personnel d'entretien");
		Job.TYPE_AUTRES.put(24, "Surveillance et gardiennage");
		Job.TYPE_AUTRES.put(3, "Travaux agricole");
		Job.TYPE_AUTRES.put(26, "Evénementiels");

		Job.TYPE_BUREAU.put(31, "Accueil");
		Job.TYPE_BUREAU.put(11, "Bureau");
		Job.TYPE_BUREAU.put(15, "Informatique");
		Job.TYPE_BUREAU.put(30, "Standard");

		Job.TYPE_HOTELLERIE.put(5, "Autres");
		Job.TYPE_HOTELLERIE.put(20, "Personnel d'accueil");
		Job.TYPE_HOTELLERIE.put(21, "Personnel d'entretien");
		Job.TYPE_HOTELLERIE.put(10, "Personnel de cuisine");
		Job.TYPE_HOTELLERIE.put(18, "Personnel de service");

		Job.TYPE_VENTE.put(38, "Animations commerciales");
		Job.TYPE_VENTE.put(27, "Autres");
		Job.TYPE_VENTE.put(25, "Caissier/cassière");
		Job.TYPE_VENTE.put(13, "Distribution de tracts");
		Job.TYPE_VENTE.put(40, "Inventaire");
		Job.TYPE_VENTE.put(39, "Livreur");
		Job.TYPE_VENTE.put(35, "Magasinage");
		Job.TYPE_VENTE.put(16, "Télé prospecteur");
		Job.TYPE_VENTE.put(17, "Vendeur");		
	}
	
}
