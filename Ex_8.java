package Exercicio_Sequencial;
import java.util.Scanner;

public class Ex_8 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		double valorhora,horames,salario = 0;
		
		System.out.print("Digite quanto vale a hora trabalhada: ");
		valorhora = entrada.nextDouble();
		
		System.out.print("Quantas horas trabalhadas no m�s: ");
		horames = entrada.nextDouble();
		
		salario = (valorhora * horames);
		
		System.out.print("Neste m�s voc� receber�: " + salario);
	
		entrada.close();

	}

}
