package Exercicio_Sequencial;

import java.util.Scanner;

public class Ex_2 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int num = 0;
		
		System.out.println("Informe o n�mero desejado: ");
		num = entrada.nextInt();
		
		System.out.println("O n�mero informado foi: "+ num);
		
		entrada.close();
		
		
	}

}
