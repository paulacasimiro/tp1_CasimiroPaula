package ar.edu.unju.edm.model;

public class PrimerPunto {
	
	public void añoBisiesto(int año) {
		if(año%4==0 && (año%100!=0 || año%400==0 )) {
			System.out.println("El año es Bisiesto");
		}
		else {
			System.out.println("El año NO es Bisiesto");
		}

	}
}
