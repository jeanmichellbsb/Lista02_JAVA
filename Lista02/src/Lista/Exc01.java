package Lista;

import java.util.Scanner;

public class Exc01 {
	
	int soma = 0;

	public void somaImpares() {
		
		int n;
			
		for (n = 1; n <= 500; n++) {
			
			 if (n%2 !=0) {
				 
				 if (n %3 == 0){
					 
					 soma += n;				
				}
			 }
		}
		
	}
	
	public void resSoma() {
		
		System.out.print("A soma de todos os números ímpares múltiplos de três que estão entre 1 e 500 é: " +soma);
		
	}

}