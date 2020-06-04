package Exercici01;

public class Fase03 extends Fase02 {
	
	
	protected boolean traspas_verify;
	
	
	
	public Fase03(String nom, String cognom1, String cognom2, int dia, int mes, int any) {
		super(nom, cognom1, cognom2, dia, mes, any);
		// TODO Auto-generated constructor stub
	}
	
	protected boolean isTraspas_verify() {
		return traspas_verify;
	}

	protected void verifyAny() {
		if (this.getAny() % 4 == 0 && this.getAny() % 100 != 0 && this.getAny() % 400 == 0) {
			traspas_verify = true;
		} else {
			traspas_verify = false;
		} 
	}
	
	protected void printVerify() {
		System.out.println("\n");
		System.out.print("L’any de naixement és de traspàs??? ");
		if (traspas_verify) {
			System.out.println("Sí, segur!");
		} else {
			System.out.println("no, definitivament!");
		}
	}
	
	@Override
	public void printFase03() {
		System.out.println("-------- FASE 03 --------");
		System.out.println("Els anys de traspàs des de " + ANY_TRASPAS +
							" fins arriba el " + this.getAny() + ":");
		for (int c = 1; c <= comptador_anys; c++) {
			System.out.print((this.getANY_TRASPAS() + (c*4)) + " | ");
		}
		printVerify();
		System.out.println("-------------------------\n");
	}

}
