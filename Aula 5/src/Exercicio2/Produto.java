package Exercicio2;

public class Produto { /*Poderia usar classe abstrata e criar um método abstrato para retornar o custo.*/
    private String descricao;
    private int valor;
    private float imposto;

    public Produto(String descri, int val, float impos){
        this.descricao = descri;
        this.valor = val;
        this.imposto = impos;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public float getImposto() {
        return imposto;
    }

    public void setImposto(float imposto) {
        this.imposto = imposto;
    }
}
