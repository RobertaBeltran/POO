package Exercicio_Sequencial;

import java.util.Scanner;

public class Ex_14 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		double ganhahora, horastrab=0;
		double salariobruto, salarioliqui, descinss, descimprend, descsindicato, desctotal=0;
		
		System.out.print("Quanto você ganha por hora: ");
		ganhahora = entrada.nextDouble();
				
		System.out.print("Qauntas horas você trabalhou esse mês: ");
		horastrab = entrada.nextDouble();
		
		salariobruto = (ganhahora*horastrab);
		
		descinss = (salariobruto * 0.08);
		
		descimprend = (salariobruto * 0.11);
		
		descsindicato = (salariobruto * 0.05);
		
		salarioliqui = (salariobruto - (descinss+descimprend+descsindicato));
		
		desctotal = (descinss+descimprend+descsindicato);
		
		System.out.println("O valor do seu salario bruto: R$ " + salariobruto);
		
		System.out.println("O valor que você pagou de INSS: R$ "+ descinss);
		
		System.out.println("O valor que pagou de sindicato: R$ " + descsindicato);
		
		System.out.println("Foi descontado o total: R$ " + desctotal);
		
		System.out.println("Seu salario liquido: R$ " + salarioliqui);		
		
		entrada.close();
		

	}

}
