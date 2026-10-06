package lab2;

public class RegistroResumos {

    private String temas[];
    private String conteudos[];
    private int quantidade;
    private int proximoIndice;


    public RegistroResumos(int numeroDeResumos) {
        this.temas = new String[numeroDeResumos];
        this.conteudos = new String[numeroDeResumos];
        this.quantidade = 0;
        this.proximoIndice = 0;
    }

    public void adiciona(String tema, String conteudo) {
        for (int i = 0; i < this.quantidade; i++) {
            if (this.temas[i].equals(tema)) {
                this.conteudos[i] = conteudo;
                return;
            }
        }

        this.temas[this.proximoIndice] = tema;
        this.conteudos[this.proximoIndice] = conteudo;


        this.proximoIndice = (this.proximoIndice + 1) % this.temas.length;


        if (this.quantidade < this.temas.length) {
            this.quantidade++;
        }
    }

    public int conta() {
        return this.quantidade;
    }

    public boolean temResumo(String tema) {
        for (int i = 0; i < this.quantidade; i++) {
            if (this.temas[i].equals(tema)) {
                return true;
            }
        }
        return false;
    }

    public String[] pegaResumos() {
        String[] resumos = new String[this.quantidade];
        for (int i = 0; i < this.quantidade; i++) {
            resumos[i] = this.temas[i] + ": " + this.conteudos[i];
        }
        return resumos;
    }


    public String imprimeResumos() {
        String texto = "- " + this.quantidade + " quantidade resumo(s)\n ";
        for (int i = 0; i < this.quantidade; i++) {
            texto += this.temas[i];
            if (i < this.quantidade - 1) {
                texto += " | ";
            }
        }
        return texto;
    }
}
