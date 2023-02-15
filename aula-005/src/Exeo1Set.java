import java.util.ArrayList;
import java.util.Scanner;

public class Exeo1Set {

	public static void main(String[] args) {
		ArrayList<Integer> valores = new ArrayList<Integer>();
		Scanner leia = new Scanner(System.in);
		int testeNu;
		
		valores.add(2);
		valores.add(5);
		valores.add(1);
		valores.add(3);
		valores.add(4);
		valores.add(9);
		valores.add(7);
		valores.add(8);
		valores.add(10);
		valores.add(6);
		
		System.out.println("Entre com o número para saber se está na lista: ");
		testeNu = leia.nextInt();
		
		if(valores.contains(testeNu))
			System.out.println("O número " + testeNu + " foi encontrado!");
		else
			System.out.println("O número " + testeNu + " Não foi encontrado!");
	}
}