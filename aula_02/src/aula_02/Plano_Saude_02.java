package aula_02;

import java.util.Scanner;

public class Plano_Saude_02 {

	public static void main(String[] args) {
		
     Scanner leia = new Scanner (System.in);
		
		int faixa;
		
		System.out.println("Faixas Etárias");
		System.out.println("1\tAté 10 anos");
		System.out.println("2\tAté 29 anos");
		System.out.println("3\tAté 45 anos");
		System.out.println("4\tAté 50 anos");
		System.out.println("5\tAté 70 anos");
		System.out.println("6\tAté 80 anos");
		
		
		System.out.println("Digite a sua idade: ");
		faixa = leia.nextInt();
		
		
		switch(faixa) {
		
		case 1: 
			System.out.println(" Plano de Saúde idade de 1 ano Até 10 anos!");
			System.out.println("O valor do seu Plano de Súde será de R$: 100,00");
			break;
		case 2:
			System.out.println(" Plano de Saúde idade de 11 ano Até 29 anos!");
			System.out.println("O valor do seu Plano de Súde será de R$: 200,00");
			break;
		case 3:
			System.out.println(" Plano de Saúde idade de 30 ano Até 45 anos!");
			System.out.println("O valor do seu Plano de Súde será de R$: 300,00");
			break;
		case 4:
			System.out.println(" Plano de Saúde idade de 46 ano Até 50 anos!");
			System.out.println("O valor do seu Plano de Súde será de R$: 500,00");
			break;
		case 5:
			System.out.println(" Plano de Saúde idade de 51 ano Até 70 anos!");
			System.out.println("O valor do seu Plano de Súde será de R$: 600,00");
			break;
		case 6:
			System.out.println(" Plano de Saúde idade de 71 ano Até 80 anos!");
			System.out.println("O valor do seu Plano de Súde será de R$: 1000,00");
			break;
			
			default:
				//informar que não existe;
				System.out.println("Plano invalido");
		
		}
		
		
		
		leia.close();

	}

}
