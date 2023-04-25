package Lista;

import java.util.Scanner;

public class Exc05 {
	
	public static void Num(){
		
		Scanner scanner = new Scanner(System.in);
	        
	        int quantPares = 0;
	        int quantImpares = 0;
	        int somaPares = 0;
	        int quantTotal = 0;
	        int numero = 0;
	        
		        do {
		            System.out.print("Informe um valor (Para encerrar e mostrar o resultado, informe [0]): ");
		            numero = scanner.nextInt();
		            
		            if (numero != 0) {
		            	
		                if (numero % 2 == 0) {
		                	
		                    quantPares++;
		                    somaPares += numero;
		                    
		                } else {
		                	
		                    quantImpares++;
		                }
		                
		                quantTotal++;
		            }
		            
		        } while (numero != 0);
		        
		        double mediaPares = 0;
		        
		        if (quantPares > 0) {
		        	
		            mediaPares = (double) somaPares / quantPares;
		        }
		        
		        double mediaTotal = 0;
		        
		        if (quantTotal > 0) {
		            mediaTotal = (double) (somaPares + quantImpares) / quantTotal;
		        }
		        
		        System.out.printf("Quantidade de números pares informados: %d\n", quantPares);
		        System.out.printf("Quantidade de números ímpares informados: %d\n", quantImpares);
		        System.out.printf("Média dos valores pares: %.2f\n", mediaPares);
		        System.out.printf("Média total: %.2f\n", mediaTotal);
		    }
}