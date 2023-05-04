import java.util.Scanner;

public class Atv7 {
    /*7. A concessionária de veículos “CARANGO VELHO” está vendendo os seus veículos com
    desconto. Faça um programa que calcule e exiba o valor do desconto e o valor a ser
    pago pelo cliente de vários carros. O desconto deverá ser calculado de acordo com o
    ano do veículo. Até 2010 - 12% e acima de 2010 - 7%. O sistema deverá perguntar se
    deseja continuar calculando desconto até que a resposta seja: “(N) Não” . Informar
    total de carros com ano até 2010 e total geral.
         */


    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int ano, totalAte2010 = 0, totalGeral = 0;
        double preco, precoComDesconto, desconto;
        String resposta = "S";

        while (resposta.equalsIgnoreCase("S")) {

            System.out.println("Digite o valor do carro:");
            preco = ler.nextDouble();
            System.out.println("Digite o ano do carro: ");
            ano = ler.nextInt();

            if (ano <= 2010) {
                desconto = 0.12;
                totalAte2010++;
            } else {
                desconto = 0.07;
            }
            precoComDesconto = preco - (preco * desconto);

            System.out.println("Desconto de 12 foi aplicado. Valor pago: R$" + precoComDesconto);
            totalGeral++;
            System.out.println("Deseja continuar calculando? (S)- sim (N)- não)");
            resposta = ler.next();
        }
        System.out.println("\nTotal de carros com ano até 2010: " + totalAte2010);
        System.out.println("Total geral de carros: " + totalGeral);
    }
}










