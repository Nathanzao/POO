package Exercicio2;
import java.util.Scanner;

public class Sistema {
    public void menu(){
        System.out.println("\nMENU");
        System.out.println("1 – Cadastrar Produto Estadual");
        System.out.println("2 – Cadastrar Produto Nacional");
        System.out.println("3 – Cadastrar Produto Importado");
        System.out.println("4 – Exibir Produtos Estaduais");
        System.out.println("5 – Exibir Produtos Nacionais");
        System.out.println("6 – Exibir Produtos Importados");
        System.out.println("7 – Exibir Todos Produtos");
        System.out.println("9 – SAIR");
        System.out.print("Escolha uma opção: ");
    }

    public void executar(){
        Scanner scanner = new Scanner(System.in);
        int opcao;
        int MAX = 3;


        Importado[] importados = new Importado[MAX];
        int contadorImportados = 0;

        Estadual[] estaduais = new Estadual[MAX];
        int contadorEstaduais = 0;

        Nacional[] nacionais = new Nacional[MAX];
        int contadorNacionais = 0;

        do{
            menu();
            opcao = scanner.nextInt();
            scanner.nextLine();/*Limpa buffer.*/



            switch (opcao) {
                case 1:
                    if (contadorEstaduais < MAX) { /*LEMBRAR DOS CONTADORES.*/
                        System.out.print("Descrição: ");
                        String descEst = scanner.nextLine();
                        System.out.print("Valor: ");
                        int valEst = scanner.nextInt();

                        estaduais[contadorEstaduais] = new Estadual(descEst, valEst);
                        contadorEstaduais++;
                    } else {
                        System.out.println("Limite de produtos estaduais atingido.");
                    }
                    break;

                case 2:
                    if (contadorNacionais < MAX) {
                        System.out.print("Descrição: ");
                        String descNac = scanner.nextLine();
                        System.out.print("Valor: ");
                        int valNac = scanner.nextInt();

                        nacionais[contadorNacionais] = new Nacional(descNac, valNac);
                        contadorNacionais++;
                    } else {
                        System.out.println("Limite de produtos nacionais atingido.");
                    }
                    break;

                case 3:
                    if (contadorImportados < MAX) {
                        System.out.print("Descrição: ");
                        String descImp = scanner.nextLine();
                        System.out.print("Valor: ");
                        int valImp = scanner.nextInt();

                        importados[contadorImportados] = new Importado(descImp, valImp);
                        contadorImportados++;
                    } else {
                        System.out.println("Limite de produtos importados atingido.");
                    }
                    break;

                case 4:
                    System.out.println("\nProdutos Estaduais:");
                    for (int i = 0; i < contadorEstaduais; i++) {
                        System.out.printf("%s - Custo: R$ %.2f%n", estaduais[i].getDescricao(), estaduais[i].calcularCusto());
                    }
                    break;

                case 5:
                    System.out.println("\nProdutos Nacionais:");
                    for (int i = 0; i < contadorNacionais; i++) {
                        System.out.printf("%s - Custo: R$ %.2f%n", nacionais[i].getDescricao(), nacionais[i].calcularCusto());
                    }
                    break;

                case 6:
                    System.out.println("\nProdutos Importados:");
                    for (int i = 0; i < contadorImportados; i++) {
                        System.out.printf("%s - Custo: R$ %.2f%n", importados[i].getDescricao(), importados[i].calcularCusto());
                    }
                    break;

                case 7:
                    System.out.println("\nTodos os Produtos:");
                    for (int i = 0; i < contadorEstaduais; i++) {
                        System.out.printf("[Estadual] %s - Custo: R$ %.2f%n", estaduais[i].getDescricao(), estaduais[i].calcularCusto());
                    }
                    for (int i = 0; i < contadorNacionais; i++) {
                        System.out.printf("[Nacional] %s - Custo: R$ %.2f%n", nacionais[i].getDescricao(), nacionais[i].calcularCusto());
                    }
                    for (int i = 0; i < contadorImportados; i++) {
                        System.out.printf("[Importado] %s - Custo: R$ %.2f%n", importados[i].getDescricao(), importados[i].calcularCusto());
                    }
                    break;

                case 9:
                    System.out.println("Encerrando...");
                    break;

                default:
                    System.out.println("Opção inválida.");
            }

        }while(opcao != 9);

    }
}
