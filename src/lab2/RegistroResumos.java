package lab2;
import java.util.*;

/**
 * Representação de um registo de resumos, permitindo armazenar,
 * contar, pesquisar e listar os resumos criados.
 *
 * @author Irene Raquel
 */

public class RegistroResumos {

    private int quantidade;
    private int proximoIndice;
    private Resumo[] resumos;

    /**
     * Constrói um registo de resumos com um número máximo resumos
     * @param numeroDeResumos o número máximo de resumos possíveis.
     */
    public RegistroResumos(int numeroDeResumos) {
        this.resumos = new Resumo[numeroDeResumos];
    }

    /**
     * Adiciona um novo resumo ao registro, contendo tema e conteúdo.
     *
     * @param tema o tema do resumo
     * @param conteudo o conteúdo do resumo
     */
    public void adiciona(String tema, String conteudo) {
        resumos[proximoIndice] = new Resumo(tema, conteudo);
        proximoIndice++;

        if (proximoIndice == resumos.length){
            proximoIndice = 0;
        }

        if(quantidade < resumos.length){
            quantidade ++;
        }
    }

    /**
     * Conta a quantidade preenchida de resumos.
     *
     * @return a quantidade de resumos.
     */
    public int conta() {
        return this.quantidade;
    }

    /**
     * Verifica se existe um resumo de acordo com o tema digitado.
     *
     * @param tema o tema a ser verificado se existe ou não
     * @return true se o tema existir ou false se não
     */
    public boolean temResumo(String tema) {
        for (int i = 0; i < this.quantidade; i++) {
            //Pelo indice do array chamo o getTema e verifico se ele é igual ao tema passado como parametro.
            if (resumos[i].getTema().equals(tema)) {
                return true;
            }
        }
        return false;
    }

    /**
     * Retorna a representação textual dos resumos guardados, de acordo com o que foi definido no toString.
     * @return um array de Strings com os resumos formatados
     */
    public String[] pegaResumos() {
        String[] resultado = new String[this.quantidade];
        for (int i = 0; i < this.quantidade; i++) {
            resultado[i] = resumos[i].toString();
        }
        return resultado;
    }

    /**
     * Imprime a quantidade de resumos cadastrados e os temmas.
     *
     * @return uma String formatada com o tema dos resumos e as quantidades.
     */

    public String imprimeResumos() {
        String result = "- " + this.quantidade + " resumo(s) cadastrado(s)\n ";
        for (int i = 0; i < this.quantidade; i++) {
            result += resumos[i].getTema();
            if (i < this.quantidade - 1) {
                result += " | ";
            }
        }
        return result;
    }

    /**
     * Procura no conteudo de um resumo a palavra chave digitada.
     *
     * @param chaveDeBusca a palavra que esta procurando no conteudo
     * @return retorna o tema do resumo onde a palavra existe no conteudo
     */
    public String[] busca(String chaveDeBusca){
        String[] resposta = new String[quantidade];
        int indiceAtual= 0;
        int contador = 0;
        for (int i = 0; i < quantidade; i++){
            if(resumos[i].estaNoConteudo(chaveDeBusca)){
                resposta[indiceAtual] = resumos[i].getTema();
                indiceAtual++;
            }
        }

        String[] resultadoFinal = new String[indiceAtual];
        for (int i = 0; i < indiceAtual; i++){
            resultadoFinal[i] = resposta[i];
        }
        Arrays.sort(resultadoFinal);
        return resultadoFinal;
    }

}
