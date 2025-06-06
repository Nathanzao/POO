package Exercicio1Exemplo;

public class Principal {
    public static void main(String[] args) {
        Agenda agends = new Agenda("Gugas Leao", 2);
        Telefone t1 = new Telefone("1234");
        Email e1 = new Email("nathansilveira2104@gmail.com");

        Pessoa p1 = new Pessoa("Nathan Alves", 2);


        agends.addPessoa(p1);
        agends.addContato("Nathan Alves", t1);
        agends.addContato("Nathan Alves", e1);

        agends.exibirTodasPessoas();
        agends.exibirPessoasComEmail();
        agends.recuperarPessoaPorEmail("nathansilveira2104@gmail.com");


        System.out.println("Encerrando...");
    }
}
