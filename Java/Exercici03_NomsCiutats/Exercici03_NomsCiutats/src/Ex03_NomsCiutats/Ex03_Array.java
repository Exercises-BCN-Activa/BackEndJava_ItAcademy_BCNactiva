package Ex03_NomsCiutats;

import java.util.Arrays;
import java.util.Scanner;

public class Ex03_Array {
	
	/**
	 * static void method that fills the six variables with city names,
	 * uses Scanner class to input information via console,
	 * closes scanner after 6 insertions,
	 * for each variable a buckle do/while to check the input,
	 * exit conditions are not to be empty or to be within a regex condition,
	 * after each input, treatment of the string to capitalizing the first character,
	 * then console printing of the cities inserted in the order entered.
	 */
	public static void Fase01() {
		
//		print information of what the user should do
		System.out.println("Introdueix els noms de sis ciutats:".toUpperCase()); //informació de l’usuari de què fer
		
//		BLOCK 1/6 - shows order of insertion
		do  {
			System.out.print("\n1 - "); 
			ciutat1 = consola.nextLine().trim();
		} while (ciutat1.isEmpty() || !ciutat1.matches("[a-zA-ZáàâãéèêíïóôõöúçñÁÀÂÃÉÈÍÏÓÔÕÖÚÇÑ· ']+$"));
		ciutat1 = ciutat1.substring(0,1).toUpperCase() + ciutat1.substring(1).toLowerCase();
		
//		BLOCK 2/6 - shows order of insertion
		do  {
			System.out.print("2 - "); // la capçalera es repeteix per a cada informació
			ciutat2 = consola.nextLine().trim(); // mètode també es repeteix les sis vegades
		} while (ciutat2.isEmpty() || !ciutat2.matches("[a-zA-ZáàâãéèêíïóôõöúçñÁÀÂÃÉÈÍÏÓÔÕÖÚÇÑ· ']+$"));
		ciutat2 = ciutat2.substring(0,1).toUpperCase() + ciutat2.substring(1).toLowerCase();
		
//		BLOCK 3/6 - shows order of insertion
		do  {
			System.out.print("3 - ");
			ciutat3 = consola.nextLine().trim();
		} while (ciutat3.isEmpty() || !ciutat3.matches("[a-zA-ZáàâãéèêíïóôõöúçñÁÀÂÃÉÈÍÏÓÔÕÖÚÇÑ· ']+$"));
		ciutat3 = ciutat3.substring(0,1).toUpperCase() + ciutat3.substring(1).toLowerCase();
		
//		BLOCK 4/6 - shows order of insertion
		do  {
			System.out.print("4 - ");
			ciutat4 = consola.nextLine().trim();
		} while (ciutat4.isEmpty() || !ciutat4.matches("[a-zA-ZáàâãéèêíïóôõöúçñÁÀÂÃÉÈÍÏÓÔÕÖÚÇÑ· ']+$"));
		ciutat4 = ciutat4.substring(0,1).toUpperCase() + ciutat4.substring(1).toLowerCase();
		
//		BLOCK 5/6 - shows order of insertion
		do  {
			System.out.print("5 - ");
			ciutat5 = consola.nextLine().trim();
		} while (ciutat5.isEmpty() || !ciutat5.matches("[a-zA-ZáàâãéèêíïóôõöúçñÁÀÂÃÉÈÍÏÓÔÕÖÚÇÑ· ']+$"));
		ciutat5 = ciutat5.substring(0,1).toUpperCase() + ciutat5.substring(1).toLowerCase();
		
//		BLOCK 6/6 - shows order of insertion
		do  {
			System.out.print("6 - ");
			ciutat6 = consola.nextLine().trim();			
		} while (ciutat6.isEmpty() || !ciutat6.matches("[a-zA-ZáàâãéèêíïóôõöúçñÁÀÂÃÉÈÍÏÓÔÕÖÚÇÑ· ']+$"));
		ciutat6 = ciutat6.substring(0,1).toUpperCase() + ciutat6.substring(1).toLowerCase();
		
//		Scanner class closer method
		consola.close();

		// results console printing
		System.out.println("\nExercici en ARRAY:".toUpperCase());
		System.out.print("FASE 01 - ");
		System.out.println(ciutat1 + ", " + ciutat2 + ", " + ciutat3 + ", " + 
						ciutat4 + ", " + ciutat5 + ", " + ciutat6);
		
		
		
	}
	

