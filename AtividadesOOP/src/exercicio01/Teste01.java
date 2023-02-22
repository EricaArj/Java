package exercicio01;

public class Teste01{

    public static void main(String[] args) {

        Cliente c1 = new Cliente("EricaAraujo", "(11)9432424224", "787.239.3765-00","Erica12344@gmail.com", "Desevolverdora Java");

        Cliente c2 = new Cliente("Luis Ramos", "(11)9457336600", "543.006.874-00","Luis2131@gmail.com", "Programador");

        c1.visualizar();
        c2.visualizar();
    }
}