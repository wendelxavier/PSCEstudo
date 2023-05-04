import java.util.Scanner;

public class Atv8 {
    /*8. Uma Companhia de Seguros possui nove categorias de seguro baseadas na idade e
ocupação do segurado. Somente pessoas com pelo menos 17 anos e não mais de 70
anos podem adquirir apólices de seguro. Quanto às classes de ocupações, foram
definidos três grupos de risco. A tabela abaixo fornece as categorias em função da faixa
etária e do grupo de risco. Dados nome, idade e grupo de risco, determinar a categoria
do pretendente à aquisição de tal seguro.
Imprimir o nome a idade e a categoria do pretendente, e , caso a idade não esteja na
faixa necessária, imprimir uma mensagem
     */
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int idade, gpRisco;
        String nome, categoria = null;

        System.out.println("Digite o nomde do pretendente: ");
        nome = ler.nextLine();
        System.out.println("Digite a idade do pretentende: ");
        idade = ler.nextInt();
        if (idade < 17 && idade > 70){
        System.out.println("Idade inválida para adquirir seguro");
        return;
        }
        System.out.println("Dgite o grupo de risco do pretendente (1,2 ou 3): ");
        gpRisco = ler.nextInt();
        if (idade >= 17 && idade <= 20) {
            if (gpRisco == 1) {
                categoria = "Categoria 1";
            } else if (gpRisco == 2) {
                categoria = "Categoria 2";
            } else {
                categoria = "Categoria 3";
            }
        }  if (idade >= 21 && idade <= 24) {
            if (gpRisco == 2) {
                categoria = "Categoria 2";
            } else if (gpRisco == 3) {
                categoria = "Categoria 3";
            } else {
                categoria = "Categoria 4";
            }
        } if (idade >= 25 && idade <= 34) {
            if (gpRisco == 3) {
                categoria = "Categoria 3";
            } else if (gpRisco == 4) {
                categoria = "Categoria 4";
            } else {
                categoria = "Categoria 5";
            }
        } if (idade >= 35 && idade <= 64) {
            if (gpRisco == 4) {
                categoria = "Categoria 4";
            } else if (gpRisco == 5) {
                categoria = "Categoria 5";
            } else {
                categoria = "Categoria 6";
            }
        } if (idade >= 65 && idade <= 70) {
            if (gpRisco == 7) {
                categoria = "Categoria 7";
            } else if (gpRisco == 8) {
                categoria = "Categoria 8";
            } else {
                categoria = "Categoria 9";
            }
        }
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Categoria de seguro: " + categoria);
    }
}


//        if (idade >= 17 && idade <= 30) {
//            if (gpRisco == 1) {
//                categoria = "Categoria A";
//            } else if (gpRisco == 2) {
//                categoria = "Categoria B";
//            } else {
//                categoria = "Categoria C";
//            }
//        } else if (idade <= 50) {
//            if (gpRisco == 1) {
//                categoria = "Categoria D";
//            } else if (gpRisco == 2) {
//                categoria = "Categoria E";
//            } else {
//                categoria = "Categoria F";
//            }
//        } else {
//            if (gpRisco == 1) {
//                categoria = "Categoria G";
//            } else if (gpRisco == 2) {
//                categoria = "Categoria H";
//            } else {
//                categoria = "Categoria I";
//            }
//        }
