package Exercicio1;

public class Main {
    public static void main(String[] args) {
        // Criando a agenda
        Agenda agenda = new Agenda("João", 10);

        // Criando pessoas
        Pessoa maria = new Pessoa("Maria", 5);
        Pessoa jose = new Pessoa("José", 5);

        // Adicionando pessoas à agenda
        agenda.addPessoa(maria);
        agenda.addPessoa(jose);

        // Criando e adicionando contatos
        agenda.addContato("Maria", new Email("maria@email.com"));
        agenda.addContato("Maria", new Telefone("1234-5678"));
        agenda.addContato("José", new Telefone("9999-0000"));

        // Exibindo todas as pessoas
        System.out.println("📋 Lista de pessoas na agenda:");
        agenda.exibirTodasPessoas();

        // Exibindo contatos de Maria
        System.out.println("📞 Contatos da Maria:");
        agenda.exibirContatosPessoa("Maria");

        // Exibindo pessoas com email
        System.out.println("📧 Pessoas com email:");
        agenda.exibirPessoasComEmail();

        // Buscando pessoa por email
        agenda.recuperarPessoaPorEmail("maria@email.com");

        // Buscando pessoa por telefone
        agenda.recuperarPessoaPorTelefone("9999-0000");

        System.out.println("\nEncerrando o programa...\n");
    }
}
