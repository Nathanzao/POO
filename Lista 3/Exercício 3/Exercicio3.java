public class Exercicio3 {
    
    public static void main(String[] args) {
        Cliente clie = new Cliente("Nathan", 1, 1000);

        clie.depositar(10);
        
        System.out.println("Saldo: " + clie.saldo);

        clie.sacar(10);

        System.out.println("Saldo: " + clie.saldo);

    }

}
