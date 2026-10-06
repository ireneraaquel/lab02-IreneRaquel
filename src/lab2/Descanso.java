package lab2;
public class Descanso{
    int VALORSEMANA = 1;
    private int valorHoras;
    private int valorSemanas = VALORSEMANA;


    public void defineHorasDescanso(int valorHoras){
        this.valorHoras = valorHoras;
    }


    public void defineNumeroSemanas(int valorSemanas){
        this.valorSemanas = valorSemanas;
    }

// definir valor mínimo para valorSemanas;
    public String getStatusGeral(){
        int descanso = valorHoras / valorSemanas;
        if (descanso >= 26){
            return "Descansado";
        } else{
            return "Cansado";
        }
    }


}
