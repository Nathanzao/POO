public class Academia{
    float peso;
    float altura;
    int idade;

    float IMC(){
        return peso / (altura * altura);
    }

    boolean desconto(){
        if(idade < 18){
            return true;
        }else{
            return false;
        }
    }


    public Academia(float peso, float altura, int idade){
        this.altura = altura;
        this.idade = idade;
        this.peso = peso;
    }
}
