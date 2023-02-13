package aula04;

import java.util.Scanner;

public class Exe01 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		int vetor[] = {2,5,1,3,4,9,7,8,10,6};
		int numero;
		
		
		System.out.println("Digite o némero que deseja: ");
		numero = leia.nextInt();
		
		for(int contador = 0; contador < vetor.length; contador ++) {
			
			if(numero == vetor[contador]){
				System.out.println("O numero "+ numero + " Está na Posição " + contador);
			    contador =vetor.length;
		}
			else if ( contador == vetor.length -1)
			System.out.println(" A posição Não foi encontrado!");
		
		
		}
			
		leia.close();
	}

}
