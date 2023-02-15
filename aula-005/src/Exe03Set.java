import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Exe03Set {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Set<Integer> numeros = new HashSet<Integer>();

        int numero;

        System.out.println("Digite um número: ");

        for (int contador = 0; contador <= 9; contador++) {
            numero = sc.nextInt();
            numeros.add(numero);

        }
        System.out.println("Listar dados do set: ");
        Iterator<Integer> i = numeros.iterator();

        while (i.hasNext()) {
            System.out.println(i.next());
        }

        sc.close();

    }

}

