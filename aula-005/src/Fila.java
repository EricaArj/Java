import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;



public class Fila {

	public static void main(String[] args) {
	 Queue<String> fila = new LinkedList<String>();
	 
	 fila.add("Rony");
	 fila.add("Lucas");
	 fila.add("Isaac");
	 fila.add("Fernando");
	 fila.add("Laise");
	 fila.add("Elizangela");
	 
	 
	 Iterator<String> iFila = fila.iterator();
	 
	 while(iFila.hasNext()) {
		 System.out.println(iFila.next());
		 
	 }
	 System.out.println("Retirar um elemento da fila");
	 System.out.println(fila.poll());
	 System.out.println("Fila Atualizada:");
	 System.out.println(fila); //mastra os dados em uma só linha
	 System.out.println(fila.peek()); 
	 System.out.println(fila.size()); 
	 
	 for(var elemento : fila) {
		 System.out.println(elemento);
	 }
	}

}
