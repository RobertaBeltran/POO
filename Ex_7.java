package Exercicio_Sequencial;
import java.util.Scanner;

public class Ex_7 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		double lado = 0;
		double area = 0;
		
		System.out.print("Digite o valor do lado do quadrado: ");
		lado = entrada.nextDouble();
		
		area = (lado*lado);
		
		System.out.println("A area do quadrado é: " + area);
		
		entrada.close();

	}

}
