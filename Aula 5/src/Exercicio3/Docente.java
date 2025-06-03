package Exercicio3;

public class Docente extends Funcionario{
    private String area;

    public Docente(String nomee, int idd, float valor, String areaa){
        super(nomee, idd, valor);
        this.area = areaa;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    @Override
    public String getTipo(){
        return "Docente";
    }
}
