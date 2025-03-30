/* Implemente uma classe que represente um horário.
Os atributos são: hora, minuto e segundo.
Os métodos são:
· Um construtor sem parâmetros e um construtor com parâmetros
· Um método get e um método set para cada atributo
· Um método para exibir os valores dos atributos no seguinte formato
hora:minuto:segundos – Exemplo: 19:45:43
- Método: void exibir()
· Um método para retornar o valor da hora em segundos. Por exemplo: 1:30:10 tem 1h*3600s
+ 30min*60s + 10s que resulta em 5410 segundos
- Método: int calcularSegundos( ) */

public class Horario {
    int horas;
    int minutos;
    int segundos;

    /* GETS */

    int getHoras(){
        return horas;
    }

    int getMinutos(){
        return minutos;
    }

    int getSegundos(){
        return segundos;
    }

    /* SETS */


    void setHoras(int valor){
        if(valor < 0 || valor > 24){
            return;
        }else{
            horas = valor;
        }
    }

    void setMinutos(int valor){
        if(valor < 0 || valor > 60){
            return;
        }else{
            minutos = valor;
        }
    }

    void setSegundos(int valor){
        if(valor < 0 || valor > 60){
            return;
        }else{
            segundos = valor;
        }
    }

    void exibir(){
        System.out.println("Horas: " + horas + ":" + minutos + ":" + segundos);
    }

    int retornaEmSegundos(){
        return ((horas * 3600) + (minutos * 60) + segundos);
    }

    public Horario(){
        this.horas = 0;
        this.minutos = 0;
        this.segundos = 0;
    }

    public Horario(int horas, int minutos, int segundos){
        this.horas = horas;
        this.minutos = minutos;
        this.segundos = segundos;
    }


}
