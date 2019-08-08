package Exercicio_Sequencial;
import java.util.Scanner;

public class Ex_5 {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		double metros = 0;	
		
		System.out.println("Informe a quantidade desejada em metros: ");
		metros = entrada.nextDouble();
		
		double centimetro;
		centimetro = (metros *100);
		
		System.out.println(metros +  " em centimetros: " + centimetro );
		
		entrada.close();
		
		
		
	}

}
