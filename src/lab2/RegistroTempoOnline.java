package lab2;

public class RegistroTempoOnline {
    private String nomeDisciplina;
    private int tempoOnlineEsperado = 120;
    private int tempo;

    public RegistroTempoOnline(String nomeDisciplina){
        this.nomeDisciplina = nomeDisciplina;
    }

    public RegistroTempoOnline(String nomeDisciplina, int tempoOnlineEsperado){
        this.nomeDisciplina = nomeDisciplina;
        this.tempoOnlineEsperado = tempoOnlineEsperado;
    }

    public void adicionaTempoOnline(int tempo){
        this.tempo += tempo;
    }

    public boolean atingiuMetaTempoOnline(){
        if ((tempo * 2) == tempoOnlineEsperado){
            return true;
        }
        return false;
    }

    @Override
    public String toString(){
        return "Nome da disciplina: " + this.nomeDisciplina + "\n" + "Tempo online: " + this.tempo + "\n" + "Tempo esperado: " + this.tempoOnlineEsperado;
    }
}
