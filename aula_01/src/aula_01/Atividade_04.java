package aula_01;

import java.util.Scanner;

public class Atividade_04 {
	public static void main(String[] args) {
	
	Scanner scan = new Scanner(System.in);
	
	
	
	float n1,n2,n3,n4,diferenca;
	   
	   
    System.out.println("insira Numero 1: ");
	n1 = scan.nextFloat();
	System.out.println("insira Numero 2: ");
    n2 = scan.nextFloat();
	System.out.println("insira Numero 3: ");
    n3 = scan.nextFloat();
    System.out.println("insira Numero 4: ");
    n4 = scan.nextFloat();
			
	diferenca = (n1*n2)-(n3*n4);
	
	System.out.printf("Diferança: %.1f",diferenca);
	

	}

}
