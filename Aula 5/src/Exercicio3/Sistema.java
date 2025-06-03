package Exercicio3;
import java.util.Scanner;

public class Sistema {
    Universidade universi = new Universidade("UNESP - FCT");
    int MAX = 3;
    int opcao = 999;


    Departamento departa;
    Funcionario funcionario1;
    Tecnico tec;
    Docente doc;


    Scanner sc = new Scanner(System.in);


    public void menu(){
        System.out.println("\nMENU");
        System.out.println("1 – Cadastrar Departamento");
        System.out.println("2 – Cadastrar Funcionário Técnico");
        System.out.println("3 – Cadastrar Funcionário Docente");
        System.out.println("4 – Buscar Departamento por Nome");
        System.out.println("5 – Buscar Funcionário por Nome");
        System.out.println("6 – Listar Departamentos com Funcionários com Faixa Salarial Específica");
        System.out.println("7 – Listar Funcionários com Faixa Salarial Específica");
        System.out.println("8 – Listar Departamentos cujo gasto total está entre uma Faixa de Valores Específica");
        System.out.println("9 – Listar todos Funcionários da Universidade");
        System.out.println("10 – Listar todos Departamentos da Universidade");
        System.out.println("11 – Listar todos Departamentos da Universidade e seus Respectivos Funcionários");
        System.out.println("12 – Listar todos Funcionários Docente");
        System.out.println("13 – Listar todos Funcionários Técnico");
        System.out.println("0 – Sair");
        System.out.print("Escolha uma opção: ");
    }

    public void cadastrarDepartamento(){
        System.out.println("\nDigite o nome do departamento: ");
        String nomee = sc.nextLine();
        System.out.println("\nDigite o codigo do departamento: ");
        int codigoo = sc.nextInt();
        sc.nextLine();

        departa = new Departamento(nomee, codigoo);

        universi.adicionarDepartamento(departa);
    }

    public void cadastrarFuncionarioTecnico(){
        System.out.print("Nome do funcionário: ");
        String nome = sc.nextLine();
        System.out.print("ID do funcionário: ");
        int id = sc.nextInt();
        System.out.print("Salário: ");
        float salario = sc.nextFloat();
        sc.nextLine();
        System.out.println("Digite a funcao desse funcionario: ");
        String func = sc.nextLine();

        tec = new Tecnico(nome, id, salario, func);


        System.out.println("\nDigite o codigo do departamento que esse funcionario sera colocado: ");
        int codigo = sc.nextInt();


        int i = 0;
        while(universi.departamentos[i].getCodigo() != codigo){
            i++;

            if(i > universi.getContadorDepartamentos()){
                System.out.println("\nErro. Departamento nao encontrado.\n");
                return;
            }
        }

        universi.departamentos[i].adicionarFuncionario(tec);
    }

    public void cadastrarFuncionarioDocente(){
        System.out.print("Nome do funcionário: ");
        String nome = sc.nextLine();
        System.out.print("ID do funcionário: ");
        int id = sc.nextInt();
        System.out.print("Salário: ");
        float salario = sc.nextFloat();
        sc.nextLine();
        System.out.println("Digite a area desse funcionario: ");
        String areaa = sc.nextLine();

        doc = new Docente(nome, id, salario, areaa);


        System.out.println("\nDigite o codigo do departamento que esse funcionario sera colocado: ");
        int codigo = sc.nextInt();


        int i = 0;
        while(universi.departamentos[i].getCodigo() != codigo){
            i++;

            if(i > universi.getContadorDepartamentos()){
                System.out.println("\nErro. Departamento nao encontrado.\n");
                return;
            }
        }

        universi.departamentos[i].adicionarFuncionario(doc);
    }

    public void buscarDepartamentoPorNome(){
        int i = 0;

        System.out.println("\nDigite o nome do departamento que deseja encontrar: ");
        String rotulo = sc.nextLine();

        boolean achado = false;
        while(i < universi.getContadorDepartamentos()){
            if(universi.departamentos[i].getNome().equals(rotulo)){
                achado = true;
                System.out.println("\nDepartamento encontrado.\n");
            }
            i++;
        }

        if(!achado){
            System.out.println("\nDepartamento nao encontrado.\n");
        }
    }

    public void buscarFuncionarioPorNome(){
        int i = 0;
        int j = 0;

        System.out.println("\nDigite o nome do funcionario que devera ser encontrado: ");
        String rotulo = sc.nextLine();

        boolean achado = false;
        while(i < universi.getContadorDepartamentos()){
            j = 0;
            while(j < universi.departamentos[i].getContadorFuncionarios()){
                if(universi.departamentos[i].funcionarios[j].getNome().equals(rotulo)){
                    achado = true;
                    System.out.println("\nFuncionario encontrado.\n");
                }
                j++;
            }
            i++;
        }

        if(!achado){
            System.out.println("\nFuncionario nao encontrado.\n");
        }
    }

