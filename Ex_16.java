package Exercicio_Sequencial;

import java.util.Scanner;

public class Ex_16 {

	public static void main(String[] args) {
		
	double area,lataG,lataP,totalG,totalP;
	double precoG = 80.0;
	double precoP = 25.0;
	
	Scanner entrada = new Scanner(System.in);
	
	System.out.print("Digite o tamanho da àrea a ser pintada em metros quadrados: ");
	area = entrada.nextDouble();
	
	
	lataG = Math.ceil((area/6)/18);
	totalG = precoG * lataG;
	lataP = Math.ceil((area/6)/3.6);	
	totalP = precoP * lataP;
	
	System.out.println("Para pintar " + area + " metros quadrados com galões de 18 litros, você precisará de " + lataG + " latas e irá pagar R$ " + totalG+ ".");
	System.out.println("Para pintar " + area + " metros quadrados com galões de 3,6 litros, você precisará de " + lataP + " latas e irá pagar R$ " + totalP+ ".");
	
	entrada.close();
	}

}
