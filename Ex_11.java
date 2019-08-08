// Roberta da Conceição Beltran

package Exercicio_Sequencial;

import java.util.Scanner;

public class Ex_11 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		float peso, altura, pesoIdeal= 0;
		
		System.out.print("Digite seu peso: ");
		peso = entrada.nextFloat();
		
		System.out.print("Digite seu altura: ");
		altura = entrada.nextFloat();
		
		pesoIdeal = (float) (((72.7*altura)-58));
		
		System.out.println("Seu peso: " + peso + " sua altura: " + altura+ " seu peso ideal: "+pesoIdeal);
		
		entrada.close();
		
		
		
		
		
		

	}

}
