# Esup-crous-annonces v1.0.0

Ce projet est une portlet distribué par la communauté Esup-Portail. Elle a pour but d'afficher les annonces logements et/ou emplois des services Lokaviz et Jobaviz du CROUS.

## Clé API

Pour avoir accès au WebService Lokaviz et Jobaviz vous aurez besoin d'une clé. Cette clé est nécessaire pour des statistique d'usage du service. 
Dans vos périodes de tests et déploiement vous pouvez utiliser la clé prévue à cet effet : `A_DEFINIR`

Une fois en production, il est nécessaire d'utiliser une clé qui vous est propre. Afin d'en obtenir une merci de contacter `contactcleportlet@crous-mobile.fr`


## Configuration

Vous pouvez choisir d'afficher des annonces localisées pour vos utilisateurs par défaut. 
Pour cela il faut renseigner les paramètres `place type` et `place code` dans le fichier config.properties de la portlet. 

Ci-dessous une liste de toutes les valeurs possibles pour ces deux paramètres.

### Place type

* 2 : Ville
* 3 : Département
* 4 : Région 

### Place code

#### 2 : Ville

| Code  | Ville |
| :---: | :---: |
| 80 | Nîmes |
| 77 | Agen |
| 18 | Aix-en-Provence |
| 24 | Ajaccio |
| 90 | Albi |
| 83 | Alençon |
| 19 | Amiens |
| 12 | Angers |
| 55 | Angoulème |
| 69 | Annecy |
| 139 | Antony |
| 100 | Arras |
| 86 | Aurillac |
| 151 | Auxerre |
| 60 | Avignon |
| 129 | Bastia |
| 76 | Bayonne / Anglet (Côte Basque-Adour) |
| 61 | Beauvais |
| 70 | Belfort |
| 20 | Besançon |
| 111 | Blois |
| 145 | Bobigny |
| 74 | Bordeaux |
| 138 | Boulogne-Billancourt |
| 102 | Boulogne-sur-Mer |
| 112 | Bourges |
| 50 | Brest |
| 120 | Brive |
| 142 | Cachan |
| 22 | Caen |
| 103 | Calais |
| 91 | Castres |
| 66 | Cayenne (Guyanne) |
| 140 | Cergy-Pontoise |
| 108 | Châlons-en-Champagne |
| 65 | Chambéry |
| 107 | Charleville-Mézières |
| 113 | Chartres |
| 114 | Châteauroux |
| 56 | Châtellerault |
| 82 | Cherbourg-Octeville |
| 13 | Cholet |
| 23 | Clermont-Ferrand |
| 96 | Colmar |
| 62 | Compiègne |
| 130 | Corte |
| 25 | Créteil |
| 26 | Dijon |
| 104 | Douai-Lens |
| 109 | Dunkerque |
| 119 | Egletons |
| 128 | Epinal |
| 98 | Evreux |
| 134 | Evry |
| 123 | Felletin |
| 59 | Grenoble |
| 125 | Guéret |
| 115 | Issoudun |
| 52 | Kourou (Guyanne) |
| 11 | La Roche-sur-Yon |
| 57 | La Rochelle |
| 124 | La Souterraine |
| 149 | Lannion |
| 64 | Laon |
| 16 | Laval |
| 122 | Le Creusot |
| 97 | Le Havre |
| 14 | Le Mans |
| 85 | Le Puy-en-Velay |
| 101 | Le Tampon |
| 28 | Lille |
| 29 | Limoges |
| 126 | Longwy |
| 48 | Lorient |
| 31 | Lyon |
| 133 | Mantes-la-Jolie |
| 143 | Marne-la-Vallée |
| 17 | Marseille |
| 136 | Massy |
| 110 | Maubeuge |
| 43 | Metz |
| 92 | Millau |
| 72 | Montbéliard |
| 84 | Montluçon |
| 40 | Montpellier |
| 87 | Moulins |
| 94 | Mulhouse |
| 42 | Nancy |
| 137 | Nanterre |
| 9 | Nantes |
| 44 | Nice |
| 58 | Niort |
| 53 | Orléans |
| 135 | Orsay |
| 41 | Paris |
| 75 | Pau |
| 78 | Périgueux |
| 95 | Perpignan |
| 68 | Pointe-à-Pitre (Guadeloupe) |
| 39 | Poitiers |
| 49 | Quimper |
| 46 | Rambouillet |
| 37 | Reims |
| 38 | Rennes |
| 35 | Rouen |
| 148 | Saint-Brieuc |
| 36 | Saint-Denis |
| 144 | Saint-Denis |
| 33 | Saint-Etienne |
| 132 | Saint-Germain-en-Laye |
| 10 | Saint-Nazaire |
| 116 | Saint-Omer |
| 99 | Saint-Pierre |
| 131 | Saint-Quentin-en-Yvelines |
| 127 | Sarreguemines |
| 51 | Schoelcher (Martinique) |
| 146 | Sénart |
| 79 | Sophia Antipolis |
| 47 | Strasbourg |
| 93 | Tarbes |
| 45 | Toulon |
| 32 | Toulouse |
| 54 | Tours |
| 106 | Troyes |
| 121 | Tulle |
| 63 | Valence |
| 117 | Valenciennes |
| 147 | Vannes |
| 30 | Versailles |
| 73 | Vesoul |
| 88 | Vichy |

