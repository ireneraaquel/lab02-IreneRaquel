package lab2;

public class Descanso{
    //Na classe descanso foi criado 2 atributos: valorHoras e valorSemanas que inciou-se com o valor 1, já que será realizado uma operação de divisão posteriomente.
    private int valorHoras;
    private int valorSemanas = 1;

    //Metodo que define o valor do primeiro atributo.
    public void defineHorasDescanso(int valorHoras){
        this.valorHoras = valorHoras;
    }

    //Metodo que define o valor do segundo atributo.
    public void defineNumeroSemanas(int valorSemanas){
        this.valorSemanas = valorSemanas;
    }

    //Metodo que analisa o status do descanso de acordo com a condição do enuciado.
    public String getStatusGeral(){
        int descanso = valorHoras / valorSemanas;
        if (descanso >= 26){
            return "descansado";
        } else{
            return "cansado";
        }
    }
}
