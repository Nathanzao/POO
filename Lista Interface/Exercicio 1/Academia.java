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

 public class Academia{
    private String nome;
    private float idade;
    private float peso;
    private float altura;

    public Academia(){
        this.nome = "Nathan";
        this.altura = 1.80f;
        this.idade = 18;
        this.peso = 80;
    }

    public Academia(String nome, float altura, float idade, float peso){
        this.altura = altura;
        this.nome = nome;
        this.peso = peso;
        this.idade = idade;
    }

    String getNome(){
        return nome;
    }

    void setNome(String nome){
        this.nome = nome;
    }

    float getAltura(){
        return altura;
    }

    void setAltura(float altura){
        this.altura = altura;
    }

    float getIdade(){
        return idade;
    }

    void setIdade(float Idade){
        this.idade = Idade;
    }

    float getPeso(){
        return peso;
    }

    void setPeso(float peso){
        this.peso = peso;
    }

    void exibir(){
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade); /* printf("Idade = %d", &idade) */
        System.out.println("Peso: " + peso);
        System.out.println("Altura: " + altura);
    }

    float calcularIMC(){
        return peso /(altura * altura);
    }
}