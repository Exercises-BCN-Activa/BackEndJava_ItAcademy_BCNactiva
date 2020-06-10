package Exercici02;

public class Exercici02_App {

	public static void main(String[] args) {
		
		Person [] estudiant = new Person[3];

		estudiant[0] = new Person();
		estudiant[0].setNom("@Faun0");
		estudiant[0].printFase01();
		estudiant[0].printFase02();
		estudiant[0].printFase03();
		
		estudiant[1] = new Person("Fauno");
		estudiant[1].printFase01();
		estudiant[1].printFase02();
		estudiant[1].printFase03();
		
		estudiant[2] = new Person("Fauno", "Guazina");
		estudiant[2].printFase01();
		estudiant[2].printFase02();
		estudiant[2].printFase03();
		estudiant[2].printFase04();
		
		
	}

}
