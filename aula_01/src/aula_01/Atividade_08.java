package aula_01;

import java.util.Scanner;

public class Atividade_08 {
	
    public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		String animal01,animal02,animal03;
		
		System.out.println("Digite o 1 Animal");
		leia.skip("||R?");
		animal01 = leia.nextLine();
		
		System.out.println("Digite o 2 Animal");
		leia.skip("||R?");
		animal02 = leia.nextLine();
		
		System.out.println("Digite o 3 Animal");
		leia.skip("||R?");
		animal03 = leia.nextLine();
		
		
		if (animal01.equalsIgnoreCase("Vertebrado")) {
			
			if(animal03.equalsIgnoreCase("Ave")) {
				if (animal03.equalsIgnoreCase("carniviro"))
					System.out.println("águia");
				else
					System.out.println("Pomba");
			}else {
				if (animal03.equalsIgnoreCase("onivoro"))
					System.out.println("Homem");
				else
					System.out.println("Vaca");
			}
		}else {
			if(animal02.equalsIgnoreCase("inseto")) {
				if (animal03.equalsIgnoreCase("hematofago"))
					System.out.println("pulga");
				else
					System.out.println("lagarta");
				
			}else {
				if(animal03.equals("hematofago"))
					System.out.println("sanguessuga");
				else
					System.out.println("minhoca");
			}
			
			
		}
		
		
		
    }
	

}
