package aula_01;

import java.util.Scanner;

public class Atividade_06 {
	
     public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
	
		
		int numero;
		
		
		System.out.println("Número é par ou ímpar, e se é positivo ou negativo");
		
		System.out.println("Digite o número: ");
		numero = leia.nextInt();
		
		if (numero %2 == 0)
			System.out.println("O número é par");
		
		else
			System.out.println("O número é impar");
		
		if (numero >= 0)
			
			System.out.println("O número é positivo");
		else
			
			System.out.println("O número é negativo");	
		
		
		leia.close();
		
		
   }

}
