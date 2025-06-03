package Exercicio2;

public class Importado extends Produto{
    private float taxa = 0.05f;
    private float taxaImportacao = 0.05f;

    public Importado(String descri, int val){
        super(descri, val, 0.10f);
    }

    public float calcularCusto(){
        float mudado = 1 + getImposto() + taxa + taxaImportacao;
        return getValor() * mudado;
    }

    public float getTaxa() {
        return taxa;
    }

    public void setTaxa(float taxa) {
        this.taxa = taxa;
    }

    public float getTaxaImportacao() {
        return taxaImportacao;
    }

    public void setTaxaImportacao(float taxaImportacao) {
        this.taxaImportacao = taxaImportacao;
    }
}
