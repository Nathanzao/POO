package Exercicio1Exemplo;

public class Email extends Contato{
    private String email;

    public Email(String emaill){
        super("Email");
        this.email = emaill;
    }

    @Override
    public void exibir() {
        System.out.println("Email: " + email + ".");
    }

    public String getEmail() {
        return email;
    }
}
