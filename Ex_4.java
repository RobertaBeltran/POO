package Exercicio_Sequencial;

import java.util.Scanner;

public class Ex_4 {

	public static void main(String[] args) {
	
		Scanner entrada = new Scanner(System.in);
		double nota1,nota2, nota3, nota4 = 0;
		
		System.out.println("Primeira nota: ");
		nota1 = entrada.nextDouble();
		
		System.out.println("Segunda nota: ");
		nota2 = entrada.nextDouble();
		
		System.out.println("Terceira nota: ");
		nota3 = entrada.nextDouble();
		
		System.out.println("Quarta nota: ");
		nota4 = entrada.nextDouble();
		
		System.out.println("A média desse aluno: " + (nota1+nota2+nota3+nota4)/4);
		entrada.close();
		
		
	}

}
