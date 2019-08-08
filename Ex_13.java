package Exercicio_Sequencial;

import java.util.Scanner;

public class Ex_13 {

	public static void main(String[] args) {
		
		Scanner entrada= new Scanner (System.in);
		
		float pesca = 0;
		float excessop = 0;
		float multa = 0;
						
		System.out.println("Coloque sua pesca na balança");
		System.out.print("Digite em Kg a quantidade pescada no dia: ");
		pesca  = entrada.nextFloat();
		
		if (pesca>50) {
			excessop = (pesca-50);
			multa = (excessop *4);
			System.out.println("Hoje você pescou " + pesca +" Kg de peixes. O seu excesso foi de: " + excessop + " sua multa é no valor de R$ " + multa);
		}else if (pesca <=50) {
			System.out.println("Hoje você pescou " + pesca +" Kg de peixes. O seu excesso foi de: " + excessop + " sua multa é no valor de R$ " + multa);			
			
		}
		
		entrada.close();
		
		
		
		
		
	}

}
