package Exercicio2;

public class Nacional extends Produto{
    private float taxa = 0.05f;

    public Nacional(String descri, int val){
        super(descri, val, 0.10f);
    }

    public float calcularCusto(){
        float mudado = 1 + getImposto() + taxa;
        return getValor() * mudado;
    }

    public float getTaxa() {
        return taxa;
    }

    public void setTaxa(float taxa) {
        this.taxa = taxa;
    }
}
