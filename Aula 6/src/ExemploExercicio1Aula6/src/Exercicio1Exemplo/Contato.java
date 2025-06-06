package Exercicio1Exemplo;

public abstract class Contato {
    protected String tipo;

    public Contato(String tipoo){
        this.tipo = tipoo;
    }

    public abstract void exibir();
}
