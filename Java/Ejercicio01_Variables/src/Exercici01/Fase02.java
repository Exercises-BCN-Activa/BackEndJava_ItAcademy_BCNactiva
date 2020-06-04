package Exercici01;

public class Fase02 extends Fase01 {
	protected final int ANY_TRASPAS = 1948;
	protected final int comptador_anys = (this.any - ANY_TRASPAS) / 4;
	
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
						+ ANY_TRASPAS + " i " + this.any + " = " + comptador_anys);
		System.out.println("-------------------------\n");
		
	}
	
	

}
