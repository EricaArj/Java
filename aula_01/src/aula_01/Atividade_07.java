package aula_01;

import java.util.Scanner;

public class Atividade_07 {
	
    public static void main(String[] args){
		
		Scanner leia = new Scanner(System.in);
		
		int     idade;
		boolean doacao;
		String  nome;
		
		System.out.println("Digite o nome do doador: ");
		nome = leia.nextLine();
		
		System.out.println("Digite sua idade: ");
		idade = leia.nextInt();
		
		System.out.println("Já fez doação?");
		doacao = leia.nextBoolean();
		
		
		if (idade >=18 && idade <=59) 
			
			System.out.println( nome+ "\n Você está Apto(a)para doação ");
		else if (idade >= 60 && idade <= 69 && doacao == false)
			
			System.out.println( nome+ "\n Não stá Apto(a)para doação :) ");
		else
			System.out.println(" \nNão está Apto a Doar. ");
			
		
		
    }
		
		

}
