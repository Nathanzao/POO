package Exercicio1;

public abstract class Contato {
    protected String tipo;

    public Contato(String tipo){
        this.tipo = tipo;
    }

    public abstract void exibir();
}
