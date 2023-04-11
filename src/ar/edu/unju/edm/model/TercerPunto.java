package ar.edu.unju.edm.model;

public class TercerPunto {

	public void primosMenores(int numero) {
		boolean primo;
		
		for (int num=0; num<=numero; num++) {
            primo = true;
            for (int i=num-1; i>1; i--) {
                if (num%i == 0) {
                    primo = false;
                }
            }
            if (primo) {
                System.out.println(num);
            }
        }
	}

}
