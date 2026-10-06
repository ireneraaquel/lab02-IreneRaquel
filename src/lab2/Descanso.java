package lab2;
public class Descanso{

    private int valorHoras;
    private int valorSemanas;


    public void defineHorasDescanso(int valorHoras){
        this.valorHoras = valorHoras;
    }


    public void defineNumeroSemanas(int valorSemanas){
        this.valorSemanas = valorSemanas;
    }


    public String getStatusGeral(){
        int descanso = valorHoras / valorSemanas;
        if (descanso >= 26){
            return "Descansado";
        } else{
            return "Cansado";
        }
    }


}
