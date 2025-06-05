package Exercicio1;

public class Telefone extends Contato{
    private String telefone;

    public Telefone(String telefo){
        super(Utilitaria.tel);
        this.telefone = telefo;
        Utilitaria.contadorContatosTelefone++;
    }

    @Override
    public void exibir() {
        System.out.println("Telefone: " + telefone + ".\n");
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
}
