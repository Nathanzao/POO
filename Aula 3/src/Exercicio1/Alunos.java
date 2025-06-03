package Exercicio1;

public class Alunos {
    float RA;
    String nome;
    int trabalho1;
    int trabalho2;
    int prova1;
    int prova2;

    public Alunos(float ra, String nomes, int t1, int t2, int p1, int p2){ //construtor com dados.
        this.RA = ra;
        this.nome = nomes;
        this.prova1 = p1;
        this.prova2 = p2;
        this.trabalho1 = t1;
        this.trabalho2 = t2;
    }

    String getNome(){
        return nome;
    }

    float getRA(){
        return RA;
    }

    int getTrabalho1(){
        return trabalho1;
    }

    int getTrabalho2(){
        return trabalho2;
    }

    int getProva1(){
        return prova1;
    }

    int getProva2(){
        return prova2;
    }

    void setNome(String dado){
        this.nome = dado;
    }

    void setRA(float dado){
        this.RA = dado;
    }

    void setTrabalho1(int dado){
        this.trabalho1 = dado;
    }

    void setTrabalho2(int dado){
        this.trabalho2 = dado;
    }

    void setProva1(int dado){
        this.prova1 = dado;
    }

    void setProva2(int dado){
        this.prova2 = dado;
    }

    float media(){
        int soma = trabalho1 + trabalho2 + prova1 + prova2;
        return (soma/4);
    }

    boolean aprovado(){
        float valor = media();
        if(valor >= 5){
            return true;
        }else{
            return false;
        }
    }
}
