package Exercicio2;

public class Estadual extends Produto {

    public Estadual(String descri, int val){
        super(descri, val, 0.10f);
    }

    public float calcularCusto(){
        return (getValor() * getImposto()) + 1;
    }
}
