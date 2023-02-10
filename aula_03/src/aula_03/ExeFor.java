package aula_03;

import java.util.Scanner;

public class ExeFor {

	public static void main(String[] args) {
		     
			Scanner leia = new Scanner(System.in);
			
			
			int n1,n2;
			
			
			
			System.out.println(" Digite o primeiro numero: ");
			n1 = leia.nextInt();

			System.out.println(" Digite o segundo numero: ");
			n2 = leia.nextInt();

			if (n1 < n2) { 
				System.out.println(" No Intervalo entre " + n1 +" e "+ n2 +":");
							
			for(int n = n1; n <= n2; n++) {
				
				if (n %3 == 0 && n % 5 == 0) {
					System.out.println(n+ " é múltiplo de 3 e 5" );
				}
			}
			}else {
				
				System.out.println(" Intevalo invalido!");
				
			}
				leia.close();
			}
			
				}
			        