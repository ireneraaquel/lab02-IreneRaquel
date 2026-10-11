package lab2;
import java.util.Arrays;
import java.util.Locale;

/**
 * Representação de uma disciplina, permitindo o cadastro de notas, pesos,
 * horas de estudo e o cálculo da média ponderada para verificação de aprovação.
 *
 * @author Irene Raquel
 */

public class Disciplina {
    private String nomeDisciplina;
    private double notas[];
    private int horasEstudo;
    private int pesos[];

    /**
     * Constrói uma disciplina com o nome especificado, inicializando
     * com um array padrão de 4 notas e pesos 1.
     *
     * @param nomeDisciplina o nome da disciplina
     */
    public Disciplina(String nomeDisciplina) {
        this.nomeDisciplina = nomeDisciplina;
        this.notas = new double[4];
        this.pesos = new int[4];
        Arrays.fill(pesos, 1);
    }

    /**
     * Constrói uma disciplina com o nome e a quantidade de notas especificados,
     * inicializando todos os pesos com o valor 1.
     *
     * @param nomeDisciplina o nome da disciplina
     * @param numNotas a quantidade de notas da disciplina
     */
    public Disciplina(String nomeDisciplina, int numNotas) {
        this.nomeDisciplina = nomeDisciplina;
        this.notas = new double[numNotas];
        this.pesos = new int[numNotas];
        Arrays.fill(pesos, 1);

    }

    /**
     * Constrói uma disciplina com o nome, quantidade de notas e pesos personalizados.
     *
     * @param nomeDisciplina o nome da disciplina
     * @param numNotas a quantidade de notas da disciplina
     * @param pesos o array com os pesos correspondentes a cada nota
     */
    public Disciplina(String nomeDisciplina, int numNotas, int[] pesos) {
        this.nomeDisciplina = nomeDisciplina;
        this.notas = new double[numNotas];
        this.pesos = pesos;

    }

    /**
     * Cadastra horas de estudo dedicadas à disciplina.
     *
     * @param horas a quantidade de horas a ser adicionada
     */
    public void cadastraHoras(int horas) {
        this.horasEstudo += horas;
    }

    /**
     * Cadastra ou atualiza uma nota específica da disciplina.
     *
     * @param nota o número da nota (de 1 até o total de notas)
     * @param valorNota valorNota o valor da nota a ser cadastrada
     */
    public void cadastraNota(int nota, double valorNota) {
        if (nota >= 1 && nota <= notas.length) {
            this.notas[nota - 1] = valorNota;
        }
    }

    /**
     * Calcula a média ponderada das notas cadastradas com base nos pesos.
     *
     * @return a média ponderada das notas
     */
    private double calculaMedia() {
        double soma = 0;
        int somaPesos = 0;

        for (int i = 0; i < notas.length; i++) {
            soma += this.notas[i] * this.pesos[i];
            somaPesos += this.pesos[i];
        }
        if (somaPesos <= 0) {
            somaPesos = 1;
        }
        return soma / somaPesos;
    }

    /**
     * Verifica se o aluno foi aprovado na disciplina com base na média obtida (média >= 7.0).
     *
     * @return true se a média for maior ou igual a 7.0, caso contrário false
     */
    public boolean aprovado() {
        if (calculaMedia() >= 7) {
            return true;
        }
        return false;
    }

    /**
     * Retorna a representação textual da disciplina, contendo o nome,
     * horas de estudo, média e o vetor de notas formatado.
     *
     * @return a representação em String do objeto
     */
    @Override
    public String toString() {
        String resposta = this.nomeDisciplina + " " + this.horasEstudo + " " + String.format(Locale.US,"%.1f",calculaMedia()) + " " + "[";
        for (int i = 0; i < notas.length; i++) {
            if (i != notas.length - 1) {
                resposta += this.notas[i] + "," + " ";
            } else {
                resposta += this.notas[i] + "]";
            }
        }
        return resposta;
    }
}