package Exercicio_Sequencial;

import java.util.Scanner;

public class Ex_3 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int num1 = 0;
		int num2 = 0;
		
		System.out.println("Informe o n�mero desejado: ");
		num1 = entrada.nextInt();
		
		System.out.println("Informe o n�mero desejado: ");
		num2 = entrada.nextInt();
		int soma = num1+num2;
		System.out.println("A soma de: "+ num1 +" + "+ num2+ " � igual a: "+ soma);
		
		entrada.close();

	}

}
