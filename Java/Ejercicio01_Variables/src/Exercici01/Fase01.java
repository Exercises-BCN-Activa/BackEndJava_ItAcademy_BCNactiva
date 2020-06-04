package Exercici01;

public class Fase01 extends Fase00 {
	
	protected Fase01() {
		this.setNom("Fulano");
		this.setCognom1("Ciclano");
		this.setCognom2("Beltrano");
		this.setDia(20);
		this.setMes(4);
		this.setAny(1985);
	}
	
	@Override
	public void printFase01() {
		System.out.println("-------- FASE 01 --------");
		System.out.println(this.getNom() + " " + this.getCognom1() + " " + this.getCognom2());
		System.out.println(this.getDia() + "/" + this.getMes() + "/" + this.getAny());
		System.out.println("-------------------------\n");
		
	}
}
