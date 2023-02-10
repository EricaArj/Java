package aula_01;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Variaveis {

	public static void main(String[] args) {
		
		DecimalFormat df = new  DecimalFormat("##.##");
		
		Scanner leia = new Scanner(System.in);
		
		int numero;
		String nome;
		double area;
		
		System.out.println("Digite um nome : ");
		leia.skip("\\R?");
		nome = leia.nextLine();
		
		System.out.println("Digite um número: ");
		numero = leia.nextInt();
		
		System.out.printf("O número real: ");
		area = leia.nextDouble();
		
		
		System.out.println("O nome da participando é:"+ nome);
		System.out.println("O número da participando é:"+ numero);
		System.out.printf("O número da participando é: %.2f\n", area);
		System.out.println("A área é:"+df.format(area));
		

	}

}
