package Exercici01;

public abstract class Fase00 {
	
	private String nom, cognom1, cognom2;
	private int dia, mes, any;
	
	
	public Fase00(String nom, String cognom1, String cognom2, int dia, int mes, int any) {
		super();
		this.nom = nom;
		this.cognom1 = cognom1;
		this.cognom2 = cognom2;
		this.dia = dia;
		this.mes = mes;
		this.any = any;
	}

	protected String getNom() {
		return nom;
	}

	protected void setNom(String nom) {
		this.nom = nom;
	}

	protected String getCognom1() {
		return cognom1;
	}

	protected void setCognom1(String cognom1) {
		this.cognom1 = cognom1;
	}

	protected String getCognom2() {
		return cognom2;
	}

	protected void setCognom2(String cognom2) {
		this.cognom2 = cognom2;
	}

	protected int getDia() {
		return dia;
	}

	protected void setDia(int dia) {
		this.dia = dia;
	}

	protected int getMes() {
		return mes;
	}

	protected void setMes(int mes) {
		this.mes = mes;
	}

	protected int getAny() {
		return any;
	}

	protected void setAny(int any) {
		this.any = any;
	}
	
	
	public void printFase01() {
		
	}
	
	
	public void printFase02() {
		
	}
	
	
	public void printFase03() {
		
	}
	
	
	public void printFase04() {
		
	}
	
}
