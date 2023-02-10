package aula_03;

import java.util.Scanner;

public class ExeWhile {
	
	static Scanner entrada = new Scanner (System.in);
	public static void main(String[] args) {
		
		int idade , menor21 = 0, maior50 = 0;
		
		System.out.println("Digite sua idade? ");
		idade = entrada.nextInt();
		
		while(idade > 0) 
		{
			
			if(idade < 21)
			{
				menor21++;
			}
			else if(idade > 50)
			{
				maior50++;
			}
			System.out.println("Digite sua idade? ");
			idade = entrada.nextInt();
			
		}
		System.out.println("Pessoas com menos de 21 anos: " + menor21);
		System.out.println("Pessoas com mais de 50 anos: " + maior50);
	}
}