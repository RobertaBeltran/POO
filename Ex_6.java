package Exercicio_Sequencial;
import java.util.Scanner;

public class Ex_6 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		double raio = 0;
		double area = 0;		
		
		double pi = 3.1415926;
		
		System.out.print("Digite o raio do círculo desejado: ");
		raio = entrada.nextDouble();
		
		area = (pi*(raio*raio));
		
		System.out.println("A area do círculo é: " + area);
		
		entrada.close();
		
		
		
		
		

	}

}
