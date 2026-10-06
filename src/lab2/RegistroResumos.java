package lab2;
//faça a classe Resumo, gatinha <3

public class RegistroResumos {

    private int quantidade;
    private int proximoIndice;
    private Resumo[] resumos;

    public RegistroResumos(int numeroDeResumos) {
        this.resumos = new Resumo[numeroDeResumos];
    }

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
    public int conta() {
        return this.quantidade;
    }

    public boolean temResumo(String tema) {
        for (int i = 0; i < this.quantidade; i++) {
            if (resumos[i].getTema().equals(tema)) {
                return true;
            }
        }
        return false;
    }

    public String[] pegaResumos() {
        String[] resultado = new String[this.quantidade];
        for (int i = 0; i < this.quantidade; i++) {
            resultado[i] = resumos[i].toString();
        }
        return resultado;
    }


    public String imprimeResumos() {
        String texto = "- " + this.quantidade + " quantidade resumo(s)\n ";
        for (int i = 0; i < this.quantidade; i++) {
            texto += resumos[i].getTema();
            if (i < this.quantidade - 1) {
                texto += " | ";
            }
        }
        return texto;
    }
}
