package Exercici04;

public class menu {

// 2 Arrays of 5 positions for storing meals (String) and prices (int)
	private static String [] menuPlats = new String[5];
	private static int [] menuPreus = new int[5];
	
	
// 6 METHODS (all Public) of interaction with the MENU class
	//-> GETTERS, SETTERS and PRINT(similar toString)
	
	/**
	 * METHOD[1/6] >
	 * GETTER ARRAY OF MEALS (STRING) >
	 * @return String [] menuPlats
	 */
	public static String[] getMenuPlats() {
		return menuPlats;
	}
	
	/**
	 * METHOD[2/6] >
	 * GETTER ARRAY OF PRICES (INT) >
	 * @return int [] menuPreus
	 */
	public static int[] getMenuPreus() {
		return menuPreus;
	}
	
	/**
	 * METHOD[3/6] >
	 * FIRST SETTER OF TWO ARRAYS (MEALS & PRICES) >
	 * generic menu filling
	 */
	public static void setMenuPlatsPreus() {
		for (int posicio=0; posicio<5; posicio++) {
			menuPlats[posicio] = "Plat 0" + (posicio+1);
			menuPreus[posicio] = (posicio+1)*55;
		}
	}

	/**
	 * METHOD[4/6] >
	 * SECOND SETTER OF TWO ARRAYS (MEALS & PRICES) >
	 * filling menu with specific position,
	 * user friendly position, starting with 1.
	 * @param posicio (integer number from 1 to 5)
	 * @param plat (string dish name, between double quotes "name")
	 * @param preu (integer dish price, without comma or zero decimals)
	 */
	public static void setMenuPlatsPreus(int posicio, String plat, int preu) {
		posicio -= 1;
		menuPlats[posicio] = plat;
		menuPreus[posicio] = preu;
	}
	
	/**
	 * METHOD[5/6] >
	 * THIRD SETTER OF TWO ARRAYS (MEALS & PRICES) >
	 * filling menu without specific position.
	 * The buckle FOR find a NULL position and insert the meals and price.
	 * @param plat (string dish name, between double quotes "name")
	 * @param preu (integer dish price, without comma or zero decimals)
	 */
	public static void setMenuPlatsPreus(String plat, int preu) {
		if (getMenuPlats()[0] == null) {
			setMenuPlatsPreus(1, plat, preu);
		}
		else if (getMenuPlats()[1] == null) {
			setMenuPlatsPreus(2, plat, preu);
		}
		else if (getMenuPlats()[2] == null) {
			setMenuPlatsPreus(3, plat, preu);
		}
		else if (getMenuPlats()[3] == null) {
			setMenuPlatsPreus(4, plat, preu);
		}
		else if (getMenuPlats()[4] == null) {
			setMenuPlatsPreus(5, plat, preu);
		}
		else {
			System.out.print("ERRO! El menú està ple" + 
			"utilitzeu el mètode que sobreposa una posició" + 
			"setMenuPlatsPreus(int posicio, String plat, int preu)");
		}
	}

	/**
	 * METHOD[6/6] >
	 * PRINT(similar toString) with tabulation to display in console,
	 * use of formating print to insert the tabs and header/footer,
	 * buckle FOR to print each meal with your specific price, with euro sign. 
	 */
	public static void printMenu() {
		
		System.out.println("\n------- MENU -------");
		System.out.printf("%10s\t%s\n","Menjars ","Preu");
		System.out.printf("%10s\t%s\n","----------","----");
		for (int m=0;m<5;m++) {
			System.out.printf("%10s\t%s%3d\n",menu.getMenuPlats()[m],"€",menu.getMenuPreus()[m]);
		}
		System.out.println("-------______-------\n");
	}
	

}
