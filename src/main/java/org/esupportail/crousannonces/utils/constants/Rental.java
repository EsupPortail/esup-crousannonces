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
package org.esupportail.crousannonces.utils.constants;

import java.util.HashMap;
import java.util.Map;

public class Rental {
	
	public static final Map<Integer, String> SITUATION = new HashMap<Integer, String>();
	public static final Map<Integer, String> RENTAL_TYPE = new HashMap<Integer, String>();
	public static final Map<Integer, String> CONTRACT_TYPE = new HashMap<Integer, String>();
	public static final Map<Integer, String> PLACE_TYPE = new HashMap<Integer, String>();
	public static final Map<Integer, String> PLACE_CODE = new HashMap<Integer, String>();

	static {

		Rental.SITUATION.put(52, "Indépendant");
		Rental.SITUATION.put(53, "Chez un propriétaire");
		Rental.SITUATION.put(55, "En colocation");
		Rental.SITUATION.put(131, "En résidence CROUS");

		Rental.RENTAL_TYPE.put(4, "Chambre");
		Rental.RENTAL_TYPE.put(1, "Studio / T1");
		Rental.RENTAL_TYPE.put(146, "T1 bis");
		Rental.RENTAL_TYPE.put(188, "T2");
		Rental.RENTAL_TYPE.put(189, "T3");
		Rental.RENTAL_TYPE.put(225, "T4");
		Rental.RENTAL_TYPE.put(226, "T5");
		Rental.RENTAL_TYPE.put(330, "T6");
		Rental.RENTAL_TYPE.put(331, "T7");
		Rental.RENTAL_TYPE.put(333, "T8");
		
		Rental.CONTRACT_TYPE.put(5, "Meublé");
		Rental.CONTRACT_TYPE.put(6, "Non meublé");

		Rental.PLACE_TYPE.put(2, "Agglomération");
		Rental.PLACE_TYPE.put(3, "Département");
		Rental.PLACE_TYPE.put(4, "Région");
	}
	
}
