package Exercicio_Sequencial;
import java.util.Scanner;
public class Ex_9 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		double tempF, tempC=0;
		
		System.out.print("Insira a temperatura desejada em Farenheit: ");
		tempF = entrada.nextDouble();
		
		tempC = (((tempF -32)*5)/9);
		
		System.out.println("A temperatura em Farenheit: " + tempF + " e a temperatura em Celsius: " + tempC);
		
		entrada.close();
		


	}

}
