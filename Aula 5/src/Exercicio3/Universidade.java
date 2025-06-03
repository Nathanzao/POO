package Exercicio3;

public class Universidade {
    private String nome;

    private int MAX = 3;
    private int contadorDepartamentos = 0;
    Departamento[] departamentos = new Departamento[MAX];

    public void adicionarDepartamento(Departamento d){
        if(contadorDepartamentos < MAX){
            departamentos[contadorDepartamentos] = d;
            contadorDepartamentos++;
        }else{
            System.out.println("\nSem mais espaco para departamentos.\n");
        }
    }

    public void listarDepartamentos(){
        System.out.println("\n\n\n      Departamentos: \n\n");
        for (int i = 0; i < contadorDepartamentos; i++) {
            System.out.println("\n\nDepartamento " + (i+1) + ":\n");
            System.out.println("Nome do departamento: " + departamentos[i].getNome() + ".");
        }
    }

    public void buscarDepartamentoPorCodigo(int codigo){ /*Nao retorna, so mostra as informações do departamento.*/
        int i = 0;

        while(departamentos[i].getCodigo() != codigo){
            i++;

            if(i > contadorDepartamentos){
                System.out.println("\nErro. Departamento nao encontrado.\n");
                return;
            }
        }

        System.out.println("\nDepartamento encontrado. Nome: " + departamentos[i].getNome() + ", com codigo " +
                departamentos[i].getCodigo() + ".\n");
    }

    public Universidade(String nome){
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getContadorDepartamentos() {
        return contadorDepartamentos;
    }
}
