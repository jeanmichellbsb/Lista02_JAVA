package Lista;

import java.util.Scanner;

public class Exc03 {
	
	public static void Valores() {
	    	
		Scanner n = new Scanner(System.in);
	        
		int totalValores = 0;
		int Positivos = 0;
		int Negativos = 0;
		double soma = 0;
		double valor;
	        
	        do {
	            
	        	System.out.print("Informe um valor (Para encerrar e mostrar o resultado, informe [0]): ");
	        	
	            valor = n.nextDouble();
	  
	            if (valor != 0) {
	                soma += valor;
	                totalValores++;
	                
	                if (valor > 0) {
	                    Positivos++;
	                    
	                } else {
	                    Negativos++;
	                }
	            }
	        } 
	        
	        while (valor != 0);
		        
	        	if (totalValores == 0) {
	        		
		            System.out.println("Programa ENCERRADO!");
		            
		        } else {
		        	
		            double media = soma / totalValores;
		            double percentualP = (double) Positivos / totalValores * 100;
		            double percentualN = (double) Negativos / totalValores * 100;
	            
		            System.out.printf("Média aritmética: %.2f%n", media);
		            System.out.println("Quantidade de valores positivos: " + Positivos);
		            System.out.println("Quantidade de valores negativos: " + Negativos);
		            System.out.printf("Percentual de valores positivos: %.2f%%%n", percentualP);
		            System.out.printf("Percentual de valores negativos: %.2f%%%n", percentualN);
		            
		        }
			}
	}
