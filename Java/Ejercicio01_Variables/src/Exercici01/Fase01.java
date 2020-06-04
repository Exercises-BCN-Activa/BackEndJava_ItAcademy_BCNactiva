package Exercici01;

public class Fase01 extends Fase00 {
	
	
	public Fase01(String nom, String cognom1, String cognom2, int dia, int mes, int any) {
		super(nom, cognom1, cognom2, dia, mes, any);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void printFase01() {
		System.out.println("-------- FASE 01 --------");
		System.out.println(this.getNom() + " " + this.getCognom1() + " " + this.getCognom2());
		System.out.println(this.getDia() + "/" + this.getMes() + "/" + this.getAny());
		System.out.println("-------------------------\n");
		
	}
}
