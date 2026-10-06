package lab2;

public class Disciplina {
    private String nomeDisciplina;
    private double notas[];
    private int horasEstudo;


    public Disciplina(String nomeDisciplina){
        this.nomeDisciplina = nomeDisciplina;
        this.horasEstudo = 0;
        this.notas = new double[4];
    }


    public void cadastraHoras(int horas) {
        this.horasEstudo += horas;
    }


    public void cadastraNota(int nota, double valorNota) {
        if (nota >= 1 && nota <= 4) {
            this.notas[nota - 1] = valorNota;
        }
    }


    private double calculaMedia() {
        double soma = 0;
        for (int i = 0; i < 4; i++) {
            soma += this.notas[i];
        }
        return soma / 4;
    }
    public boolean aprovado() {
        if (calculaMedia() >= 7){
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return this.nomeDisciplina + " " +
                this.horasEstudo + " " +
                calculaMedia() + " " +
                "[" + this.notas[0] + ", " + this.notas[1] + ", " + this.notas[2] + ", " + this.notas[3] + "]";
    }
    //eu meti um ArraystoString no meu kkkk
}
