package Exercici01;

public class Fase04 extends Fase03 {

	public Fase04(String nom, String cognom1, String cognom2, int dia, int mes, int any) {
		super(nom, cognom1, cognom2, dia, mes, any);
		// TODO Auto-generated constructor stub
	}
	
	protected String getNom_Complet() {
		String nom_comp_a[][] = new String[3][2];
		nom_comp_a[0][0] = this.getNom();
		nom_comp_a[1][0] = this.getCognom1();
		nom_comp_a[2][0] = this.getCognom2();
		nom_comp_a[0][1] = " ";
		String nomComplet = "";
		for (int c = 0; c<3; c++) {
			nomComplet += nom_comp_a[c][0];
			if (this.getCognom2() == "") {
				if (c < 1) {
					nomComplet += nom_comp_a[0][1];
				}
			} else {
				if (c < 2) {
					nomComplet += nom_comp_a[0][1];
				}
			}
			
		}
		
		return nomComplet; // nom_comp_a[0][0]+nom_comp_a[0][1]+nom_comp_a[1][0]+nom_comp_a[0][1]+nom_comp_a[2][0]
	}
	
	protected String getData_Naixement() {
		String data_comp_a[][] = new String[3][2];
		data_comp_a[0][0] = String.valueOf(this.getDia());
		data_comp_a[1][0] = String.valueOf(this.getMes());
		data_comp_a[2][0] = String.valueOf(this.getAny());
		data_comp_a[0][1] = "/";
		String dataComplete = "";
		for (int c = 0; c<3; c++) {
			dataComplete += data_comp_a[c][0];
			if (c<2) {
				dataComplete += data_comp_a[0][1];
			}
		}
		return dataComplete; // data_comp_a[0][0]+data_comp_a[0][1]+data_comp_a[1][0]+data_comp_a[0][1]+data_comp_a[2][0]
	}
	
	@Override
	public void printFase04() { 
		System.out.println("-------- FASE 04 --------");
		System.out.println("El meu nom és " + getNom_Complet()); 
		System.out.println("Vaig néixer el " + getData_Naixement());
		if (this.isTraspas_verify()) {
			System.out.println("El meu any de naixement és de traspàs");
		} else {
			System.out.println("El meu any de naixement no és de traspàs");
		}
		System.out.println("-------------------------");
	} 
	

}
