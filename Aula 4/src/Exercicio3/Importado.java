package Exercicio3;

/*

3) Construa um programa com entrada e saída de dados para representar três tipos de produtos,
os quais são vendidos em três níveis: Estadual, Nacional e Importado. Cada nível possui um
tipo diferente de tributação e taxas, as quais deverão ser levadas em conta para calcular o valor
final do produto que será exibido no relatório.
Os atributos de cada nível de produto são:
Estadual: descricao, valor, imposto;
Nacional: descricao, valor, imposto, taxa;
Importado: descricao, valor, imposto, taxa, taxaImportacao;
O imposto do produto estadual é de 10%. O imposto do produto nacional é de 10% e taxa de
5%. O imposto do produto importado é de 10%, taxa de 5% e taxa de importação de 5%.
Faça um método relatório para cada classe, o qual informa o conteúdo dos atributos e o valor
do produto.
MENU
1 – Cadastrar Produto Estadual
2 – Cadastrar Produto Nacional
3 – Cadastrar Produto Importado
4 – Exibir Produtos Estaduais
5 – Exibir Produtos Nacionais
6 – Exibir Produtos Importados
7 – Exibir Todos Produtos
9 – SAIR

 */

public class Importado {
    private String descricao;
    private float valor;
    private float imposto = 0.10f;
    private float taxa = 0.05f;
    private float taxaImportacao = 0.05f;

    Importado(String descri, float preco){
        this.descricao = descri;
        this.valor = preco;
    }

    float valorProduto(){
        float mudado = 1 + valor + imposto + taxa + taxaImportacao;
        return valor * mudado;
    }

    void exibir(){
        System.out.println("Descrição do produto: " + descricao + ".\n");
        System.out.println("Valor do produto: " + valor + " reais.\n");
        System.out.println("Imposto do produto: " + imposto + " porcento.\n");
        System.out.println("Taxa do produto: " + taxa + " porcento.\n");
        System.out.println("Taxa de importação do produto: " + taxaImportacao + " porcento.\n");
        System.out.println("Valor com impostos: " + valorProduto() + " reais.\n");
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public float getImposto() {
        return imposto;
    }

    public void setImposto(float imposto) {
        this.imposto = imposto;
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
