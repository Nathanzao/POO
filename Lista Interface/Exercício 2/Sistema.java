/* 
 * 
 * 2) Implemente uma classe que represente uma Conta Corrente Especial, em que os clientes
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

import java.util.Scanner;

public class Sistema {
    
    int tamanho = 10;
    int contador = 0;
    int op;
    private Conta vetor[];

    private int menu(){
        Scanner sc = new Scanner(System.in);
        System.out.println("MENU");
        System.out.println("1 - Cadastrar Nova Conta.");
        System.out.println("2 - Saque.");
        System.out.println("3 - Depósito.");
        System.out.println("4 - Listar Contas (posição do vetor e nome dos clientes).");
        System.out.println("5 - Relatório Geral.");
        System.out.println("6 - Relatório de Contas cujo saldo está abaixo de zero.");
        System.out.println("7 - Relatório da Conta de determinado cliente.");
        System.out.println("9 - Sair.");
        op = Integer.parseInt(sc.nextLine());
        return op;
    }

    public void executar(){
        vetor = new Conta[tamanho];

        Scanner sc = new Scanner(System.in);

        do{
            int numero;
            String titular;
            float saldo;
            float limite;

            op = menu();
            switch (op) {
                case 1:
                    
                if(contador >= tamanho){
                    System.out.println("Sem espaço!");
                }else{
                    System.out.println("Digite seu nome: ");
                    titular = sc.nextLine();
                    System.out.println("Digite o número da conta: ");
                    numero = sc.nextInt();
                    System.out.println("Digite seu saldo: ");
                    saldo = sc.nextFloat();
                    System.out.println("Digite o limite da sua conta: ");
                    limite = sc.nextFloat();

                    sc.nextLine();

                    vetor[contador] = new Conta(numero, titular, saldo, limite);
                    contador++;
                }

                    break; /* BREAK CASE 1 */

                    case 2:
                    int aux;
                    int i = 0;
                    System.out.println("Digite o numero da conta que deseja sacar: ");
                    aux = sc.nextInt();
                    System.out.println("Digite o valor que deseja sacar: ");
                    float quantidade = sc.nextFloat();

                    do{
                        if((vetor[i].getNumero() == aux)){
                            vetor[i].saque(quantidade);
                        }else{
                            i++;
                        }
                    }while((vetor[i].getNumero() != aux) && i < contador);

                    break; /* BREAK CASE 2 */

                    case 3:

                    aux = 0;
                    i = 0;
                    quantidade = 0;
                    System.out.println("Digite o numero da conta que deseja sacar: ");
                    aux = sc.nextInt();
                    System.out.println("Digite o valor que deseja depositar: ");
                    quantidade = sc.nextFloat();

                    do{
                        if((vetor[i].getNumero() == aux)){
                            vetor[i].deposita(quantidade);
                        }else{
                            i++;
                        }
                    }while((vetor[i].getNumero() != aux) && i < contador);

                    break; /* BREAK CASE 3 */

                    case 4:

                    for(i = 0; i < contador; i++){
                        System.out.println("Posicao do vetor [" + i + "] e nome do titular: " + vetor[i].getTitular() + ".\n");
                    }

                    break; /* BREAK CASE 4 */

                    case 5: 

                    for(i = 0; i < contador; i++){
                        System.out.println("Nome do titular na posicao [" + (i+1) + "] = " + vetor[i].getTitular() + "\n");
                        System.out.println("Numero da conta na posicao [" + (i+1) + "] = " + vetor[i].getNumero() + "\n");
                        System.out.println("Quantidade de saldo da conta na posicao [" + (i+1) + "] = " + vetor[i].getSaldo() + "\n");
                        System.out.println("Limite da conta na posicao [" + (i+1) + "] = " + vetor[i].getLimite() + "\n");
                        System.out.println("\n\n\n");
                    }

                    break; /* BREAK CASE 5 */

                    case 6:

                    for(i = 0; i < contador; i++){
                        if((vetor[i].getSaldo()) < 0){
                            System.out.println("A conta na posicao [" + i + "] esta com saldo negativo! PRENEDER!");
                        }
                    }

                    break; /* BREAK CASE 6 */


                    case 7:

                    aux = 0;
                    System.out.println("Digite o numero da conta que deseja acessar: ");
                    aux = sc.nextInt();

                    do{

                    }while

                    System.out.println("NOME: " + vetor[aux].getTitular());
                    System.out.println("SALDO: " + vetor[aux].getSaldo());
                    System.out.println("LIMITE: " + vetor[aux].getLimite());
                    System.out.println("NOME: " + vetor[aux].getNumero());

                    break; /* BREAK CASE 7 */
            
                default:
                    break;
            }

        }while(op != 9);
    }

}
