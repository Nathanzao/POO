/* 
 * 
2) Implemente uma classe que represente uma Conta Corrente Especial, em que os clientes
possuem um limite negativo para saque.
Os atributos são: Numero, Titular, saldo e limite da conta.
Os métodos são:
· Um construtor sem parâmetros e um construtor com parâmetros
· Um método get e um método set para cada atributo
· Um método para exibir os valores dos atributos
· Um método para realizar depósito de dinheiro: void depositar(float valor)
Neste método deve-se somar o valor recebido por parâmetros ao saldo
· Um método para realizar saque: void saque(float valor)
Este método é um pouco diferente do método da conta corrente simples. Nesse caso, o saque
pode ultrapassar o valor de saldo até o limite. Por exemplo: se meu saldo é de 300 reais e tenho
200 reais de limite, posso realizar saque de até 500 reais. Portanto, deve-se verificar se a soma
do saldo + o limite é maior ou igual ao valor a ser retirado. Se for o suficiente realize a operação;
do contrário, emita uma mensagem de erro informando que o saldo é insuficiente. No depósito
e no saque é necessário buscar a conta pelo número antes de efetuar a operação.
MENU
1 – Cadastrar Nova Conta
2 – Saque
3 – Depósito
4 – Listar Contas (posição do vetor e nome dos clientes)
5 – Relatório Geral (todas as contas)
6 – Relatório de Contas cujo saldo está abaixo de zero
7 – Relatório da Conta de um determinado cliente
9 – Sair
 * 
 */

public class Conta {
    private int numero;
    private String titular;
    private float saldo;
    private float limite;

    public Conta(){
        this.limite = -1000;
        this.numero = 123;
        this.saldo = 1000;
        this.titular = "Nathan";
    }

    public Conta(int numero, String titular, float saldo, float limite){
        this.titular = titular;
        this.numero = numero;
        this.saldo = saldo;
        this.limite = limite;
    }

    public int getNumero(){
        return numero;
    }

    public void setNumero(int numero){
        this.numero = numero;
    }

    public String getTitular(){
        return titular;
    }

    public void setTitular(String titular){
        this.titular = titular;
    }

    public float getSaldo(){
        return saldo;
    }

    public void setSaldo(float saldo){
        this.saldo = saldo;
    }

    public float getLimite(){
        return limite;
    }

    public void setLimite(float limite){
        this.limite = limite;
    }

    void saque(float sacar){
        float valor = getSaldo();
        
        if(sacar < (valor + limite)){
            valor = valor - sacar;
            setSaldo(valor);
        }else{
            System.out.println("Erro.");
        }
    }

    void deposita(float depositar){
        float valor = getSaldo();

        if(depositar <= 0){
            System.out.println("Valor inválido.");
        }

        valor = valor + depositar;
        setSaldo(valor);
    }

    
}
