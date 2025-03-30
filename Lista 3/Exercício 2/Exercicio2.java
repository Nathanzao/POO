/* Uma academia mantem registro de seus alunos armazenando nome, idade, peso e altura. A
academia faz um desconto especial para menores de idade, portanto, é necessário saber
distinguir entre um aluno maior e menor. Além disso, a academia também tem interesse em
acompanhar o desempenho de seus alunos, por isso, ela também necessita conhecer o índice
de massa corporal (IMC) deles, sendo que o IMC = peso / altura ^ 2. */

public class Exercicio2 {

    public static void main(String[] args) {
        Academia acad = new Academia(80, 1.60f, 17); 
        
        float imcc = acad.IMC();
        System.out.println("IMC = " + imcc);
        
        if(acad.desconto() == true){
            System.out.println("Há desconto!");
        }else{
            System.out.println("Não há desconto!");
        }
    }
}
