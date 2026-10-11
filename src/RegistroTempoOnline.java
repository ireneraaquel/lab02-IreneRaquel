/**
 * Representação do registro de tempo online dedicado a uma disciplina.
 * Permite controlar o tempo gasto, comparar com a meta esperada e verificar se a meta foi atingida.
 *
 * @author Irene Raquel
 */
public class    RegistroTempoOnline {

    private String nomeDisciplina;
    private int tempoOnlineEsperado = 120;
    private int tempo;

    /**
     * Constrói um registro de tempo online para um disciplina,
     * utilizando o tempo online esperado padrão de 120 minutos.
     *
     * @param nomeDisciplina o nome da disciplina
     */
    public RegistroTempoOnline(String nomeDisciplina){
        this.nomeDisciplina = nomeDisciplina;
    }

    /**
     * Constrói um registro de tempo online para uma disciplina,
     * definindo um tempo online esperado personalizado.
     *
     * @param nomeDisciplina o nome da disciplina
     * @param tempoOnlineEsperado o tempo online em minutos
     */
    public RegistroTempoOnline(String nomeDisciplina, int tempoOnlineEsperado){
        this.nomeDisciplina = nomeDisciplina;
        this.tempoOnlineEsperado = tempoOnlineEsperado;
    }

    /**
     * Adiciona temmpo online ao total registrado para a disciplina.
     *
     * @param tempo a quantidade de tempo em minutos a ser adicionada
     */
    public void adicionaTempoOnline(int tempo){
        this.tempo += tempo;
    }

    /**
     * Verifica se o tempo online acumulado atingiu ou superou o tempo esperado.
     * @return true se o tempo acumulado for maior ou igual ao esperado, caso contrário false
     */
    public boolean atingiuMetaTempoOnline(){
        if ((tempo) >= tempoOnlineEsperado){
            return true;
        }
        return false;
    }

    /**
     * Retorna a representação textual do registro de tempo online,
     * no formato "nomeDisciplina tempo / tempoEsperado".
     * @return a representação em String do objeto
     */
    @Override
    public String toString(){
        return this.nomeDisciplina + " " + this.tempo + "/" + this.tempoOnlineEsperado;
    }
}
