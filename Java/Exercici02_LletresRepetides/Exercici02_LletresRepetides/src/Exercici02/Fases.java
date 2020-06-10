package Exercici02;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

// Abstract class to not be able to instantiate

public abstract class Fases implements PrintFases {

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

// VARIABLES
	
	private String cognom = "Cognom";
	private String nom = "Nom";
	private String fullnom = this.getFullnom();
	

	final private Character [] vocal = {'A','E','I','O','U'}; 
	final private List <Character> vocals = Arrays.asList(vocal); 
	

// AUXILIARY METHOD FOR FASES METHODS OF EXERCISE 02	

	private List<Character> toListChar(String term) {
		List<Character> listCharFromString = new ArrayList<Character>();
		for (char lletra:term.toCharArray()) {
			listCharFromString.add(lletra);
		}
		
		return listCharFromString;
	}
	

// FASES METHODS OF EXERCISE 02
	
	@Override
	public void printFase01() {
		System.out.println("---------- FASE 01 ----------");
		
		char [] nom_array = new char[this.getFullnom().length()];
		
		for (int l=0; l<this.getFullnom().length(); l++) {
			nom_array[l] = this.getFullnom().charAt(l); 
		}
		
		for (char lletra:nom_array) {
			if (lletra != ' ') {
			System.out.print("'" + lletra + "' ");
			}
		}
			
		System.out.println("\n");
	}
	
	
	@Override
	public void printFase02() {
		System.out.println("---------- FASE 02 ----------");
	
		for (Character element:toListChar(this.getFullnom())) {
			 
			if (Character.isAlphabetic(element)) {
				
				if (vocals.contains(Character.toUpperCase(element))) {
					System.out.println(element + " = VOCAL");
					
				} else {
					System.out.println(element + " = CONSONTANT");
					}
				
			} else if (Character.isDigit(element)) {
				System.out.println(element + " - Els noms de persones no contenen números!");
				
			} else {
				System.out.println(element + " - Espai o caràcter especial!");
				}
			
		}
		System.out.println("\n");
	}
	
	@Override
	public void printFase03() {
		System.out.println("---------- FASE 03 ----------");
		
		HashMap<Character, Integer> lletrasVegadas = new HashMap<Character, Integer>();
		
		for (Character lletra : toListChar(this.getFullnom())) {
			Character l = Character.toUpperCase(lletra);
			if (lletrasVegadas.containsKey(l)) {
				lletrasVegadas.put(l, (lletrasVegadas.get(l) + 1));
				
			} else {
				if (l != ' ') {
					lletrasVegadas.put(l, 1);	
				}
				
			}
			
		}
		System.out.println(lletrasVegadas);
		System.out.println("\n");
		
	}
	
	@Override
	public void printFase04() {
		System.out.println("---------- FASE 04 ----------");
		
		List<Character> FullName = new ArrayList<Character>();
		FullName.addAll(toListChar(this.getNom()));
		FullName.add(' ');
		FullName.addAll(toListChar(this.getCognom()));
		System.out.println(FullName);
				
	}
	
	
	
}
