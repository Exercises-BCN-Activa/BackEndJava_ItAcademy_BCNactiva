package Exercici02;

import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;

// Abstract class to not be able to instantiate

public abstract class Fases {

// CONTRUCTORS METHODS
	
	public Fases() {
		super();
	}
	
	public Fases(String nom) {
		super();
		this.nom = nom;
	}
		
	public Fases(String nom, String cognom) {
		super();
		this.nom = nom;
		this.cognom = cognom;
	}

// GETS & SETERS METHODS
	
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	
	public String getCognom() {
		return cognom;
	}

	public void setCognom(String cognom) {
		this.cognom = cognom;
	}
	
	
	public String getFullnom() {
		this.setFullnom();
		return fullnom;
	}

	public void setFullnom() {
		this.fullnom = this.getNom();
		if (this.getCognom() != "Cognom") {
			this.fullnom += " " + this.cognom;
			
		}
	}
	
	public void setFullnom(String nom, String cognom) {
		this.nom = nom;
		this.cognom = cognom;
		
	}


// FASES METHODS OF EXERCISE 02
	

	/**
	 * method that fills char array with full available name
	 * first create the array and establishes its dimension.
	 * then in a FOR buckle fill array and display each 
	 * character separated by commas and in quotes in the console,
	 * conditional IF not to print space character.
	 * Print at the beginning to indicate method header and at the end for line skip.
	 */
	public void printFase01() {
		System.out.println("---------- FASE 01 ----------");
		
		char [] nom_array = new char[this.getFullnom().length()];
		
		for (int l=0; l<this.getFullnom().length(); l++) {
			nom_array[l] = this.getFullnom().charAt(l); 
			if (nom_array[l] != ' ') {
				System.out.print("'" + nom_array[l] + "' ");
			}
		}
		
		System.out.println("\n");
	}
	
	

	/**
	 * Method that evaluates whether each character is a consonant, vowel or something else.
	 * Uses buckle FOR to scan variable fullname,
	 * then uses a sequence of IF conditionals to check what each character is,
	 * to check each char uses an array of list-converted vowels.
	 * Print at the beginning to indicate method header and at the end for line skip.
	 */
	public void printFase02() {
		System.out.println("---------- FASE 02 ----------"); 
		
//		buckle for to scan the full name		
		for (int l=0; l<this.getFullnom().length(); l++) {
			Character lletra = this.getFullnom().toUpperCase().charAt(l); 

//			if a letter enters this condition
			if (Character.isAlphabetic(lletra)) {
				
//				if a vowel falls in this condition
				if (Character.toString(lletra).matches("[AÀÁÂÃÄEÈÉÊẼËIÌÍÎĨOÒÓÔÕÖUÙÚÛŨÜ]")) {
					System.out.println(lletra + " = VOCAL");
					
//				if it is a consonant it falls into that condition
				} else {
					System.out.println(lletra + " = CONSONTANT");
				}

//			if a number falls in this condition	
			} else if (Character.isDigit(lletra)) {
				System.out.println(lletra + " - Els noms de persones no contenen números!");
				
//			if it is anything other than letter or number	
			} else {
				System.out.println(lletra + " - Espai o caràcter especial!");
				}
			
		}
		System.out.println("\n");
	}
	

	/**
	 * method that counts how many times each character of the full name appears.
	 * First creates a hashmap to register each character as a key
	 * and its number of appearances as a value,
	 * them Uses buckle FOR to scan the variable fullname.
	 * Use conditional IF to see if the key already exists 
	 * and update its value, or insert new key / value
	 * Print at the beginning to indicate method header and at the end for line skip.
	 */
	public void printFase03() {
		System.out.println("---------- FASE 03 ----------");
		
//		hashmap creation
		HashMap<Character, Integer> lletrasVegadas = new HashMap<Character, Integer>();
		
//		FOR to scan full name: char by char
		for (int l=0; l<this.getFullnom().length(); l++) {
			
			//creation of variable with uppercase char to facilitate coding
			Character lletra = Character.toUpperCase(this.getFullnom().charAt(l));
			
//			conditional that evaluates if the char already exists in the hashmap and updates its value
			if (lletrasVegadas.containsKey(lletra)) {
				lletrasVegadas.put(lletra, (lletrasVegadas.get(lletra) + 1));
				
//			conditional creates key from char if it is not empty space	
			} else {
				if (lletra != ' ') {
					lletrasVegadas.put(lletra, 1);	
				}	
			}
		}
//		shows letters and their repetition values on the console
		System.out.println(lletrasVegadas);
		System.out.println("\n");
	}
	

	/**
	 * method that creates a list with full name available,
	 * if the person have a first and last name add a blank space between them,
	 * then print the list of separate letters on the console.
	 * Print at the beginning to indicate method header and at the end for line skip.
	 */
	public void printFase04() {
		System.out.println("---------- FASE 04 ----------");
		
//		character list creation
		List<Character> FullName = new ArrayList<Character>();
		
//		filling the list using method .add() char by char using a FOR
		for (int l=0; l<this.getFullnom().length(); l++) {
			FullName.add(this.getFullnom().charAt(l));
		}
		
		System.out.println(FullName);		
	}
	

	// VARIABLES
		
//	variables containing separately first and last name
	private String cognom = "Cognom";
	private String nom = "Nom";
		
//	variable containing first and last name together separated by space
	private String fullnom = this.getFullnom();
	
}
