package org.esupportail.crousannonces.utils.constants;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public enum Department {

	Ain(1, "Ain", "Rhône-Alpes", "Bourg-en-bresse"),
	Aisne(2, "Aisne", "Picardie", "Laon"),
	Allier(3, "Allier", "Auvergne", "Moulins"),
	AlpesDeHautesProvence(4, "Alpes de Hautes-Provence", "Provence-Alpes-Côté d'Azur", "Digne"),
	HautesAlpes(5, "Hautes-Alpes", "Provence-Alpes-Côté d'Azur", "Gap"),
	AlpesMaritimes(6, "Alpes-Maritimes", "Provence-Alpes-Côté d'Azur", "Nice"),
	Ardeche(7, "Ardèche", "Rhône-Alpes", "Privas"),
	Ardennes(8, "Ardennes", "Champagne-Ardenne", "Charleville mézières"),
	Ariege(9, "Ariege", "Midi-Pyrénées", "Foix"),
	Aube(10, "Aube", "Champagne-Ardenne", "Troyes"),
	Aude(11, "Aude", "Languedoc-Roussillon", "Carcassonne"),
	Aveyron(12, "Aveyron", "Midi-Pyrénées", "Rodez"),
	BouchesDuRhone(13, "Bouches-Du-Rhône", "Provence-Alpes-Côte d'Azur", "Marseille"),
	Calvados(14, "Calvados", "Basse-Normandie", "Caen"),
	Cantal(15, "Cantal", "Auvergne", "Aurillac"),
	Charente(16, "Charente", "Poitou-Charente", "Angoulême"),
	CharenteMaritime(17, "Charente-Maritime", "Poitou-Charente", "La Rochelle"),
	Cher(18, "Cher", "Centre", "Bourges"),
	Correze(19, "Correze", "Limousin", "Tulle"),
	CorseDuSud(20, "Corse-du-Sud", "Corse", "Ajaccio"),
	HauteCorse(20, "HauteCorse", "Corse", "Bastia"),
	CoteDOr(21, "Cöte-d'Or", "Bourgogne", "Dijon"),
	CotesDArmor(22, "Côtes d'Armor", "Bretagne", "Saint-brieuc"),
	Creuse(23, "Creuse", "Limousin", "Gueret"),
	Dordogne(24, "Dordogne", "Aquitaine", "Périgueux"),
	Doubs(25, "Doubs", "Franche-Comté", "Besançon"),
	Drome(26, "Drôme", "Rhône-Alpes", "Valence"),
	Eure(27, "Eure", "Haute-Normandie", "Evreux"),
	EureEtLoir(28, "Eure-et-Loir", "Centre", "Chartres"),
	Finistere(29, "Finistere", "Bretagne", "Quimper"),
	Gard(30, "Gard", "Languedoc-Roussillon", "Nimes"),
	HauteGaronne(31, "Haute-Garonne", "Midi-Pyrénées", "Toulouse"),
	Gers(32, "Gers", "Midi-Pyrénées", "Auch"),
	Gironde(33, "Gironde", "Aquitaine", "Bordeaux"),
	Herault(34, "Hérault", "Languedoc-Roussillon", "Montpellier"),
	IlleEtVilaine(35, "Ille-et-Vilaine", "Bretagne", "Rennes"),
	Indre(36, "Indre", "Centre", "Châteauroux"),
	IndreEtLoire(37, "Indre-et-Loire", "Centre", "Tours"),
	Isere(38, "Isère", "Rhône-Alpes", "Grenoble"),
	Jura(39, "Jura", "Franche-Compté", "Lons le saunier"),
	Landes(40, "Landes", "Aquitaine", "Mont-de-marsan"),
	LoirEtCher(41, "Loir-er-Cher", "Centre", "Blois"),
	Loire(42, "Loire", "Rhône-Alpes", "Saint-etienne"),
	HauteLoire(43, "Haute-Loire", "Auvergne", "Le puy-en-velay"),
	LoireAtlantique(44, "Loire-Atlantique", "Pays de la Loire", "Nantes"),
	Loiret(45, "Loiret", "Centre", "Orléans"),
	Lot(46, "Lot", "Midi-Pyrénées", "Cahors"),
	LotEtGaronne(47, "Lot-et-Garonne", "Aquitaine", "Agen"),
	Lozere(48, "Lozère", "Languedoc-Roussillon", "Mende"),
	MaineEtLoire(49, "Maine-et-Loire", "Pays de la Loire", "Angers"),
	Manche(50, "Manche", "Basse-Normandie", "Saint-lô"),
	Marne(51, "Marne", "Champagne-Ardenne", "Châlons-en-champagne"),
	HauteMarnes(52, "Haute-Marne", "Champagne-Ardenne", "Chaumons"),
	Mayenne(53, "Mayenne", "Pays de la Loire", "Laval"),
	MeurtheEtMoselle(54, "Meurthe-et-Moselle", "Lorraine", "Nancy"),
	Meuse(55, "Meuse", "Lorraine", "Bar le duc"),
	Morbihan(55, "Morbihan", "Bretagne", "Vannes"),
	Moselle(57, "Moselle", "Lorraine", "Metz"),
	Nièvre(58, "Nièvre", "Bourgogne", "Nevers"),
	Nord(59, "Nord", "Nord-Pas-de-Calais", "Lille"),
	Oise(60, "Oise", "Picardie", "Beauvais"),
	Orne(61, "Orne", "Basse-Normandie", "Alençons"),
	PasDeCalais(62, "Pas-de-Calais", "Nord-Pas-de-Calais", "Arras"),
	PuyDeDome(63, "Puy-de-Dôme", "Auvergne", "Clermont-Ferrand"),
	PyreneesAtlantiques(64, "Pyrénées-Atlantique", "Aquitaine", "Pau"),
	HautesPyrenees(65, "Hautes-Pyrénées", "Midi-Pyrénées", "Tarbes"),
	PyreneesOrientales(66, "Pyrénées-Orientales", "Languedoc-Roussillon", "Perpignan"),
	BasRhin(67, "Bas-Rhin", "Alsace", "Strasbourg"),
	HautRhin(68, "Haut-Rhin", "Alsace", "Colmar"),
	Rhone(69, "Rhône", "Rhône-Alpes", "Lyon"),
	HauteSâone(70, "Haute-Sâone", "Franche-Comté", "Vesoul"),
	SaoneEtLoire(71, "Sâone-et-Loire", "Bourgogne", "Macon"),
	Sarthes(72, "Sarthes", "Pays de la Loire", "Le Mans"),
	Savoie(73, "Savoie", "Rhône-Alpes", "Chambery"),
	HauteSavoie(74, "Haute-Savoie", "Rhône-Alpes", "Annecy"),
	Paris(75, "Paris", "Ile de france", "Paris"),
	SeineMaritime(76, "Seine-Maritime", "Haute-Normandie", "Rouen"),
	SeineEtMarne(77, "Seine-et-Marne", "Ile de france", "Melun"),
	Yvelines(78, "Yvelines", "Ile de france", "Versailles"),
	DeuxSevres(79, "Deux-Sèvres", "Poitou-Charente", "Niort"),
	Sommes(80, "Sommes", "Picardie", "Amiens"),
	Tarn(81, "Tarn", "Midi-Pyrénées", "Albi"),
	TarnEtGaronne(82, "Tarn-et-Garonne", "Midi-Pyrénées", "Montauban"),
	Var(83, "Var", "Provence-Alpes-Côte d'Azur", "Toulon"),
	Vaucluse(84, "Vaucluse", "Provence-Alpes-Côte d'Azur", "Avignon"),
	Vendee(85, "Vendée", "Pays de la Loire", "La roche sur yon"),
	Viennes(86, "Viennes", "Limousin", "Poitiers"),
	HauteVienne(87, "Haute-Vienne", "Limousin", "Limoges"),
	Vosges(88, "Vosges", "Lorraine", "Epinal"),
	Yonne(89, "Yonne", "Bourgogne", "Auxerre"),
	TerritoireDeBelfort(90, "Territoire-de-Belfort", "Franche-Compté", "Belfort"),
	Essone(91, "Essonne", "Ile de france", "Evry"),
	HautsDeSeine(92, "Hauts-de-Seine", "Ile de france", "Nanterre"),
	SeineSaintDenis(93, "Seine-Saint-Denis", "Ile de france", "Bobigny"),
	ValDeMarne(94, "Val-de-marne", "Ile de france", "Creteil"),
	ValDOise(95, "Val-d'oise", "Ile de france", "Pontoise");

	public static final String DEPARTMENT_NUMERO = "[n_dpt]";
	public static final String DEPARTMENT_NAME = "[dpt_name]";
	public static final String AREA_NAME = "[area]";
	public static final String PREFECTURE = "[pref]";
	
	String _prefecture;
	Integer _department;
	String _departmentName;
	String _area;
	
	private Department(Integer department, String departmentName, String area, String prefecture) {
		_prefecture = prefecture;
		_department = department;
		_departmentName = departmentName;
		_area = area;
	}
	
	public String getPrefecture() {
		return _prefecture;
	}
	
	public Integer getDepartment() {
		return _department;
	}

	public String getDepartmentName() {
		return _departmentName;
	}
	
	public String getArea() {
		return _area;
	}

	public static Map getList() {
		Map<Integer, String> list = new HashMap<Integer,String>();
		for (Department value : Department.values()) {
			list.put(value.getDepartment(), value.getDepartmentName());
		}
		return list;
	}
	
}