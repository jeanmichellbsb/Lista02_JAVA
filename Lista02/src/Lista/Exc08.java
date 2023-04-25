package Lista;

import java.util.Scanner;

public class Exc08 {
	
	public static void Fatorial(){
		
	        Scanner scanner = new Scanner(System.in);
	        
	        System.out.print("Digite um número inteiro positivo: ");
	        
	        int a = scanner.nextInt();
	        
	        while (a < 0) {
	        	
	            System.out.println("NÚMERO INVÁLIDO. Digite novamente!");
	            System.out.print("Digite um número inteiro positivo: ");
	            
	            a = scanner.nextInt();
	        }
	        
	        int num = 1;
	        String seq = a + "! = ";
	        
	        for (int i = a; i >= 1; i--) {
	        	
	            num *= i;
	            seq += i;
	            
	            if (i > 1) {
	            	
	                seq += " * ";
	            }
	        }
	        
	        System.out.println(seq + " = " + num);
	}
}