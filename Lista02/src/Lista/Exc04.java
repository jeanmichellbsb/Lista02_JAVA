package Lista;

import java.util.Scanner;

public class Exc04 {
	
	public static void Numbers() {
	        
		Scanner cont = new Scanner(System.in);
	        
	        int[] intervalos = new int[4];
	        
	        int numero = 0;
	        
		        do {
		        	
		            System.out.print("Informe um valor (Para encerrar e mostrar o resultado, informe um valor negativo): ");
		            numero = cont.nextInt();
		            
		            if (numero >= 0 && numero <= 25) {
		                intervalos[0]++;
		                
		            } else if (numero >= 26 && numero <= 50) {
		                intervalos[1]++;
		                
		            } else if (numero >= 51 && numero <= 75) {
		                intervalos[2]++;
		                
		            } else if (numero >= 76 && numero <= 100) {
		                intervalos[3]++;
		                
		            }
		            
		        } while (numero >= 0);
		        
		  System.out.printf("Intervalo [0-25]: %d\n", intervalos[0]);
		  System.out.printf("Intervalo [26-50]: %d\n", intervalos[1]);
		  System.out.printf("Intervalo [51-75]: %d\n", intervalos[2]);
		  System.out.printf("Intervalo [76-100]: %d\n", intervalos[3]);
	}
}

