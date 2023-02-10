package aula_03;

import java.util.Scanner;

public class Exe04 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int idade,sexo,categoria,backend = 0,frontend= 0,mobile =0,full=0;
		String continuar= "S";
		
		while(continuar.equalsIgnoreCase("S")) {
		
		System.out.println("Digite a idade: ");
		idade = leia.nextInt();
		
		System.out.println("Digite a sexo: ");
		sexo = leia.nextInt();
		
		System.out.println("Digite a categoria: ");
		categoria = leia.nextInt();
		
		if(categoria ==1);
		backend ++;
		

		if(categoria ==2 && sexo == 2);
		frontend ++;

		if(categoria ==3 && idade > 40 && sexo ==1);
		mobile ++;

		if(categoria ==4 && idade < 30 && sexo ==2);
		full ++;
		
		
		
		System.out.println("Deseja continuar(S/N): ");
		leia.skip("\\R?");
		continuar =leia.nextLine();
		
		}
		
		System.out.println("\nTotal de pessoas desenvolvedoras Backend: " + backend);
		System.out.println("\nTotal de mulheres desenvolvedoras Frontend: " + frontend);
	
	}

}
