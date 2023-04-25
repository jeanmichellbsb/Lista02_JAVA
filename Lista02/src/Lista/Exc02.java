package Lista;

import java.util.Scanner;

public class Exc02 {

	public void infoAltura(int info){
		
		Scanner input = new Scanner(System.in);
		
		double maiorAlt = 3.0;
		double menorAlt = 0.5;
		double altura;
		
		for (int i = 0; i < info; i++) {
			
			System.out.print("Informe a altura:");
			altura = input.nextDouble();
			
			if(altura > maiorAlt) {
				maiorAlt = altura;
			}
			
			if(altura < menorAlt) {
				menorAlt = altura;
			}
			
		}
		
		res(maiorAlt, menorAlt);
		
	}
	
	public void res(double maiorAltura, double menorAltura) {

		System.out.println("A maior altura informada é: "+ maiorAltura);
		System.out.println("A menor altura informada é: "+ menorAltura);
		
	}
}
