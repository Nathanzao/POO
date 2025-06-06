package Exercicio1Exemplo;

public class Telefone extends Contato{
    private String telefone;

    public Telefone(String tele){
        super("Telefone");
        this.telefone = tele;
    }

    @Override
    public void exibir() {
        System.out.println("Telefone: " + telefone + ".");
    }

    public String getTelefone() {
        return telefone;
    }
}
