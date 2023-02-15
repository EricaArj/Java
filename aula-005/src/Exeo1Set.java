import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Exeo1Set {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		Set<Integer> valores = new HashSet<Integer>();
		
		valores.add(2);
		valores.add(5);
		valores.add(10);
		valores.add(3);
		valores.add(4);
		valores.add(2);
		valores.add(2);
		valores.add(3);
		valores.add(10);
		valores.add(15);
		
		int consulta;
		
		System.out.println("Listando todas as valores: ");
		consulta = leia.nextInt();
		valores.forEach(System.out::println);//lup
		
		
		valores.forEach(System.out::println);//lup
		System.out.println("Nota 7 exixte: " + valores.contains(valores));
		
		for(var nota : valores)
			System.out.println(nota.hashCode());

	}

}
