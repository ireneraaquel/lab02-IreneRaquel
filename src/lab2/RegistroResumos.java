package lab2;

public class RegistroResumos {
    // Na classe RegistroResumos temos 3 atributos:
    // Para que o codigo fique mais organizado foi criado a classe Resumo, como vimos na linha 6 que possui um atribudo que é o array de resumo com o nome de resumos.
    private int quantidade;
    private int proximoIndice;
    private Resumo[] resumos;

    //Construtor da classe, que começa com a quantidade maxima de resumos que podem ser registrados e cria um array com esse tamanho fixo.
    public RegistroResumos(int numeroDeResumos) {
        this.resumos = new Resumo[numeroDeResumos];
    }

    //Metodo que adiciona o novo resumo dentro do array, passando como parametro o tema e conteudo.
    public void adiciona(String tema, String conteudo) {
        //Instancia da classe resumo
        resumos[proximoIndice] = new Resumo(tema, conteudo);
        // Acrescenta +1 ao indice para que passe pra o outro espaço vazio.
        proximoIndice++;

        //Confere se o array esta cheio para começa a registra novos resumos a espaços que estão guardando resumos antigos.
        if (proximoIndice == resumos.length){
            proximoIndice = 0;
        }
        //Conta quantos resumos estão registrados no momento.
        if(quantidade < resumos.length){
            quantidade ++;
        }
    }

    //Utiliza o atributo quantidade como contador, que foi encremetado na linhas: 25 a 27.
    public int conta() {
        return this.quantidade;
    }

    //Metodo para verificar se tem o resumo que o tema foi passado como parametro.
    public boolean temResumo(String tema) {
        for (int i = 0; i < this.quantidade; i++) {
            //Pelo indice do array chamo o getTema e verifico se ele é igual ao tema passado como parametro.
            if (resumos[i].getTema().equals(tema)) {
                return true;
            }
        }
        return false;
    }
    //Metodo que retorna um array com a representacao textual de todos os resumos.
    public String[] pegaResumos() {
        String[] resultado = new String[this.quantidade];
        for (int i = 0; i < this.quantidade; i++) {
            resultado[i] = resumos[i].toString();
        }
        return resultado;
    }
    // Metodo que exibe a quantidade de resumos e os temas.
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

    public String[] busca(String chaveDeBusca){
        String[] resposta = new String[resumos.length];
        int indiceAtual= 0;
        for (int i = 0; i < quantidade; i++){
            if(resumos[i].estaNoConteudo(chaveDeBusca)){
                resposta[indiceAtual] = resumos[i].getTema();
                indiceAtual++;
            }
            else{
                resposta[indiceAtual] = "AAA";
                indiceAtual ++;
            }
        }
        return resposta;
    }

}
