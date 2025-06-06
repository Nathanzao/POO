package Exercicio1Exemplo;

public class Pessoa {
    private Contato[] contatos;
    private String nome;
    private int max;
    private int cont;

    public Pessoa(String nomee, int maxx){
        this.nome = nomee;
        this.max = maxx;

        this.cont = 0;
        this.contatos = new Contato[maxx];
    }

    public void adicionarContato(Contato c){
        if(cont < max){
            contatos[cont] = c;
            cont++;
        }else{
            System.out.println("Erro. Tamanho maximo atingido.");
        }
    }

    public Contato[] getContatos(){
        return contatos;
    }

    public Contato[] getContatos(String tipoo){
        Contato[] analisar;
        int i = 0;
        int contador2 = 0;

        while(i < cont){
            if(contatos[i].tipo.equals(tipoo)){
                contador2++;
            }
            i++;
        }

        analisar = new Contato[contador2];

        i = 0;
        contador2 = 0;
        while(i < cont){
            if(contatos[i].tipo.equals(tipoo)){
                analisar[contador2] = contatos[i];
                contador2++;
            }
            i++;
        }

        return analisar;

    }

    public boolean possuiEmail(){
        int i = 0;

        while(i < cont){
            if(contatos[i].tipo.equals("Email")){
                return true;
            }
            i++;
        }

        return false;
    }

    public boolean possuiTelefone(){
        int i = 0;

        while(i < cont){
            if(contatos[i].tipo.equals("Telefone")){
                return true;
            }
            i++;
        }

        return false;
    }

    public void exibirContatos(){
        int i = 0;

        while(i < cont){
            contatos[i].exibir();
            i++;
        }
    }

    public int getCont() {
        return cont;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
