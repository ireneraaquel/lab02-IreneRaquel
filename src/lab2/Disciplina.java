package lab2;

public class Disciplina {
    //Nessa classe possui 3 atributos:
    private String nomeDisciplina;
    private double notas[];
    private int horasEstudo;

    //Construtor.
    public Disciplina(String nomeDisciplina){
        this.nomeDisciplina = nomeDisciplina;
        this.horasEstudo = 0;
        this.notas = new double[4];
    }

    //Metodo que adicionar valores ao atributo horasEstudo.
    public void cadastraHoras(int horas) {
        this.horasEstudo += horas;
    }


    public void cadastraNota(int nota, double valorNota) {
        if (nota >= 1 && nota <= 4) {
            this.notas[nota - 1] = valorNota;
        }
    }

    // Metodo privado possui só faz sentido esta nessa classe, calcula media das notas.
    private double calculaMedia() {
        double soma = 0;
        for (int i = 0; i < 4; i++) {
            soma += this.notas[i];
        }
        return soma / 4;
    }

    //Metodo que confere se a media é suficiente para passar.
    public boolean aprovado() {
        if (calculaMedia() >= 7){
            return true;
        }
        return false;
    }
    //Override do toString para que a representação textual do objeto atenda as especificações.
    @Override
    public String toString() {
        return this.nomeDisciplina + " " +
                this.horasEstudo + " " +
                calculaMedia() + " " +
                "[" + this.notas[0] + ", " + this.notas[1] + ", " + this.notas[2] + ", " + this.notas[3] + "]";
    }
}
