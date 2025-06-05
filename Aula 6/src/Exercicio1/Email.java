package Exercicio1;

public class Email extends Contato{
    private String email;

    public Email(String emaill){
        super(Utilitaria.em);
        this.email = emaill;
        Utilitaria.contadorContatosEmail++;
    }

    @Override
    public void exibir() {
        System.out.println("Email: " + email + ".\n");
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
