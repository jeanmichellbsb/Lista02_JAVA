package Lista;

import java.util.Scanner;

public class Exc07 {
	
	public static void Tabuada(){
		
		Scanner scanner = new Scanner(System.in);
	        
	        System.out.print("Digite um número entre 1 e 10: ");
	        
	        int n = scanner.nextInt();
	        
	        while (n < 1 || n > 10) {
	        	
	            System.out.println("NÚMERO INVÁLIDO. Digite novamente!");
	            System.out.print("Digite um nÚmero entre 1 e 10: ");
	            
	            n = scanner.nextInt();
	        }
	        
	        for (int i = 0; i <= 10; i++) {
	        	
	            int resultado = i * n;
	            
	            System.out.printf("%d * %d = %d\n", i, n, resultado);
	        }
	}
}