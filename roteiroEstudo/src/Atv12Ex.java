import java.util.Scanner;

public class Atv12Ex {
    /*12. Escreva classe com um método que será usado em todo sistema que recebe, por
parâmetro, dois valores X e Z e calcula e retorna o valor de X elevado a Z
     */
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int x, z;

        System.out.println("Digite um numero: ");
        x = ler.nextInt();
        System.out.println("Digite mais um numero: ");
        z = ler.nextInt();

        Atv12Elevar potencia = new Atv12Elevar();
        double elevado = potencia.calcularPotencia(x, z);

        System.out.println(elevado);
    }
}
