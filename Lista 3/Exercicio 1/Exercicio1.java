
/* Os alunos da disciplina de Programação Orientada a Objetos da FCT/Unesp desenvolverão
dois trabalhos e duas provas ao longo do semestre. Considere que, nesse caso, a média final é
calculada pela média aritmética simples de todas as notas e que o aluno é aprovado somente
se obtiver média maior ou igual a cinco.
O Aluno possui como informação o RA, Nome e as notas – a média é calculada a partir das
notas e não precisa ser armazenada. */



public class Exercicio1{

    public static void main(String[] args){

        Aluno al = new Aluno("Nathan", "333", 6, 3);

        if(al.aprovado() == true){
            System.out.println("Aprovado!");
        }else{
            System.out.println("Reprovado!");
        }

    }
}