import java.util.Scanner;


public class Atv1 {
    /*1. Escrever um programa para determinar o consumo médio de um automóvel sendo
fornecida a distância total percorrida pelo automóvel e o total de combustível gasto
 */
    public static void main(String[] args) {
        Scanner ler = new Scanner (System.in);

        double totalComb, distancia, media;

        System.out.println("Digite a distância percorrida: ");
        distancia = ler.nextDouble();
        System.out.println("Informe a quantidade de combustivel gasto: ");
        totalComb = ler.nextDouble();

        media = distancia/totalComb;

        System.out.println("A média de combustivel gasto foi de: " + media);

    }
}
