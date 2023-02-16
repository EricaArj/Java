import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

public class Exe01List {

	public static void main(String[] args) {
		
		ArrayList<String> cores = new ArrayList<String>();
		Scanner leia = new Scanner(System.in);
		String nCor;
		int contagem = 0;
		
		while(contagem < 5) {
			System.out.println("Entre com a cor que deseja adicionar:");
			leia.skip("\\R?");
			nCor = leia.nextLine();
			
			cores.add(nCor);
			contagem += 1;
		}
		
		System.out.println("\nCores adicionadas: ");
		for(var cor: cores)
			System.out.println(cor);
		
		cores.sort(null);
		System.out.println("\nEm ordem crescente, cores adicionadas: ");
		for(var cor: cores)
			System.out.println(cor);
	}
}