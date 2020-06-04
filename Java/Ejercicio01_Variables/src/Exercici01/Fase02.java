package Exercici01;

public class Fase02 extends Fase01 {
	
	protected final int ANY_TRASPAS = 1948;
	protected final int comptador_anys = (this.getAny() - ANY_TRASPAS) / 4;
	
	
	public Fase02(String nom, String cognom1, String cognom2, int dia, int mes, int any) {
		super(nom, cognom1, cognom2, dia, mes, any);
		// TODO Auto-generated constructor stub
	}


	protected int getANY_TRASPAS() {
		return ANY_TRASPAS;
	}

	protected int getComptador_anys() {
		return comptador_anys;
	}
	
	@Override
	public void printFase02() {
		System.out.println("-------- FASE 02 --------");
		System.out.println("Qauntitat de anys de traspàs\nhi ha entre: "
						+ ANY_TRASPAS + " i " + this.getAny() + " = " + comptador_anys);
		System.out.println("-------------------------\n");
		
	}
	
	

}
