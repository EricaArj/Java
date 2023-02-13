package aula04;

import java.util.Scanner;

public class Exe04 {
	public static void main(String[] args) {
		
		Scanner leia= new Scanner(System.in);
		
		float matriz[][] = new float[3][4];
		float media[] = new float[3];
		float soma=0.0f;
		
		//Ler as notas
		for(int indice = 0; indice <matriz.length; indice ++) {
			for(int indiceJ =0;indice < matriz[indice].length; indice ++) {
				
				System.out.println("digite a nota: ");
				matriz[indice][indiceJ] = leia.nextFloat();
				
			}
		}
		for(int indice = 0; indice <matriz.length; indice ++) {
			for(int indiceJ =0;indice < matriz[indice].length; indice ++) {
				
				soma += matriz[indice][indiceJ];
				
			}
			media[indice]= soma / matriz[indice].length;
			soma = 0.0f;
		}
		for (var medias : media)
			System.out.println(medias);
		
		leia.close();
	}

}
