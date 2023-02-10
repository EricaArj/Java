package aula_03;

import java.util.Scanner;

public class ExeDowhile {
	
	static Scanner entrada = new Scanner (System.in);
	
	public static void main(String[] args) {
	 
		int numero = 0, somaPositivos=0;
		
		do {
			System.out.println("Digite um número: ");
			numero = entrada.nextInt();
			if(numero>0)
			{
				somaPositivos += numero;
			}
		}while(numero != 0);
		 System.out.println("A soma dos números positivos é: " + somaPositivos);
	}

}