    public void listarDepartamentosComFaixaSalarial(){
        int i = 0;
        int j = 0;

        System.out.println("Digite a partir de qual faixa salarial desejada ver: ");
        float faixa = sc.nextFloat();
        sc.nextLine();

        while(i < universi.getContadorDepartamentos()){
            while(j < universi.departamentos[i].getContadorFuncionarios()){
                if((universi.departamentos[i].funcionarios[j].getSalario()) > faixa){
                    System.out.println("[Departamento de " + universi.departamentos[i].getNome() + "].\n");
                }
                j++;
            }
            j = 0;
            i++;
        }

    }

    public void listarFuncionariosComFaixaSalarial(){
        int i = 0;
        int j = 0;

        System.out.println("Digite a partir de qual faixa salarial desejada ver: ");
        float faixa = sc.nextFloat();
        sc.nextLine();

        while(i < universi.getContadorDepartamentos()){
            while(j < universi.departamentos[i].getContadorFuncionarios()){
                if((universi.departamentos[i].funcionarios[j].getSalario()) > faixa){
                    System.out.println("[Departamento de " + universi.departamentos[i].getNome() + "]: "
                    + universi.departamentos[i].funcionarios[j].getNome() + ".\n");
                }
                j++;
            }
            j = 0;
            i++;
        }
    }

    public void listarDepartamentosComGastoDeFaixa(){
        int i = 0;
        int j = 0;
        float soma = 0;

        System.out.println("Digite a partir de qual valor desejada ver: ");
        float faixa = sc.nextFloat();
        sc.nextLine();

        while(i < universi.getContadorDepartamentos()){
            while(j < universi.departamentos[i].getContadorFuncionarios()){
                soma += universi.departamentos[i].funcionarios[j].getSalario();
                j++;
            }
            if(soma >= faixa){
                System.out.println("[Departamento de " + universi.departamentos[i].getNome() + "].\n");
            }
            j = 0;
            i++;
        }

    }

    public void listarTodosFuncionariosUniversidade(){
        int i = 0;

        while(i < universi.getContadorDepartamentos()){
            System.out.println("\nListando funcionarios do departamento " + (i+1) + ": \n");
            universi.departamentos[i].listarFuncionarios();
            System.out.println("\n\n");
            i++;
        }
    }

    public void listarDepartamentosComFuncionarios() { /*GPT.*/
        for (Departamento d : universi.departamentos) {
            if (d != null) {
                System.out.println("\nDepartamento: " + d.getNome());
                for (Funcionario f : d.funcionarios) {
                    if (f != null) System.out.println("  " + f.getTipo() + " - " + f.getNome());
                }
            }
        }
    }

    public void listarTodosDocentes(){
        int i = 0;
        int j = 0;

        while(i < universi.getContadorDepartamentos()){
            while(j < universi.departamentos[i].getContadorFuncionarios()){
                System.out.println("\nListando todos os docentes: \n");
                if(universi.departamentos[i].funcionarios[j].getTipo().equals("Docente")){
                    System.out.println("  " + universi.departamentos[i].funcionarios[j].getTipo()
                            + " - " + universi.departamentos[i].funcionarios[j].getNome());
                }
                j++;
            }
            j = 0;
            i++;
        }
    }

    public void listarTodosTecnicos(){
        int i = 0;
        int j = 0;

        while(i < universi.getContadorDepartamentos()){
            while(j < universi.departamentos[i].getContadorFuncionarios()){
                System.out.println("\nListando todos os tecnicos: \n");
                if(universi.departamentos[i].funcionarios[j].getTipo().equals("Tecnico")){
                    System.out.println("  " + universi.departamentos[i].funcionarios[j].getTipo()
                            + " - " + universi.departamentos[i].funcionarios[j].getNome());
                }
                j++;
            }
            j = 0;
            i++;
        }
    }



    public void executar(){

        do{
            menu();
            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao){
                case 1 -> cadastrarDepartamento();
                case 2 -> cadastrarFuncionarioTecnico();
                case 3 -> cadastrarFuncionarioDocente();
                case 4 -> buscarDepartamentoPorNome();
                case 5 -> buscarFuncionarioPorNome();
                case 6 -> listarDepartamentosComFaixaSalarial();
                case 7 -> listarFuncionariosComFaixaSalarial();
                case 8 -> listarDepartamentosComGastoDeFaixa();
                case 9 -> listarTodosFuncionariosUniversidade();
                case 10 -> universi.listarDepartamentos();
                case 11 -> listarDepartamentosComFuncionarios();
                case 12 -> listarTodosDocentes();
                case 13 -> listarTodosTecnicos();
                case 0 -> System.out.println("Saindo...");
                default -> System.out.println("Opção inválida.");
            }

        }while(opcao != 0);
    }

}
