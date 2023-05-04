import java.util.Scanner;

/*6. Escrever um programa que leia o nome e o sexo de 30 pessoas e informe o nome e se
        ela é homem ou mulher. No final informe total de homens e de mulheres.
 */
public class Atv6 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        String nome, sexo;
        int numHom = 0, numMulh = 0;

        for (int i = 0; i <= 30; i++) {
            System.out.println("digite o nome da pessoa " + i + ":");
            nome = ler.nextLine();
            System.out.println("Informe o sexo da pessoa:" + i + "(M/F): ");
            sexo = ler.nextLine();

            if (sexo.equalsIgnoreCase("M")) {
                numHom++;
                System.out.println(nome + " é Homem");
            }
            if (sexo.equalsIgnoreCase("F")) {
                numMulh++;
                System.out.println(nome + " é Mulher");
            }

            System.out.println("Total de homens: " + numHom);
            System.out.println("Total de Mulheres: " + numMulh);
        }
    }
}