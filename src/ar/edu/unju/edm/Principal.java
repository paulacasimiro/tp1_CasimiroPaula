package ar.edu.unju.edm;
import ar.edu.unju.edm.model.*;

public class Principal {

	public static void main(String[] args) {
		int numeroA = 5;
		int numeroB = 30;
		String opcion = "PAR";
		

		//PrimerPunto siAñoBisiesto = new PrimerPunto();
		//siAñoBisiesto.añoBisiesto(numeroA);
		
		//SegundoPunto queMesEs = new SegundoPunto();
		//queMesEs.perteneceMes(numeroA);
		
		//TercerPunto primos = new TercerPunto();
		//primos.primosMenores(numeroA);
		
		CuartoPunto paresImpares = new CuartoPunto();
		paresImpares.parImpar(numeroA, numeroB, opcion);

	}

}
