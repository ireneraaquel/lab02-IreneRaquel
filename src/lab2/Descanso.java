package lab2;
/**
 * Representação de um registro de Descanso, permitindo avaliar o
 * status de descanso com base na quantidade de horas e semanas.
 * @author Irene Raquel
 */
public class Descanso{
    private int numeroHoras;
    private int numeroSemanas = 1;

    /**
     * Define o valor do número de horas de descanso.
     * @param numeroHoras a quantidade de horas de descanso a ser definida
     */
    public void defineHorasDescanso(int numeroHoras){
        this.numeroHoras = numeroHoras;
    }

    /**
     * Define o número de semanas.
     * @param numeroSemanas a quantidade de semanas a ser definida
     */
    public void defineNumeroSemanas(int numeroSemanas){
        this.numeroSemanas = numeroSemanas;
    }

    /**
     * Analisa o status do descanso de acordo com a proporção entre horas e semanas.
     * @return uma String contendo "descansado" se a média for maior ou igual a 26, ou "cansado" caso contrário.
     */
    public String getStatusGeral(){
        int descanso = numeroHoras / numeroSemanas;
        if (descanso >= 26){
            return "descansado";
        } else{
            return "cansado";
        }
    }
}
