package Exercici01;

public class Fase04 extends Fase03 {
	protected String nom_complet = this.getNom() + " " + this.getCognom1() + " " + this.getCognom2();
	protected String data_naixement = String.valueOf(this.getDia()) + "/" + String.valueOf(this.getMes()) + "/" + String.valueOf(this.getAny());
	

	@Override
	public void printFase04() { 
		System.out.println("-------- FASE 04 --------");
		System.out.println("El meu nom és " + nom_complet); 
		System.out.println("Vaig néixer el " + data_naixement);
		if (this.isTraspas_verify()) {
			System.out.println("El meu any de naixement és de traspàs");
		} else {
			System.out.println("El meu any de naixement no és de traspàs");
		}
		System.out.println("-------------------------");
	}

}
