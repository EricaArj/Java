package aula_01;

/*Faça um algoritmo em Java que leia 3 valores inteiros A, B e C e imprima na tela
se a soma de A + B é maior, menor ou igual a C.*/



import java.util.Scanner;

public class Atividade_05 {
   public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
	
		
		int A;
		int B;
		int C;
		int soma;
		
		System.out.println("Informe na tela os valores: ");
		
		System.out.println("Digite o valor de  A: ");
		A = leia.nextInt();
		
		System.out.println("Digite o valor de  B: ");
		B = leia.nextInt();
		
		System.out.println("Digite o valor de  C: ");
		C = leia.nextInt();
		
		soma = A + B;
		
		if (soma > C)
			
			System.out.println("A Soma de A + B é Maior que C");
		
		else if (soma < C)
			
			System.out.println("A Soma de A + B é Menor que C");
		
		else if (soma == C)
			
			System.out.println("A Soma de A + B é igual a C" );
		
		else 
		
			System.out.println("Opção invalidade");
			
			
			
			
	leia.close();	
		
		
}

}