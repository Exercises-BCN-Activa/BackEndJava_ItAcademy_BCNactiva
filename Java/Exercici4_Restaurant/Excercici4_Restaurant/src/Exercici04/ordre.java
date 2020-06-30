package Exercici04;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ordre {
	
// list declaration to store orders
	private static List<String> ordres = new ArrayList<String>();
	
// SCANNER method declaration to capture inputs
	private static Scanner menjar = new Scanner(System.in);
	
// declaration of auxiliary variables for imputing and validating the order
	private static String plat;
	private static boolean verify = false;
	
	
// 5 METHODS (Private:3, Public:2) of interaction with the ORDRE class -> GETTERS, SETTERS and OTHERS
	
// METHOD[1/5] - GET THE LIST THAT STORES ALL ORDERS
	public static List<String> getOrdres() {
		return ordres;
	}
	
	
// METHOD[2/5] - SET ONE ORDER INPUT AND FORMAT ITS TEXT TO TITLE CASE AND REMOVE UNNECESSARY SPACES
	private static void setPlat() {
		System.out.print("\n"+"Que es vol per menjar: ");
		plat = menjar.nextLine().trim();
		if (plat.isEmpty()) {plat = "erro";}
		plat = plat.substring(0,1).toUpperCase() + plat.substring(1).toLowerCase(); 	
	}
	
// METHOD[3/5] - CHECKS IF THE ORDER INPUT EXISTS IN THE MENU
	// with method that ignores the case
	private static void verifyPlat() {
		for (String m:menu.getMenuPlats()) {
			if (m.equalsIgnoreCase(plat)) {
				verify = true;}
		}
	}

// METHOD[4/5] - ADD THE ORDER MADE TO THE LIST IF IT EXISTS, IF IT DOES NOT POINT AN ERROR	
	private static void ordrePlat() {
		if (verify) {
			ordres.add(plat);
			verify = false;
		} 
		else {System.out.println("\n"+"ERROR! el menjar demanat no existeix");}
	}
	
// METHOD[5/5] - CONGREGES THE AUXILIARY METHODS OF INPUT AND VALIDATION
	// AND CREATES SYSTEMATIC LOOPING OF ORDERS BY WHILE
	public static void setOrdres() {
		String pregunta;
		while (true) {
			setPlat();
			verifyPlat();
			ordrePlat();
			
			System.out.print("\n"+"Vol seguir demanant [si/no]: ");
			pregunta = menjar.nextLine().trim(); // asks if you want to keep ordering, eliminating unnecessary spaces
			if (pregunta.isEmpty()) {continue;} // even if the user doesn’t type anything the program understands how yes
			// BREAK condition only if the answer starts with the letter N, regardless of the case
			else if("n".equalsIgnoreCase(String.valueOf(pregunta.trim().charAt(0)))) {
				System.out.println("-------______-------");
				break;
			}	
		} 
	}
	
}