#### 3 : Département

| Code | Département |
| :--: | :--------: |
|  1   | Ain |
|  2   | Aisne |
|  3   | Allier |
|  4   | Alpes de Hautes-Provence |
|  5   | Hautes-Alpes" |
|  6   | Alpes-Maritimes |
|  7   | Ardèche |
|  8   | Ardennes |
|  9   | Ariege |
|  10  | Aube |
|  11  | Aude |
|  12  | Aveyron |
|  13  | Bouches-Du-Rhône |
|  14  | Calvados |
|  15  | Cantal |
|  16  | Charente |
|  17  | Charente-Maritime |
|  18  | Cher |
|  19  | Correze |
|  20  | Corse-du-Sud |
|  20  | HauteCorse |
|  21  | Côte-d'Or |
|  22  | Côtes d'Armor |
|  23  | Creuse |
|  24  | Dordogne |
|  25  | Doubs |
|  26  | Drôme |
|  27  | Eure |
|  28  | Eure-et-Loir |
|  29  | Finistere |
|  30  | Gard |
|  31  | Haute-Garonne |
|  32  | Gers |
|  33  | Gironde |
|  34  | Hérault |
|  35  | Ille-et-Vilaine |
|  36  | Indre |
|  37  | Indre-et-Loire |
|  38  | Isère |
|  39  | Jura |
|  40  | Landes |
|  41  | Loir-er-Cher |
|  42  | Loire |
|  43  | Haute-Loire |
|  44  | Loire-Atlantique |
|  45  | Loiret |
|  46  | Lot |
|  47  | Lot-et-Garonne |
|  48  | Lozère |
|  49  | Maine-et-Loire |
|  50  | Manche |
|  51  | Marne |
|  52  | Haute-Marne |
|  53  | Mayenne |
|  54  | Meurthe-et-Moselle |
|  55  | Meuse |
|  56  | Morbihan |
|  57  | Moselle |
|  58  | Nièvre |
|  59  | Nord |
|  60  | Oise |
|  61  | Orne |
|  62  | Pas-de-Calais |
|  63  | Puy-de-Dôme |
|  64  | Pyrénées-Atlantique |
|  65  | Hautes-Pyrénées |
|  66  | Pyrénées-Orientales |
|  67  | Bas-Rhin |
|  68  | Haut-Rhin |
|  69  | Rhône |
|  70  | Haute-Saône |
|  71  | Saône-et-Loire |
|  72  | Sarthes |
|  73  | Savoie |
|  74  | Haute-Savoie |
|  75  | Paris |
|  76  | Seine-Maritime |
|  77  | Seine-et-Marne |
|  78  | Yvelines |
|  79  | Deux-Sèvres |
|  80  | Sommes |
|  81  | Tarn |
|  82  | Tarn-et-Garonne |
|  83  | Var |
|  84  | Vaucluse |
|  85  | Vendée |
|  86  | Viennes |
|  87  | Haute-Vienne |
|  88  | Vosges |
|  89  | Yonne |
|  90  | Territoire-de-Belfort |
|  91  | Essonne |
|  92  | Hauts-de-Seine |
|  93  | Seine-Saint-Denis |
|  94  | Val-de-marne |
|  95  | Val-d'oise |

#### 4 : Région

| Code | Région |
| :--: | :----: |
|  72  | Aquitaine |
|  83  | Auverge |
|  25  | Basse Normandie |
|  26  | Bourgogne |
|  53  | Bretagne |
|  24  | Centre |
|  21  | Champagne-Ardenne |
|  94  | Corse |
|  43  | Franche-Comté |
|  01  | Guadeloupe |
|  03  | Guyanne |
|  23  | Haute Normandie |
|  11  | Ile-de-France |
|  04  | La Réunion |
|  91  | Languedoc-Roussillon |
|  74  | Limousin |
|  41  | Lorraine |
|  02  | Martinique |
|  05  | Mayotte |
|  73  | Midi-Pyrénées |
|  31  | Nord-Pas-de-Calais |
|  52  | Pays de la Loire |
|  22  | Picardie |
|  54  | Poitou-Charentes |
|  93  | Provence alpes côte d'Azur |
|  82  | Rhone-Alpes |