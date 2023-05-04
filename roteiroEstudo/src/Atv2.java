import java.util.Scanner;


public class Atv2 {
    /*2. Escrever um programa que leia o nome de um vendedor, o seu salário fixo e o total de
vendas efetuadas por ele no mês (em dinheiro). Sabendo que este vendedor ganha
15% de comissão sobre suas vendas efetuadas, informar o seu nome, o salário fixo e
salário no final do mês.
 */
    public static void main(String[] args) {
        String nomeVendedor;
        double salarioFixo, vendasEfetuadas, salarioFinal;

        Scanner ler = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        nomeVendedor = ler.nextLine();
        System.out.println("Digite seu salario: ");
        salarioFixo = ler.nextDouble();
        System.out.println("Qual o total de vendas efetuada no mês em (em dinheiro)");
        vendasEfetuadas = ler.nextDouble();
        System.out.println("Nome vendedor: " + nomeVendedor);
        System.out.println("Salário fixo R$" + salarioFixo);
        System.out.println("Vendas no mês R$" +vendasEfetuadas);

        salarioFinal = salarioFixo + vendasEfetuadas * 0.15;

        System.out.println("O vendendor " + nomeVendedor + " de salário fixo " + salarioFixo + " teve 15% sob suas vendas" +
                " e o seu salário final é R$" + salarioFinal);
    }
}
