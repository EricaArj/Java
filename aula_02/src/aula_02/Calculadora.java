package aula_02;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		
		DecimalFormat df = new DecimalFormat("###.##");

		Scanner leia = new Scanner(System.in);
		
		double n1,n2;
		
		System.out.println("Digite o 1 numero: ");
		n1 = leia.nextDouble();
		
		System.out.println("Digite o 2 numero: ");
		n2 = leia.nextDouble();
		
		System.out.println(" Somado o numero " + n1 + " Elevado ao numero " + n2
				 + " é igual a " +(n1 + n2));
		
		System.out.println(" Subtraido o numero " + n1 + " Elevado ao numero " + n2
				 + " é igual a " + (n1 - n2));

		System.out.println(" Multiplicando o numero " + n1 + " Elevado ao numero " + n2
				 + " é igual a " + (n1 * n2));
		
		if ( n2 != 0)

		System.out.println(" Dividido o numero " + n1 + " Elevado ao numero " + n2
				 + " é igual a " + (n1 / n2));
		else
			System.out.println(" Não e possível dividir um muero por zero!");
		
	
		System.out.println(" O numero " + n1 + " Elevado ao numero " + n2 
				+ " é igual a " + Math.pow(n1,n2));
		System.out.println(" A Raíz quadrada do numero " + n1 + " Elevado ao numero " + n2
				 + " é igual a " + df.format(Math.sqrt(n1)));
		
		/*System.out.println("Pré Icremento");
		System.out.println(n1);
		System.out.println(++ n1);
		
		System.out.println("Pós Icremento");
		System.out.println(n2);
		System.out.println(n2 ++);
		System.out.println(n2);*/
		
		//Operadores de Atribuição;
		
		//System.out.println(n1 = n1 + n2);
		//System.out.println("A soma n1 +n2 é igual a: "+ (n1 += n2));
		//System.out.println("O novo valor de n1 é igual a:  "+ n1);
		//n1 = n1 + n2;
		//n1 += n2;
		
		
		
		
	
		
		leia.close();
		
		

	}

}
