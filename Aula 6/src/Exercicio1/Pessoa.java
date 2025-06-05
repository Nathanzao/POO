package Exercicio1;

public class Pessoa {
    private Contato[] contatos;
    private String nome;
    private int max; /*Maximo de contatos.*/
    private int cont; /*Quantidade de contatos ja inseridos.*/

    public Pessoa(String nome, int max){
        this.nome = nome;
        this.max = max;

        this.contatos = new Contato[max];
        this.cont = 0;
    }

    public void adicionarContato(Contato c){
        if(cont >= max){
            System.out.println("Erro. Muitos contatos.\nVoltando...\n");
        }else{
            contatos[cont] = c;
            cont++;
        }
    }

    public Contato[] getContatos(){
        return contatos; /*Retorna o vetor.*/
    }

    public Contato[] getContatosDeTipo(String tipoo){ /*Retorna os contatos do tipo indicado.*/
        int i = 0, j = 0;

        if(tipoo.equals(Utilitaria.tel)){
            Contato[] contatosTipo = new Contato[Utilitaria.contadorContatosTelefone];
            while(i < cont){
                if(contatos[i].tipo.equals(tipoo)){
                    contatosTipo[j++] = contatos[i];
                }
                i++;
            }
            return contatosTipo;
        }else{
            Contato[] contatosTipo = new Contato[Utilitaria.contadorContatosEmail];
            while(i < cont){
                if(contatos[i].tipo.equals(tipoo)){
                    contatosTipo[j++] = contatos[i];
                }
                i++;
            }
            return contatosTipo;
        }
    }

    public boolean possuiEmail(){ /*Retorna verdadeiro se o contador de emails for maior que zero.*/
        return Utilitaria.contadorContatosEmail >= 0;
    }

    public boolean possuiTelefone(){
        return Utilitaria.contadorContatosTelefone >= 0;
    }

    public void exibirContatos(){
        int i = 0;

        System.out.println("\n\nExibindo contatos de " + nome + ":\n");
        while(i < cont){
            contatos[i].exibir();
            i++;
        }
    }

    public String getNome() {
        return nome;
    }

    public int getCont() {
        return cont;
    }
}
