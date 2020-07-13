package Ex03_NomsCiutats;

import java.util.ArrayList;
import java.util.Collections;

public class Ex03_ArrayList {

		
	/**
	 * static void method that fills the six variables with city names,
	 * uses a GET method of the Ex03_Array class
	 * then console printing of the cities inserted in the order entered.
	 */
	public static void Fase01() {
		ciutat1 = Ex03_Array.getCiutat1();
		ciutat2 = Ex03_Array.getCiutat2();
		ciutat3 = Ex03_Array.getCiutat3();
		ciutat4 = Ex03_Array.getCiutat4();
		ciutat5 = Ex03_Array.getCiutat5();
		ciutat6 = Ex03_Array.getCiutat6();
		
		System.out.println("\nExercici en ARRAYLIST:".toUpperCase());
		System.out.println("FASE 01 -  " + ciutat1 + ", " + ciutat2 + ", " + ciutat3 + ", " + 
				ciutat4 + ", " + ciutat5 + ", " + ciutat6);
	}
				
	/**
	 * static void method that fills ArrayList with variables input cities,
	 * then uses method Collections.sort() to organize alphabetically,
	 * after all it prints in console each position of the array. 
	 */	
	public static void Fase02() {
		nomsCiutats.add(ciutat1);
		nomsCiutats.add(ciutat2);
		nomsCiutats.add(ciutat3);
		nomsCiutats.add(ciutat4);
		nomsCiutats.add(ciutat5);
		nomsCiutats.add(ciutat6);
		
		Collections.sort(nomsCiutats);
		
		System.out.println("FASE 02 - " + nomsCiutats);
	
	}
		
	/**
	 * static void method that fills new array of 6 positions with variables changed,
	 * to make the change use method replaceAll with regex conditioning
	 * to replacing the variations of chars A to char 4.
	 * Then prints the ordered list with the change.
	 */
	public static void Fase03() {	
		
		for (String n:nomsCiutats) {
			nomsCiut4ts.add(n.replaceAll("[AÀÁÂÃÄÅaàáâãäå]", "4"));
			
		}
		
		System.out.println("FASE 03 - " + nomsCiut4ts);
	}
		

	/**
	 * static void method that fills character ArrayLists with the letters of city names,
	 * uses FOR buckle to scan all cities in the city ArrayList,
	 * then create a temporary character ArrayList to store the letters of each city,
	 * inverts letter order by the Collections.reverse() method and
	 * prints on the console using a buckle FOR EACH,
	 * after all a SWITCH to clone the contents of the temporary char array
	 * to the char arrays of each city, through clone() method.
	 */
	@SuppressWarnings("unchecked")
	public static void Fase04() {
		
		System.out.print("FASE 04 - ");
		
		for (int pos=0; pos<nomsCiutats.size();pos++) {
			
			ArrayList<Character> nomCiutat = new ArrayList<Character>();
			
			for (int lletra=0; lletra<nomsCiutats.get(pos).length(); lletra++) {
				nomCiutat.add(nomsCiutats.get(pos).charAt(lletra));
			}
			
			Collections.reverse(nomCiutat);
			
			for (char l : nomCiutat) {
				System.out.print(l);	
			}
			System.out.print(", ");
			
			switch (pos) {
			case 0:
				nomCiutat1 = (ArrayList<Character>) nomCiutat.clone();
				break;
			case 1:
				nomCiutat1 = (ArrayList<Character>) nomCiutat.clone();
				break;
			case 2:
				nomCiutat1 = (ArrayList<Character>) nomCiutat.clone();
				break;
			case 3:
				nomCiutat1 = (ArrayList<Character>) nomCiutat.clone();
				break;
			case 4:
				nomCiutat1 = (ArrayList<Character>) nomCiutat.clone();
				break;
			case 5:
				nomCiutat1 = (ArrayList<Character>) nomCiutat.clone();
				break;
			}
		}	
	}

	
//	(GETTERS) - PRIVATE VARIABLES CAPTURE METHODS	
		
	protected static ArrayList<String> getNomsCiutats() {
		return nomsCiutats;
	}

	protected static ArrayList<String> getNomsCiut4ts() {
		return nomsCiut4ts;
	}

	protected static ArrayList<Character> getNomCiutat1() {
		return nomCiutat1;
	}

	protected static ArrayList<Character> getNomCiutat2() {
		return nomCiutat2;
	}

	protected static ArrayList<Character> getNomCiutat3() {
		return nomCiutat3;
	}

	protected static ArrayList<Character> getNomCiutat4() {
		return nomCiutat4;
	}

	protected static ArrayList<Character> getNomCiutat5() {
		return nomCiutat5;
	}

	protected static ArrayList<Character> getNomCiutat6() {
		return nomCiutat6;
	}



//	6 empty string variables to store city names
	private static String ciutat1, ciutat2, ciutat3, ciutat4, ciutat5, ciutat6;
	
//	ArrayList to store city names
	private static ArrayList<String> nomsCiutats = new ArrayList<String>();
	
//	ArrayList with name of modified cities (char A to char 4)
	private static ArrayList<String> nomsCiut4ts = new ArrayList<String>();
	
//	6 empty char type arrayLists to store letters of city names
	private static ArrayList<Character> nomCiutat1 = new ArrayList<Character>();
	private static ArrayList<Character> nomCiutat2 = new ArrayList<Character>();
	private static ArrayList<Character> nomCiutat3 = new ArrayList<Character>();
	private static ArrayList<Character> nomCiutat4 = new ArrayList<Character>();
	private static ArrayList<Character> nomCiutat5 = new ArrayList<Character>();
	private static ArrayList<Character> nomCiutat6 = new ArrayList<Character>();

}
