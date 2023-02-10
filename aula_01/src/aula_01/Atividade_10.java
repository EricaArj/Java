package aula_01;

import java.util.Scanner;

public class Atividade_10 {
   public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		int cargo;
		String nome;
		float salario;
		float total;
		
		System.out.println("  Digite o nome do colaborador: ");
		leia.skip("\\R?");
		nome = leia.nextLine();
		
		System.out.println(" Digite o Código do cargo: ");
		cargo = leia.nextInt();
		
		System.out.println(" Digite o seu salário: ");
		salario = leia.nextFloat();
		
		
		
		switch(cargo){
		
		case 1:
			System.out.println(" Nome do colaborador: " + nome);
			System.out.print(" Cargo: Gerente");
			total = salario + (0.10f * salario);
       	    System.out.printf("  Salário: %.2f", total);
			break;
		case 2:
			System.out.println(" Nome do colaborador: " + nome);
			System.out.print(" Cargo: Vendedor");
			total = salario + (0.07f * salario);
       	    System.out.printf("  Salário: %.2f", total);
			break;
		case 3:
			System.out.println(" Nome do colaborador: " + nome);
			System.out.print(" Cargo: Supervisor ");
			total = salario + (0.09f * salario);
       	    System.out.printf("  Salário: %.2f", total);
			break;
		case 4:
			System.out.println(" Nome do colaborador: " + nome);
			System.out.print(" Cargo: Motorista");
			total = salario + (0.06f * salario);
       	    System.out.printf("  Salário: %.2f", total);
			break;
		case 5:
			System.out.println(" Nome do colaborador: " + nome);
			System.out.print(" Cargo: Estoquista");
			total = salario + (0.05f * salario);
       	    System.out.printf("  Salário: %.2f", total);
			break;
		case 6:
			System.out.println(" Nome do colaborador: " + nome);
			System.out.print(" Cargo: Técnico de TI");
			total = salario + (0.08f * salario);
       	    System.out.printf("  Salário: %.2f", total);
			break;
			
			
		}
		
         
         
         leia.close();
		

   }
	

}