	/**
	 * static void method that fills array of 6 positions with variables input cities,
	 * then uses method Arrays.parallelSort() to organize alphabetically,
	 * after all it prints in console each position of the array
	 * separated by commas with a buckle for,
	 * uses an IF conditional to not put a comma after the last position.
	 */
	public static void Fase02() {
		
		arrayCiutats[0] = ciutat1;
		arrayCiutats[1] = ciutat2;
		arrayCiutats[2] = ciutat3;
		arrayCiutats[3] = ciutat4;
		arrayCiutats[4] = ciutat5;
		arrayCiutats[5] = ciutat6;
		
		Arrays.parallelSort(arrayCiutats);
		
		System.out.print("FASE 02 - ");
		for (int c=0;c<arrayCiutats.length;c++) { 
			if (c == arrayCiutats.length-1) {
				System.out.print(arrayCiutats[c]);
				System.out.println();
			} else {
				System.out.print(arrayCiutats[c] + ", ");
			}
		}
		
	}
	
	
	/**
	 * static void method that fills new array of 6 positions with variables changed,
	 * to make the change use method replaceAll with regex conditioning
	 * to replacing the variations of chars A to char 4.
	 * Then prints the ordered list with the change with a buckle for,  
	 * uses an IF conditional to not put a comma after the last position.
	 */
	public static void Fase03() {
		
		System.out.print("FASE 03 - "); 
		
		for (int c=0;c<arrayCiutatsModificades.length;c++) {
			arrayCiutatsModificades[c] = arrayCiutats[c].replaceAll("[AÀÁÂÃÄÅaàáâãäå]", "4"); 
			if (c == arrayCiutatsModificades.length-1) {
				System.out.print(arrayCiutatsModificades[c]);
				System.out.println();
			} else {
				System.out.print(arrayCiutatsModificades[c] + ", ");
			}
		}	
	}
	
	
	/**
	 * static void method that fills character arrays with the letters of city names,
	 * uses FOR buckle to scan all cities in the city array,
	 * then create a temporary character array to store the letters of each city,
	 * prints the inverted letters of each city on a console,
	 * after all a SWITCH to clone the contents of the temporary char array
	 * to the char arrays of each city, through auxiliary method.
	 */
	public static void Fase04() {
		

		System.out.print("FASE 04 - ");
		
		for (int pos=0; pos<arrayCiutats.length;pos++) {
			Character [] arrayCiutat = new Character[arrayCiutats[pos].length()];
			for (int lletra=0; lletra<arrayCiutats[pos].length(); lletra++) {
				arrayCiutat[lletra] = arrayCiutats[pos].charAt(lletra);
			}
			for (int lletra=arrayCiutat.length-1; lletra>=0; lletra--) {
				System.out.print(arrayCiutat[lletra]);
			}
			System.out.print(", ");
			
			switch (pos) {
			case 0:
				setArrayCiutat(arrayCiutat1, arrayCiutat);
				break;
			case 1:
				setArrayCiutat(arrayCiutat2, arrayCiutat);
				break;
			case 2:
				setArrayCiutat(arrayCiutat3, arrayCiutat);
				break;
			case 3:
				setArrayCiutat(arrayCiutat4, arrayCiutat);
				break;
			case 4:
				setArrayCiutat(arrayCiutat5, arrayCiutat);
				break;
			case 5:
				setArrayCiutat(arrayCiutat6, arrayCiutat);
				break;
			}
		}	
	}


	/**
	 * Auxiliary Method for cloning char array:
	 * @param array1 - array that receives the content,
	 * @param array2 - array to be cloned.
	 */
	private static void setArrayCiutat(Character[] array1, Character[] array2) {
		array1 = array2.clone();
	}
	
	
//	(GETTERS) - PRIVATE VARIABLES CAPTURE METHODS
	
	protected static String getCiutat1() {
		return ciutat1;
	}


	protected static String getCiutat2() {
		return ciutat2;
	}


	protected static String getCiutat3() {
		return ciutat3;
	}


	protected static String getCiutat4() {
		return ciutat4;
	}


	protected static String getCiutat5() {
		return ciutat5;
	}


	protected static String getCiutat6() {
		return ciutat6;
	}


	protected static String[] getArrayCiutats() {
		return arrayCiutats;
	}


	protected static String[] getArrayCiutatsModificades() {
		return arrayCiutatsModificades;
	}


	protected static Character[] getArrayCiutat1() {
		return arrayCiutat1;
	}


	protected static Character[] getArrayCiutat2() {
		return arrayCiutat2;
	}


	protected static Character[] getArrayCiutat3() {
		return arrayCiutat3;
	}


	protected static Character[] getArrayCiutat4() {
		return arrayCiutat4;
	}


	protected static Character[] getArrayCiutat5() {
		return arrayCiutat5;
	}


	protected static Character[] getArrayCiutat6() {
		return arrayCiutat6;
	}


//	6 empty string variables to store city names
	private static String ciutat1, ciutat2, ciutat3, ciutat4, ciutat5, ciutat6; 
	
//	Array to store city names
	private static String [] arrayCiutats = new String[6];
	
//	Array with name of modified cities (char A to char 4)
	private static String [] arrayCiutatsModificades = new String[arrayCiutats.length];
	
//	6 empty char type arrays to store letters of city names
	private static Character [] arrayCiutat1, arrayCiutat2, arrayCiutat3, arrayCiutat4, arrayCiutat5, arrayCiutat6;
	
//	instance of the Scanner class to capture input via console
	private static Scanner consola = new Scanner(System.in);
	
	
	

}
