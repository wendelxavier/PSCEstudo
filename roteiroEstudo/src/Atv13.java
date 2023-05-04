/* 13. Escreva uma classe cujos objetos representam alunos matriculados em uma disciplina.
Cada objeto dessa classe deve guardar os seguintes dados do aluno: matrícula, nome,
2 notas de prova e 1 nota de trabalho. Escreva os seguintes métodos para esta classe:
media: calcula a média final do aluno (cada prova tem peso 2,5 e o trabalho tem peso
2)
final: calcula quanto o aluno precisa para a prova final (retorna zero se ele não for para
a final)
 */
public class Atv13 {
    private int matricula;
    private String nome;
    private double notaProva1;
    private double notaProva2;
    private double notaTrabalho;

    public Atv13(int matricula, String nome, double notaProva1, double notaProva2, double notaTrabalho) {
        this.matricula = matricula;
        this.nome = nome;
        this.notaProva1 = notaProva1;
        this.notaProva2 = notaProva2;
        this.notaTrabalho = notaTrabalho;
    }

    public int getMatricula() {
        return matricula;
    }

    public String getNome() {
        return nome;
    }

    public double getNotaProva1() {
        return notaProva1;
    }

    public double getNotaProva2() {
        return notaProva2;
    }

    public double getNotaTrabalho() {
        return notaTrabalho;
    }

    public double calcularMedia() {
        double media = ((notaProva1 * 2.5) + (notaProva2 * 2.5) + (notaTrabalho * 2)) / 7;
        return media;
    }

    public double paraPassar() {
        double media = calcularMedia();
        double aprovado = 0;
        if (media < 6 && media >= 4) {
            aprovado = (12 - media * 7) / 3;
        } else if (media < 4) {
            aprovado = 5 - media;
        }
        if (aprovado < 0) {
            aprovado = 0;
        }
        return aprovado;
    }
}
