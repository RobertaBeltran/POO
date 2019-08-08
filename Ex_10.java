package Exercicio_Sequencial;
import java.util.Scanner;

public class Ex_10 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int num1,num2, a =0;
		double num3=0;
		double b,c = 0;
		System.out.print("Digite o primeiro número inteiro: ");
		num1=entrada.nextInt();
		
		System.out.print("Digite o segundo número inteiro: ");
		num2=entrada.nextInt();
		
		System.out.print("Digite o número real: ");
		num3=entrada.nextDouble();
		
		a = ((2*num1)*(num2/2));
		b = ((3*num1)+num3);
		c = (((num3*num3)*num3));
		
		System.out.println("O produto do dobro do primeiro com metade do segundo: "+a);
		System.out.println("A soma do triplo do primeiro com o terceiro: "+b);
		System.out.println("O terceiro elevado ao cubo: "+c);
		
		entrada.close();

	}

}
