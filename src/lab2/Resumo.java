package lab2;

public class Resumo {
    //Classe criada com 2 atributos: tema e conteudo.
    private String tema;
    private String conteudo;

    //Construtor da classe
    public Resumo(String tema, String conteudo){
        this.tema = tema;
        this.conteudo = conteudo;
    }
    //gets dos atributos para a classe RegistroResumos visualizar.

    public String getConteudo() {
        return conteudo;
    }

    public String getTema() {
        return tema;
    }

    //O override da classe para utilizar no metodo de "pegaResumos" da classe RegistroResumos.
    @Override
    public String toString(){
        return tema + " " + conteudo;
    }
}
