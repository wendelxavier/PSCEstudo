/*5. Faça um programa que receba um número e mostre uma mensagem caso este número
seja maior que 10.
 */


import java.util.Scanner;

public class Atv5 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int num1;

        System.out.println("Digite um número: ");
        num1 = ler.nextInt();

        if (num1 > 10) {
            System.out.println("Número maior que 10: " + num1);

        }
        else {
            System.out.println("Número menor que 10: " + num1);
        }
    }
}