package Exercicio6;

/*

Os atributos são: nome, potência (em W) e o tempo de utilização diária.
Os métodos são:
· Um construtor sem parâmetros e um construtor com parâmetros
· Um método get e um método set para cada atributo
- Um método para retornar a quantidade de Watts gastos por dia pelo
eletrodoméstico: float wattsDia()
- Cálculo: Potencia * tempo de utilização diária
· Um método para retornar a quantidade de Watts gastos por mês pelo
eletrodoméstico: float wattsMes()
- Cálculo: wattsDia() * 30
· Um método para retornar a quantidade de Watts gastos por ano pelo
eletrodoméstico: float wattsAno()
- Cálculo: wattsMes() * 12
· Um método para calcular o custo mensal em reais com o eletrodoméstico. Para isso deve-se
passar como parâmetro para o método o custo do Kwatts. float gastoMes(float precoKwatts)
- Cálculo: divida o wattsMes por 1000 e multiplique pelo preço dos Kwatts
· Um método para exibir um relatório, passando como parâmetro o custo do Kwatts.
Exemplo de relatório:
Eletrodoméstico: Telefone Sem Fio
Potência do aparelho: P=3.0 watts;
Tempo de utilização do aparelho: 24.0 horas/dia
Watts/Dia = 72.0 W
Watts/Mês = 2160.0 W
Watts/Ano = 25920.0 W
Preço do Kwatt R$ 0.27
Gasto mensal é: R$ 0.58320004



 */

public class Eletrodomesticos {
    String nome;
    float potencia;
    float tempoDeUso;

    Eletrodomesticos(){
        this.nome = "NULL";
        this.potencia = 00;
        this.tempoDeUso = 00;
    }

    Eletrodomesticos(String nomes, float potencias, float tempo){
        this.nome = nomes;
        this.potencia = potencias;
        this.tempoDeUso = tempo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getTempoDeUso() {
        return tempoDeUso;
    }

    public void setTempoDeUso(float tempoDeUso) {
        this.tempoDeUso = tempoDeUso;
    }

    public float getPotencia() {
        return potencia;
    }

    public void setPotencia(float potencia) {
        this.potencia = potencia;
    }

    float wattsDia(){
        return tempoDeUso * potencia;
    }

    float wattsMes(){
        return tempoDeUso * potencia * 30;
    }

    float wattsAno(){
        return tempoDeUso * potencia * 30 * 12;
    }

    float gastoMes(float precoKWatts){
        if(precoKWatts < 1){
            System.out.println("Erro.\n");
            return -1;
        }

        float valor = wattsMes();
        valor = valor / 1000;
        valor *= precoKWatts;

        return valor;
    }

    void exibir(float precoKwatts){
        System.out.println("Nome: " + nome + "\n");
        System.out.println("Potencia: " + potencia + " watts/hora.\n");
        System.out.println("Tempo de uso: " + tempoDeUso + " por dia.\n");
        System.out.println("Watts/Dia: " + wattsDia() + "W.\n");
        System.out.println("Watts/Mes: " + wattsMes() + "W.\n");
        System.out.println("Watts/Ano: " + wattsAno() + "W.\n");
        System.out.println("Custo do Watts mensal: " + precoKwatts + "\n");
        System.out.println("Custo do Watts no mês: " + gastoMes(precoKwatts) + " ao mês.\n");
    }
}
