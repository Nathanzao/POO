package Exercicio3;

public class Departamento {
    private String nome;
    private int codigo;

    private int contadorFuncionarios = 0;
    private int MAX = 3;
    Funcionario[] funcionarios = new Funcionario[MAX];

    public Departamento(String nomee, int codigoo){
        this.codigo = codigoo;
        this.nome = nomee;
    }

    public void adicionarFuncionario(Funcionario f){
        if(contadorFuncionarios < MAX){
            funcionarios[contadorFuncionarios] = f;
            contadorFuncionarios++;
        }else{
            System.out.println("Erro. Máximo de funcionários atingido.\n");
            return;
        }
    }

    public void listarFuncionarios(){
        System.out.println("\n\nListando Funcionarios:\n\n");
        for (int i = 0; i < contadorFuncionarios; i++) {
            System.out.println("\n\nFuncionario " + (i+1) + ":\n");
            System.out.println("[ " + funcionarios[i].getTipo() + "]" +  " - Nome: " + funcionarios[i].getNome() + ", codigo: " +
                    funcionarios[i].getId() + ".");
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getContadorFuncionarios() {
        return contadorFuncionarios;
    }

}
