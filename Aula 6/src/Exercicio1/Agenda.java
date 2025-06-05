package Exercicio1;

/*
Primeiro, adiciona-se uma pessoa. Depois, cria=se um contato para esta pessoa.
 */

public class Agenda {
    private String proprietario;
    private Pessoa[] pessoas;
    private int max;
    private int cont;

    public Agenda(String proprietario, int max){
        this.proprietario = proprietario;
        this.max = max;

        this.cont = 0;
        this.pessoas = new Pessoa[max];
    }

    public void addPessoa(Pessoa p){
        if(cont >= max){
            System.out.println("\nErro. Quantidade maxima de pessoas.\nVoltando...\n");
        }else{
            pessoas[cont] = p;
            cont++;
        }
    }

    public Pessoa buscarPessoa(String nomee){
        int i = 0;

        while(i < cont){
            if(pessoas[i].getNome().equals(nomee)){
                return pessoas[i];
            }
            i++;
        }

        System.out.println("\nPessoa nao encontrada.\n");
        return null;
    }

    public void addContato(String nomee, Contato c){
        Pessoa p = buscarPessoa(nomee);

        if(p != null){
            p.adicionarContato(c);
        }else{
            System.out.println("\nPessoa nao encontrada.\n");
        }
    }

    public void exibirTodasPessoas(){
        int i = 0;

        while(i < cont){
            System.out.println("Nome da pessoa " + (i+1) + ": " + pessoas[i].getNome() + ".\n");
            i++;
        }
    }

    public void exibirContatosPessoa(String nomee){
        Pessoa p = buscarPessoa(nomee);

        if(p != null){
            p.exibirContatos();
        }else{
            System.out.println("\nPessoa nao encontrada.\n");
        }
    }

    public void exibirPessoasComEmail(){
        int i = 0;
        Contato[] analisar;


        while(i < cont){
            analisar = pessoas[i].getContatos();

            int j = 0;
            while(j < pessoas[i].getCont()) {
                if (analisar[j].tipo.equals(Utilitaria.em)) {
                    System.out.println("A pessoa " + pessoas[i].getNome() + " tem email em seus contatos.\n");
                }
                j++;
            }

            i++;
        }
    }

    public void recuperarPessoaPorEmail(String emaill){
        int i = 0;
        Contato[] analisar;

        while(i < cont){
            analisar = pessoas[i].getContatos();

            int j = 0;
            while(j < pessoas[i].getCont()){
                if(analisar[j] instanceof Email && ((Email)analisar[j]).getEmail().equals(emaill)){
                    System.out.println("Pessoa achada: " + pessoas[i].getNome());
                }
                j++;
            }

            i++;
        }
    }

    public void recuperarPessoaPorTelefone(String telefonee){
        int i = 0;
        Contato[] analisar;

        while(i < cont){
            analisar = pessoas[i].getContatos();

            int j = 0;
            while(j < pessoas[i].getCont()){
                if(analisar[j] instanceof Telefone && ((Telefone)analisar[j]).getTelefone().equals(telefonee)){
                    System.out.println("Pessoa achada: " + pessoas[i].getNome());
                }
                j++;
            }
            i++;
        }
    }
}
