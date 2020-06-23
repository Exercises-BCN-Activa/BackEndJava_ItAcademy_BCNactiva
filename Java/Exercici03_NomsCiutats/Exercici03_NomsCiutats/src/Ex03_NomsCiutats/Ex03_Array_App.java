package Ex03_NomsCiutats;

import java.util.Arrays;
import java.util.Scanner;

public class Ex03_Array_App {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
//FASE 01
		
		
		String ciutat1, ciutat2, ciutat3, ciutat4, ciutat5, ciutat6; // Crea sis variables tipu string buides 
		
		Scanner consola = new Scanner(System.in); // Demana per consola que s’introdueixin els noms.
		
		
		System.out.print("Introdueix els noms de sis ciutats:".toUpperCase()); //informació de l’usuari de què fer

		
		// Barcelona 		
		System.out.print("\n1 - "); // capçalera d’entrada d’informació
		ciutat1 = consola.next(); // mètode d’entrada d’informació
		
		// Madrid
		System.out.print("2 - "); // la capçalera es repeteix per a cada informació
		ciutat2 = consola.next(); // mètode també es repeteix les sis vegades
		
		// Valencia
		System.out.print("3 - ");
		ciutat3 = consola.next();
		
		// Malaga
		System.out.print("4 - ");
		ciutat4 = consola.next();
		
		// Cadis
		System.out.print("5 - ");
		ciutat5 = consola.next();
		
		// Santander
		System.out.print("6 - ");
		ciutat6 = consola.next();
		

		System.out.println("\nLes ciutats introduïdes són:".toUpperCase()); // Mostra per consola el nom de les 6 ciutats introduïdes
		System.out.print("FASE 01 - ");
		System.out.println(ciutat1 + ", " + ciutat2 + ", " + ciutat3 + ", " + 
						ciutat4 + ", " + ciutat5 + ", " + ciutat6);
		
		
		
		
//FASE 02

		String [] arrayCiutats = {ciutat1, ciutat2, ciutat3, ciutat4, ciutat5, ciutat6}; //l’informacio a un array
		Arrays.parallelSort(arrayCiutats); // l’ordenació del array
		
		System.out.print("FASE 02 - "); // imprimiu els articles de la llista ordenada, separats per comes
		for (int c=0;c<arrayCiutats.length;c++) { 
			if (c == arrayCiutats.length-1) { // IF per no fer coma al final
				System.out.print(arrayCiutats[c]);
				System.out.println();
			} else {
				System.out.print(arrayCiutats[c] + ", ");
			}
		}

		
//FASE 03

		String [] arrayCiutatsModificades = new String[arrayCiutats.length]; // creació d’ARRAY a partir d’informació alterada
		
		System.out.print("FASE 03 - "); // imprimiu els articles de la llista ordenada, canviant les lletres "A" per 4
		for (int c=0;c<arrayCiutatsModificades.length;c++) {
			arrayCiutatsModificades[c] = arrayCiutats[c].replaceAll("a", "4"); // mètode per canviar les lletres "A" per 4
			if (c == arrayCiutatsModificades.length-1) { // IF per no fer coma al final
				System.out.print(arrayCiutatsModificades[c]);
				System.out.println();
			} else {
				System.out.print(arrayCiutatsModificades[c] + ", ");
			}
		}
		
		
// FASE 04
		
		System.out.print("FASE 04 - ");

// aquest bloc es repeteix sis vegades per a cada ciutat		
		Character [] arrayCiutat1 = new Character[arrayCiutats[0].length()]; // creació un nou array per cada una de les ciutats
		for (int c=0; c<arrayCiutats[0].length(); c++) { // Ompliu els nous arrays lletra per lletra
			arrayCiutat1[c] = arrayCiutats[0].charAt(c);
		}
		for (int c=arrayCiutats[0].length()-1; c>=0; c--) { // Mostreu per consola els nous arrays amb els noms invertits
			System.out.print(arrayCiutat1[c]);
		}
		System.out.print(", "); // separador
		
// 2 vegada		
		Character [] arrayCiutat2 = new Character[arrayCiutats[1].length()];
		for (int c=0; c<arrayCiutats[1].length(); c++) {
			arrayCiutat2[c] = arrayCiutats[1].charAt(c);
		}
		for (int c=arrayCiutats[1].length()-1; c>=0; c--) {
			System.out.print(arrayCiutat2[c]);
		}
		System.out.print(", ");

// 3 vegada		
		Character [] arrayCiutat3 = new Character[arrayCiutats[2].length()];
		for (int c=0; c<arrayCiutats[2].length(); c++) {
			arrayCiutat3[c] = arrayCiutats[2].charAt(c);
		}
		for (int c=arrayCiutats[2].length()-1; c>=0; c--) {
			System.out.print(arrayCiutat3[c]);
		}
		System.out.print(", ");
		
// 4 vegada		
		Character [] arrayCiutat4 = new Character[arrayCiutats[3].length()];
		for (int c=0; c<arrayCiutats[3].length(); c++) {
			arrayCiutat4[c] = arrayCiutats[3].charAt(c);
		}
		for (int c=arrayCiutats[3].length()-1; c>=0; c--) {
			System.out.print(arrayCiutat4[c]);
		}
		System.out.print(", ");
		
// 5 vegada		
		Character [] arrayCiutat5 = new Character[arrayCiutats[4].length()];
		for (int c=0; c<arrayCiutats[4].length(); c++) {
			arrayCiutat5[c] = arrayCiutats[4].charAt(c);
		}
		for (int c=arrayCiutats[4].length()-1; c>=0; c--) {
			System.out.print(arrayCiutat5[c]);
		}
		System.out.print(", ");
		
// 6 vegada		
		Character [] arrayCiutat6 = new Character[arrayCiutats[5].length()];
		for (int c=0; c<arrayCiutats[5].length(); c++) {
			arrayCiutat6[c] = arrayCiutats[5].charAt(c);
		}
		for (int c=arrayCiutats[5].length()-1; c>=0; c--) {
			System.out.print(arrayCiutat6[c]);
		}		
		
		
		/*
		 * >>>> hauria de ser la impressió de la consola >>>>
		 * 
		 * LES CIUTATS INTRODUÏDES SÓN:
		 * FASE 01 - Barcelona, Madrid, Valencia, Malaga, Cadis, Santander
		 * FASE 02 - Barcelona, Cadis, Madrid, Malaga, Santander, Valencia
		 * FASE 03 - B4rcelon4, C4dis, M4drid, M4l4g4, S4nt4nder, V4lenci4
		 * FASE 04 - anolecraB, sidaC, dirdaM, agalaM, rednatnaS, aicnelaV
		 */

	}

}
