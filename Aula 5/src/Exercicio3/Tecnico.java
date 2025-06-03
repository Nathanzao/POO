package Exercicio3;

public class Tecnico extends Funcionario{
    private String funcao;

    public Tecnico(String nomee, int idd, float valor, String funcaoo){
        super(nomee, idd, valor);
        this.funcao = funcaoo;
    }

    @Override
    public String getTipo(){
        return "Tecnico";
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }
}
