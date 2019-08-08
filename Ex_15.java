package Exercicio_Sequencial;

import java.util.Scanner;
public class Ex_15 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		
		
		double latas,litros,area, total;
		float precoTinta = 80f;
			
		
		System.out.print("Digite o tamanho da àrea a ser pintada em metros quadrados: ");
		area = entrada.nextDouble();
		litros = area/3;
		latas = Math.ceil(litros/18);
		total = latas*precoTinta;
		
		System.out.println("Para pintar " + area + " metros quadrados, você precisará de " + latas + " latas e irá pagar R$ " + total+ ".");
				
				
		entrada.close();

	}

}
