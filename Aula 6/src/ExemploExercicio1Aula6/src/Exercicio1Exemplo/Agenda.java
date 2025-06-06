package Exercicio1Exemplo;

public class Agenda {
    private String proprietario;
    private Pessoa[] pessoas;
    private int max;
    private int cont;

    public Agenda(String nomee, int maxx){
        this.proprietario = nomee;
        this.max = maxx;

        this.cont = 0;
        pessoas = new Pessoa[maxx];
    }

    public void addPessoa(Pessoa p){
        if(cont < max){
            pessoas[cont] = p;
            cont++;
        }else{
            System.out.println("Erro. Numero maximo de pessoas atingido.");
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

        return null;
    }

    public void addContato(String nomee, Contato c){
        int i = 0;

        while(i < cont){
            if(pessoas[i].getNome().equals(nomee)){
                pessoas[i].adicionarContato(c);
            }
            i++;
        }
    }

    public void exibirTodasPessoas(){
        int i = 0;

        System.out.println("Exibindo pessoas: \n");
        while(i < cont){
            System.out.println("Nome: " + pessoas[i].getNome() + ".");
            i++;
        }
    }

    public void exibirContatosPessoa(String nomee){
        int i = 0;

        while(i < cont){
            if(pessoas[i].getNome().equals(nomee)){
                System.out.println("Nome: " + pessoas[i].getNome());
                pessoas[i].exibirContatos();
            }
            i++;
        }
    }

    public void exibirPessoasComEmail(){
        int i = 0;

        while(i < cont){
            if(pessoas[i].possuiEmail()){
                System.out.println("Pessoa " + pessoas[i].getNome() + " tem email.");
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
                    System.out.println("Pessoa encontrada: " + pessoas[i].getNome());
                    break;
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
                if(analisar[j] instanceof Telefone && ((Telefone)analisar[i]).getTelefone().equals(telefonee)){
                    System.out.println("Pessoa encontrada: " + pessoas[i].getNome());
                    break;
                }
            }
            i++;
        }
    }

}
