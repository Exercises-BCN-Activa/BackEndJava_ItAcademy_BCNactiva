package Exercici04;


public class Restaurant_App {

	public static void main(String[] args) {
		
		// SET MENU (one method of three)
		menu.setMenuPlatsPreus("Escalivada", 95);
		menu.setMenuPlatsPreus("Butifarra", 50);
		menu.setMenuPlatsPreus("Fideua", 75);
		menu.setMenuPlatsPreus("Calçotada", 120);
		menu.setMenuPlatsPreus("Escudella", 175);
		
		// SHOW THE MENU IN CONSOLE
		menu.printMenu();
		
		// TRIGGER ORDERING METHOD
		ordre.setOrdres();
		
		// CALCULATION ORDERS TOTAL VALUE
		caixer.calculaOrdre();
		
		// DISPLAY ORDERS MADE
		System.out.println("S'han ordenat els plats següents:");
		System.out.println(ordre.getOrdres());
		
		// VISUAL SEPARATOR IN CONSOLE 
		System.out.println("-------______-------");
		
		// DISPLAY TOTAL ORDERS VALUE
		System.out.println("L’import total de la comanda va ser:");
		System.out.printf("%s%d%s\n",">>>>>> € ",caixer.getTotal(),",00 <<<<<<");
		
		// DISPLAY THE AMOUT OF NOTES FOR EACH EURO VALUE
		caixer.quinsBitllets();

	}
}
