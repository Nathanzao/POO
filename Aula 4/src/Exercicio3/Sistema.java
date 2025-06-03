package Exercicio3;
import java.util.Scanner;

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

public class Sistema {
    void menu(){
        System.out.println("1 - Cadastrar Produto Estadual\n");
        System.out.println("2 - Cadastrar Produto Nacional\n");
        System.out.println("3 - Cadastrar Produto Importado\n");
        System.out.println("4 - Exibir Produtos Estaduais\n");
        System.out.println("5 - Exibir Produtos Nacionais\n");
        System.out.println("6 - Exibir Produtos Importados\n");
        System.out.println("7 - Exibir Todos Produtos\n");
        System.out.println("9 - Sair\n");



        System.out.println("Digite a operação desejada: ");
    }

    void executar(){
        Scanner sc = new Scanner(System.in);
        int operacao;

        String descri;
        float custo;

        int contadorEstadual = 0;
        Estadual vEstaduais[] = new Estadual[5];

        int contadorNacional = 0;
        Nacional vNacional[] = new Nacional[5];

        int contadorImportado = 0;
        Importado vImportado[] = new Importado[5];


        do{
            menu();
            operacao = sc.nextInt();
            sc.nextLine(); /*Limpa buffer.*/

            switch (operacao){
                case 1:
                    System.out.println("Digite a descrição do produto: ");
                    descri = sc.nextLine();

                    System.out.println("\nDigite o preço do produto: ");
                    custo = sc.nextFloat();

                    sc.nextLine(); /*Limpa buffer.*/

                    vEstaduais[contadorEstadual] = new Estadual(descri, custo);
                    contadorEstadual++;
                    break;

                case 2:
                    System.out.println("Digite a descrição do produto: ");
                    descri = sc.nextLine();

                    System.out.println("\nDigite o preço do produto: ");
                    custo = sc.nextFloat();

                    sc.nextLine(); /*Limpa buffer.*/

                    vNacional[contadorNacional] = new Nacional(descri, custo);
                    contadorNacional++;
                    break;

                case 3:
                    System.out.println("Digite a descrição do produto: ");
                    descri = sc.nextLine();

                    System.out.println("\nDigite o preço do produto: ");
                    custo = sc.nextFloat();

                    sc.nextLine(); /*Limpa buffer.*/

                    vImportado[contadorImportado] = new Importado(descri, custo);
                    contadorImportado++;
                    break;

                case 4:
                    for (int i = 0; i < contadorEstadual; i++) {
                        System.out.println("\n  Produto " + i+1 +  " Estadual.   \n");
                        vEstaduais[i].exibir();
                        System.out.println("\n\n");
                    }
                    break;

                case 5:
                    for (int i = 0; i < contadorNacional; i++) {
                        System.out.println("\n  Produto " + i + 1 + " Nacional.   \n");
                        vNacional[i].exibir();
                        System.out.println("\n\n");
                    }
                    break;

                case 6:
                    for (int i = 0; i < contadorImportado; i++) {
                        System.out.println("\n  Produto " + i+1 +  " Importado.   \n");
                        vImportado[i].exibir();
                        System.out.println("\n\n");
                    }
                    break;

                case 7:
                    System.out.println("\n\n  Exibindo todos os produtos. \n\n");

                    System.out.println("\n\n\n      Estaduais:  \n");
                    for (int i = 0; i < 5; i++) {
                        System.out.println("\n  Produto " + i+1 +  " Estadual.   \n");
                        vEstaduais[i].exibir();
                        System.out.println("\n\n");
                    }

                    System.out.println("\n\n\n      Nacionais:\n");
                    for (int i = 0; i < 5; i++) {
                        System.out.println("\n  Produto " + i + 1 + " Nacional.   \n");
                        vNacional[i].exibir();
                        System.out.println("\n\n");
                    }

                    System.out.println("\n\n\n      Importados:\n");
                    for (int i = 0; i < 5; i++) {
                        System.out.println("\n  Produto " + i+1 +  " Importado.   \n");
                        vImportado[i].exibir();
                        System.out.println("\n\n");
                    }
                    break;

            }

        }while (operacao != 9);

    }
}
