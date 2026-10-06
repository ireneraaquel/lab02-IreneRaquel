package lab2;
public class RegistroTempoOnline {
    //Nessa classe possui 3 atributos:
    private String nomeDisciplina;
    private int tempoOnlineEsperado = 120;
    private int tempo;

    //Construtor que passa como parametro nome da disciplina.
    public RegistroTempoOnline(String nomeDisciplina){
        this.nomeDisciplina = nomeDisciplina;
    }

    //Construtor que passa como parametro nome da disciplina e tempo online esperado.
    public RegistroTempoOnline(String nomeDisciplina, int tempoOnlineEsperado){
        this.nomeDisciplina = nomeDisciplina;
        this.tempoOnlineEsperado = tempoOnlineEsperado;
    }

    //Metodo que adicionar valores ao atributo tempo.
    public void adicionaTempoOnline(int tempo){
        this.tempo += tempo;
    }

    //Metodo que analise se o tempo é igual ou superior ao tempo esperado, de acordo com as especificações do problema.
    public boolean atingiuMetaTempoOnline(){
        if ((tempo) >= tempoOnlineEsperado){
            return true;
        }
        return false;
    }

    //Override do toString para que a representação textual do objeto atenda as especificações.
    @Override
    public String toString(){
        return this.nomeDisciplina + " " + this.tempo + "/" + this.tempoOnlineEsperado;
    }
}
