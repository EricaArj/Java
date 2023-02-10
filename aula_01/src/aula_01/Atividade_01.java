package aula_01;

import java.util.Scanner;

public class Atividade_01 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
	
		
		float salario;
		float abono;
		float novoSalario;
		
		
		System.out.println("\nvalor do Salário: ");
		salario = scan.nextFloat();
		System.out.println("valor do abono: ");
		abono = scan.nextFloat();
		
		novoSalario = salario + abono;
		
		System.out.print("Vai receber o Salario no Valor: " + novoSalario);
	
		
	}

}
