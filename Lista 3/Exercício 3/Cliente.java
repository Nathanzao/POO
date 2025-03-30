/* Um banco mantém contas de clientes armazenando o número da conta, o nome do cliente e
o saldo atual da conta. Os clientes podem depositar o quanto quiserem nas contas, mas podem
sacar somente enquanto a conta possuir saldo positivo. */

public class Cliente {
    int numConta;
    String nome;
    int saldo;

    void depositar(int valor){
        saldo += valor;
    }

    void sacar(int valor){
        if(saldo <= 0){
            return;
        }else{
            saldo -= valor;
        }
    }
    


    public Cliente(String nome, int numConta, int saldo){
        this.nome = nome;
        this.numConta = numConta;
        this.saldo = saldo;
    }

}
