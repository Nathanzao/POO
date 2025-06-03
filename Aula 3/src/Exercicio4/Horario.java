package Exercicio4;

/*
*
* 4) ) Implemente uma classe que represente um horário.
Os atributos são: hora, minuto e segundo.
Os métodos são:
· Um construtor sem parâmetros e um construtor com parâmetros
· Um método get e um método set para cada atributo
· Um método para exibir os valores dos atributos no seguinte formato
hora:minuto:segundos – Exemplo: 19:45:43
- Método: void exibir()
· Um método para retornar o valor da hora em segundos. Por exemplo: 1:30:10 tem 1h*3600s
+ 30min*60s + 10s que resulta em 5410 segundos
- Método: int calcularSegundos( )
*
* */

public class Horario {
    int horas;
    int minutos;
    int segundos;

    Horario(){ /* Horario começando do zero. */
        this.horas = 00;
        this.minutos = 00;
        this.segundos = 00;
    }

    Horario(int hora, int minuto, int segundo){
        this.horas = hora;
        this.minutos = minuto;
        this.segundos = segundo;
    }

    int getHoras() {
        return horas;
    }

    void setHoras(int hora) {
        this.horas = hora;
    }

    public int getMinutos() {
        return minutos;
    }

    public void setMinutos(int minuto) {
        this.minutos = minuto;
    }

    public int getSegundos() {
        return segundos;
    }

    public void setSegundos(int segundo) {
        this.segundos = segundo;
    }

    void exibir(){
        System.out.println("" + horas + ":" + minutos + ":" + segundos);
    }
}
