import java.util.Scanner;

/*15. Análise o código abaixo, corrija os erros e implemente melhorias para evitar erros no
uso da calculadora.
 */
public class Atv15Corrigido {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double a, b, resultado;
        int operador;

        System.out.print("Digite o valor de A: ");
        a = ler.nextDouble();
        System.out.print("Digite o valor de B: ");
        b = ler.nextDouble();
        System.out.print("Digite o operador (1 = +,2 = -, 3 = *, 4 = /): ");
        operador = ler.nextInt();

        resultado = 0;

        switch (operador) {
            case 1:
                resultado = a + b;
                System.out.println("Resultado da soma é " + resultado);
                break;
            case 2:
                resultado = a - b;
                System.out.println("Resultado da subitração é " + resultado);
                break;
            case 3:
                resultado = a * b;
                System.out.println("Resultado da multiplicação é " + resultado);
                break;
            case 4:
                resultado = a / b;
            default:
                System.out.println("Resultado da divisão é " + resultado);

        }
    }
}
