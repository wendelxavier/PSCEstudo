import java.util.Scanner;
/* 10. Faça uma classe com um método que será usado em todo sistema que irá verificar se
   um valor é perfeito ou não. Um valor é dito perfeito quando ele é igual a soma dos
   seus divisores excetuando ele próprio. (Ex: 6 é perfeito, 6 = 1 + 2 + 3, que são seus
   divisores). O método deve retornar um valor booleano.
   */
public class Atv10Ex {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int num;
        System.out.println("Digite um numero: ");
        num = ler.nextInt();
        if (Atv10Class.ePerfeito(num)) {
            System.out.println(num + " é número perfeito!");
        } else {
            System.out.println(num + " não é número perfeito");
        }
    }
}
