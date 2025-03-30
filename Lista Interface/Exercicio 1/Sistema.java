/* 
 * 
 * 1) Implemente uma classe que represente o aluno de uma academia.
    Os atributos são: identificador, nome, idade, peso e altura.
    Os métodos são:
· Um construtor sem parâmetros e um construtor com parâmetros
· Um método get e um método set para cada atributo
· Um método para exibir os atributos. void exibir( )
· Um método para calcular o IMC do aluno, sabendo-se que IMC=peso/altura^2
float calcularIMC( )
MENU
1 – Cadastrar Aluno
2 – Listar Alunos (somente nome)
3 – Relatório Geral (exibe todas as informações)
9 – Sair
 * 
 */

import java.util.Scanner;

public class Sistema {

    private int tamanho = 30;
    private int contador = 0;
    int op;
    private Academia vetor[];

    private int menu(){
        Scanner sc = new Scanner(System.in);
        System.out.println("MENU");
        System.out.println("1 - Cadastrar Aluno.");
        System.out.println("2 - Listar Alunos.");
        System.out.println("3 - Relatório Geral.");
        System.out.println("9 - Sair.");
        op = Integer.parseInt(sc.nextLine()); /* SC vai ser lido como STRING, por isso precisa passar para inteiro. */
        return op;
    }

    public void executar(){

        vetor = new Academia[tamanho]; /* Assim, não está alocando mais memória do que deveria? */

        do{
            String nome;
            float idade;
            float peso;
            float altura;

            Scanner sc = new Scanner(System.in);



            op = menu();
            switch (op) {
                case 1:
                    if(contador >= tamanho){
                        System.out.println("Excedido o limite de alunos.");
                        op = 9;
                    }else{
                        System.out.println("Nome:");
                        nome = sc.nextLine();
                        System.out.println("Idade:");
                        idade = sc.nextFloat();
                        System.out.println("Peso:");
                        peso = sc.nextFloat();
                        System.out.println("Altura:");
                        altura = sc.nextFloat();

                        sc.nextLine(); /* Limpar o buffer? */

                        vetor[contador] = new Academia(nome, altura, idade, peso);
                        contador++;
                    }
                    break;
                
                case 2:
                    System.out.println("\n\n");
                    for(int i = 0; i < contador; i++){
                        System.out.println("Nome: " + vetor[i].getNome());
                        System.out.println("\n");
                    }
                    System.out.println("\n\n");
                    break;
                
                case 3:
                int j = 1;
                System.out.println("\n\n");
                    for(int i = 0; i < contador; i++){
                        System.out.println("" + j+ ": \n");
                        System.out.println("Nome: " + vetor[i].getNome());
                        System.out.println("Idade: " + vetor[i].getIdade());
                        System.out.println("Peso: " + vetor[i].getPeso());
                        System.out.println("Altura: " + vetor[i].getAltura());
                        
                        System.out.println("\n");
                        j++;
                    }
                    break;
            
                default:
                    break;
            }
        }while(op != 9);
    }
}