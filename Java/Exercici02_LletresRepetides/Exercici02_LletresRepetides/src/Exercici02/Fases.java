package Exercici02;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
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

	

// AUXILIARY METHOD FOR FASES 2,3,4 METHODS OF EXERCISE 02	

	/**
	 * auxiliary method that turns string into list of characters.
	 * @param term - string variable
	 * @return - List Character
	 */
	private List<Character> toListChar(String term) {
		List<Character> listCharFromString = new ArrayList<Character>();
		for (char lletra:term.toCharArray()) {
			listCharFromString.add(lletra);
		}
		
		return listCharFromString;
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
	 * Uses buckle FOR to scan variable fullname converted to list using auxiliary method
	 * then uses a sequence of IF conditionals to check what each character is,
	 * to check each char uses an array of list-converted vowels.
	 * Print at the beginning to indicate method header and at the end for line skip.
	 */
	public void printFase02() {
		System.out.println("---------- FASE 02 ----------");
		
//		list of characters for checking the letters of the names
		Character [] vocal = 
			{'A','À','Á','Â','Ã','Ä','È','É','Ê','Ẽ','Ë','Ì','Í','Î','Ĩ',
				'Ò','Ó','Ô','Õ','Ö','Ù','Ú','Û','Ũ','Ü','E','I','O','U'};
		List <Character> vocals = Arrays.asList(vocal); 
		
//		buckle for to scan the full name
		for (Character element:toListChar(this.getFullnom())) {

//			if a letter enters this condition
			if (Character.isAlphabetic(element)) {
				
//				if a vowel falls in this condition
				if (vocals.contains(Character.toUpperCase(element))) {
					System.out.println(element + " = VOCAL");
					
//				if it is a consonant it falls into that condition
				} else {
					System.out.println(element + " = CONSONTANT");
				}

//			if a number falls in this condition	
			} else if (Character.isDigit(element)) {
				System.out.println(element + " - Els noms de persones no contenen números!");
				
//			if it is anything other than letter or number	
			} else {
				System.out.println(element + " - Espai o caràcter especial!");
				}
			
		}
		System.out.println("\n");
	}
	

	/**
	 * method that counts how many times each character of the full name appears.
	 * First creates a hashmap to register each character as a key
	 * and its number of appearances as a value, them Uses buckle FOR to scan the
	 * variable fullname converted to list using auxiliary method.
	 * Use conditional IF to see if the key already exists 
	 * and update its value, or insert new key / value
	 * Print at the beginning to indicate method header and at the end for line skip.
	 */
	public void printFase03() {
		System.out.println("---------- FASE 03 ----------");
		
//		hashmap creation
		HashMap<Character, Integer> lletrasVegadas = new HashMap<Character, Integer>();
		
//		FOR EACH to scan full name: char by char
		for (Character lletra : toListChar(this.getFullnom())) {
			
			//creation of variable with uppercase char to facilitate coding
			Character l = Character.toUpperCase(lletra);
			
//			conditional that evaluates if the char already exists in the hashmap and updates its value
			if (lletrasVegadas.containsKey(l)) {
				lletrasVegadas.put(l, (lletrasVegadas.get(l) + 1));
				
//			conditional creates key from char if it is not empty space	
			} else {
				if (l != ' ') {
					lletrasVegadas.put(l, 1);	
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
		
//		filling in the list using method .addAll(),
//		using auxiliary method parameter that converts string to list
		FullName.addAll(toListChar(this.getFullnom()));
		
		
		System.out.println(FullName);		
	}
	

	// VARIABLES
		
//	variables containing separately first and last name
	private String cognom = "Cognom";
	private String nom = "Nom";
		
//	variable containing first and last name together
	private String fullnom = this.getFullnom();
	
}
