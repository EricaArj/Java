package aula04;

import java.util.Scanner;

public class Exe03 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		int matriz[][] = new int[3][3];
		int colunaP[] = new int[3];
		int colunaS[] = new int[3];
		int somaP = 0, somaS = 0;

		for (int linha = 0; linha < matriz.length; linha++) {
			for (int coluna = 0; coluna < matriz.length; coluna++) {
				System.out.println("Digite da linha [" + linha + "] coluna [" + coluna + "]:");
				matriz[linha][coluna] = leia.nextInt();
			}
		}

		for (int linha = 0; linha < matriz.length; linha++) {
			for (int coluna = 0; coluna < matriz.length; coluna++) {
				if (linha == coluna) {
					colunaP[linha] = matriz[linha][coluna];
				}
			}
		}
		System.out.println("\nElementos da Diagonal Principal:");
		for (int elemento : colunaP) {
			System.out.print(elemento + " ");
			somaP += elemento;
		}

		for (int linha = 0; linha < matriz.length; linha++) {
			for (int coluna = 0; coluna < matriz.length; coluna++) {
				if ((linha + coluna) == (matriz.length - 1)) {
					colunaS[linha] = matriz[linha][coluna];
				}
			}
		}
		System.out.println("\n\nElementos da Diagonal Secundária:");
		for (int elemento : colunaS) {
			System.out.print(elemento + " ");
			somaS += elemento;
		}

		System.out.println("\n\nSoma dos Elementos da Diagonal Principal:");
		System.out.println(somaP);

		System.out.println("\nSoma dos Elementos da Diagonal Secundária:");
		System.out.println(somaS);

		leia.close();
	}



	}


