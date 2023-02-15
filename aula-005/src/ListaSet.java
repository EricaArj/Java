import java.util.HashSet;
import java.util.Set;

public class ListaSet {

	public static void main(String[] args) {
	
		
		Set<Double> notas = new HashSet<Double>();//não ordenar os dados e não deixa repetir dados
		
		notas.add(7.0);
		notas.add(6.0);
		notas.add(2.0);
		notas.add(5.0);
		notas.add(7.0);
		notas.add(20.0);
		
		
		System.out.println("Listando todas as notas: ");
		notas.forEach(System.out::println);//lup
		
		System.out.println("Removendo nota: ");
		notas.remove(20.0);//removendo nota
		
		notas.forEach(System.out::println);//lup
		System.out.println("Nota 7 exixte: " + notas.contains(7.0));
		
		for(var nota : notas)
			System.out.println(nota.hashCode());
	}

}
