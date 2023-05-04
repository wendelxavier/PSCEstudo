import java.util.Scanner;

public class Atv3 {
    /*3. Ler dois valores para as variáveis A e B, e efetuar as trocas dos valores de forma que a
variável A passe a possuir o valor da variável B e a variável B passe a possuir o valor da
variável A. Apresentar os valores das variáveis iniciais e depois os valores trocados.
 */
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        String nome1, nome2, temp;

        System.out.println("Digite o primeiro nome: ");
        nome1 = ler.nextLine();
        System.out.println("Digite o segundo nome: ");
        nome2 = ler.nextLine();
        System.out.println("Primeiro nome: " + nome1);
        System.out.println("Segundo nome: " + nome2);

        temp = nome1;
        nome1 = nome2;
        nome2 = temp;

        System.out.println("O primeiro nome é (trocado): " + nome1);
        System.out.println("O segundo nome é (trocado): " + nome2);

    }
}
