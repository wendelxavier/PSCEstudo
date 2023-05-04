public class Atv10Class {
    public static boolean ePerfeito(int num){
        int soma=0;
        for (int i = 1; i < num; i++){
            if (num % i == 0){
                soma += i;
            }
        }
        return (soma==num);

    }
}
