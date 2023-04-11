package ar.edu.unju.edm.model;

public class CuartoPunto {
	
	public void parImpar(int numeroA, int numeroB, String opcion) {
		
		if(opcion=="PAR") {
			for (int num=numeroA; num<=numeroB; num++) {
				if (num%2 == 0) {
					System.out.println(num);
	            }
	        }
		}
		else if(opcion=="IMPAR") {
			for (int num=numeroA; num<=numeroB; num++) {
				if (num%2 != 0) {
					System.out.println(num);
	            }
	        }
		}
	}

}
