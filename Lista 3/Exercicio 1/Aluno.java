

    public class Aluno{
        float nota1;
        float nota2;
        String RA;
        String nome;
    

    float calculaMedia(){
        float media = (nota1 + nota2)/2;
        return media;
    }

    boolean aprovado(){
        if((calculaMedia()) >= 5){
            return true;
        }else{
            return false;
        }
    }

    public Aluno(String nome, String RA, int nota1, int nota2){
        this.RA = RA;
        this.nome = nome;
        this.nota1 = nota1;
        this.nota2 = nota2;
    }

}

