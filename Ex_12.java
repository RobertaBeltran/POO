package Exercicio_Sequencial;

import java.util.Scanner;

public class Ex_12 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int sexo=0;
		float peso, altura, pesoIdeal= 0;
		
		System.out.println("1- Mulher");
		System.out.println("2- Homem");
		sexo = entrada.nextInt();
		
		if (sexo==1) {
		System.out.print("Digite seu peso: ");
		peso = entrada.nextFloat();
		
		System.out.print("Digite seu altura: ");
		altura = entrada.nextFloat();
		
		pesoIdeal = (float) (((72.7*altura)-58));
		
		System.out.println("Seu peso: " + peso + " sua altura: " + altura+ " seu peso ideal: "+pesoIdeal);
		
		} else if (sexo == 2) {
			
			System.out.print("Digite seu peso: ");
			peso = entrada.nextFloat();
			
			System.out.print("Digite seu altura: ");
			altura = entrada.nextFloat();
			
			pesoIdeal = (float) (((62.1*altura)-44.7));
			
			System.out.println("Seu peso: " + peso + " sua altura: " + altura+ " seu peso ideal: "+pesoIdeal);
			
		} else {
			System.out.println("Sexo inválido!");
		}
		
		entrada.close();

	}

}
