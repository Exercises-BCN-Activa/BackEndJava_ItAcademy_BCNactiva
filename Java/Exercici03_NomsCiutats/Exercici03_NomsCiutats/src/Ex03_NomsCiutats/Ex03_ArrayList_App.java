package Ex03_NomsCiutats;

import java.util.ArrayList;
import java.util.Collections;

public class Ex03_ArrayList_App {

	public static void main(String[] args) {

//FASE 01
		
		String ciutat1, ciutat2, ciutat3, ciutat4, ciutat5, ciutat6;
		ciutat1 = "Barcelona";
		ciutat2 = "Madrid";
		ciutat3 = "Valencia";
		ciutat4 = "Malaga";
		ciutat5 = "Cadis";
		ciutat6 = "Santander";
		
		System.out.println(ciutat1 + ", " + ciutat2 + ", " + ciutat3 + ", " + 
				ciutat4 + ", " + ciutat5 + ", " + ciutat6);

		
//FASE 02		
		ArrayList<String> nomsCiutats = new ArrayList<String>();
		
		nomsCiutats.add(ciutat1);
		nomsCiutats.add(ciutat2);
		nomsCiutats.add(ciutat3);
		nomsCiutats.add(ciutat4);
		nomsCiutats.add(ciutat5);
		nomsCiutats.add(ciutat6);
		
		Collections.sort(nomsCiutats);
		
		System.out.println(nomsCiutats);
		
//FASE 03
		
		ArrayList<String> nomsCiut4ts = new ArrayList<String>();
		
		for (String n:nomsCiutats) {
			nomsCiut4ts.add(n.replaceAll("a", "4"));
			
		}
		
		System.out.println(nomsCiut4ts);
		
//FASE 04
		ArrayList<Character> nomsCiutat1 = new ArrayList<Character>();
		for (int c=0; c<ciutat1.length(); c++) {
			nomsCiutat1.add(ciutat1.charAt(c));
		}
		System.out.print(nomsCiutat1 + " - ");
		Collections.reverse(nomsCiutat1);
		System.out.println(nomsCiutat1);
		
		
		ArrayList<Character> nomsCiutat2 = new ArrayList<Character>();
		for (int c=0; c<ciutat2.length(); c++) {
			nomsCiutat2.add(ciutat2.charAt(c));
		}
		System.out.print(nomsCiutat2 + " - ");
		Collections.reverse(nomsCiutat2);
		System.out.println(nomsCiutat2);
		
		
		ArrayList<Character> nomsCiutat3 = new ArrayList<Character>();
		for (int c=0; c<ciutat3.length(); c++) {
			nomsCiutat3.add(ciutat3.charAt(c));
		}
		System.out.print(nomsCiutat3 + " - ");
		Collections.reverse(nomsCiutat3);
		System.out.println(nomsCiutat3);
		
		
		ArrayList<Character> nomsCiutat4 = new ArrayList<Character>();
		for (int c=0; c<ciutat4.length(); c++) {
			nomsCiutat4.add(ciutat4.charAt(c));
		}
		System.out.print(nomsCiutat4 + " - ");
		Collections.reverse(nomsCiutat4);
		System.out.println(nomsCiutat4);
		
		
		ArrayList<Character> nomsCiutat5 = new ArrayList<Character>();
		for (int c=0; c<ciutat5.length(); c++) {
			nomsCiutat5.add(ciutat5.charAt(c));
		}
		System.out.print(nomsCiutat5 + " - ");
		Collections.reverse(nomsCiutat5);
		System.out.println(nomsCiutat5);
		
		
		ArrayList<Character> nomsCiutat6 = new ArrayList<Character>();
		for (int c=0; c<ciutat6.length(); c++) {
			nomsCiutat6.add(ciutat6.charAt(c));
		}
		System.out.print(nomsCiutat6 + " - ");
		Collections.reverse(nomsCiutat6);
		System.out.println(nomsCiutat6);		
		
		
	}

}
