import java.util.Scanner;

public class Atv4 {
    /*4. Faça um programa que receba um valor que foi depositado e exiba o valor com
rendimento após um mês, escolha por meio de uma estrutura de caso 3 tipos de
rendimentos:
a. Poupança em 0,90% a. m.
b. CDB em 1,1% a.m.
c. Previdência Privada 1,3% a.m.
Apresente o rendimento no próximo mês e ao final de 12 meses qual será o
rendimento total, conforme a escolha
 */
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        // ENTRAR COM VARIAVEIS DO VALOR DEPOSITADO E DO RENDIMENTO MENSAL
        // TEM TRES CONDICIONAIS
        // USAR SWITCH E ESTRUTURA DE REPETIÇÃO

        double valorDep, valorRend12M, valorTotal, rendimentoMensal = 0;
        int  tipoRendimento;

        System.out.println("Informe o valor depositado: ");
        valorDep = ler.nextDouble();
        System.out.println("Escolha um tipo de rendimento de 1 a 3");
        System.out.println("1- Poupança em 0,90% a. m.");
        System.out.println("2- CDB em 1,1% a.m.");
        System.out.println("3- Previdência Privada 1,3% a.m.");
        tipoRendimento = ler.nextInt();


        switch (tipoRendimento){
            case 1 :
                rendimentoMensal = valorDep * 0.009;
              break;
            case 2 :
                rendimentoMensal = valorDep * 0.11;
              break;
            case 3 :
                rendimentoMensal = valorDep * 0.13;
              break;
            default:
                System.out.println("tipo de rendimento inválido");
                System.exit(0);
        }
        valorTotal = valorDep+rendimentoMensal;
        System.out.println("Rendimento após um mês: R$"+ valorTotal);

        valorRend12M = rendimentoMensal*12;
        System.out.println("Rendimento total após 12 meses é: R$" + valorRend12M);
    }
}
