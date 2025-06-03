package Exercicio1;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("Digite o nome do aluno: ");
        String nome = sc.nextLine();
        System.out.println("\n");


        Alunos aluno = new Alunos(12341, "Nathan Alves", 3, 3, 3, 3);

        if ((aluno.aprovado()) == true) {
            System.out.println("Aluno " + aluno.nome + " foi aprovado!");
        } else {
            System.out.println("Aluno " + aluno.nome + " foi reprovado!");
        }
    }
}