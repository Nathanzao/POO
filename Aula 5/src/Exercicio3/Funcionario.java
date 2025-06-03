package Exercicio3;

public class Funcionario {
    private String nome;
    private int id;
    private float salario;

    public Funcionario(String nomee, int idd, float valor){
        this.id = idd;
        this.nome = nomee;
        this.salario = valor;
    }

    public String getTipo(){ /*Apenas existe para deixar a saida mais bonitinha.*/
        return "Funcionario";
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
