/**
 * Representação do resumo contendo o tema e o conteudo.
 * Permitindo
 * @author Irene Raquel
 */
public class Resumo {

    private String tema;
    private String conteudo;

    /**
     * Contrói um resumo a partir de seu tema e do seu conteúdo.
     *
     * @param tema o tema do resumo
     * @param conteudo conteudo o conteúdo do resumo
     */
    public Resumo(String tema, String conteudo){
        this.tema = tema;
        this.conteudo = conteudo;
    }

    /**
     * Retorna o conteúdo do resumo.
     *
     * @return o conteúdo
     */

    public String getConteudo() {
        return conteudo;
    }

    /**
     * Retorna o tema do resumo.
     *
     * @return o tema
     */
    public String getTema() {
        return tema;
    }

    /**
     * Verifica se a palavra esta dentro do conteudo do tema, convertendo o
     * texto para minúsculas para a validação.
     *
     * @param palavra a palavra procurada
     * @return true se existir a palavra o conteudo e false se não existir
     */
    public boolean estaNoConteudo(String palavra){
        if(conteudo.toLowerCase().contains(palavra.toLowerCase())) return true;
        return false;
    }

    /**
     * Retorna a representação textual do resumo no formato "tema conteúdo".
     * @return a representação em String do resumo
     */
    @Override
    public String toString(){
        return tema + " " + conteudo;
    }
}
