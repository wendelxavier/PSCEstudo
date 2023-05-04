import java.util.Arrays;
import java.util.Scanner;

/* 11. Faça uma classe com um método que será usado em todo sistema que recebe 3 valores
    inteiros passados por parâmetro e retorna-os ordenados em ordem crescente.
    */

public class Atv11Ex {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int w, x, y;
        System.out.println("Digite um número inteiro: ");
        w = ler.nextInt();
        System.out.println("Digite novamente um numero inteiro: ");
        x = ler.nextInt();
        System.out.println("Digite novamente um numero inteiro (é o último, calmaa!!): ");
        y = ler.nextInt();

        Atv11OrdenarInt ordenador = new Atv11OrdenarInt();

        int [] numerosOrdenados = ordenador.ordenar(w, x, y);

        System.out.println("Numeros ordenados: " + Arrays.toString(numerosOrdenados));


    }
}
