package Modulo;

import java.util.Scanner;

public class SomaFatorial {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um numero:");
        int num = Integer.parseInt(sc.nextLine());
        double resultado = Soma(num);
        System.out.printf("\nResultado final : %.2f",resultado);
    }

    static int Fatorial(int N){
        int fatorial = 1;
        for (int i = 1; i <= N; i++) {
            fatorial *= i;
        }
        return fatorial;
    }

    static double Soma(int N){
        double soma = 1 ;
        for (int j= 1; j <= N; j++) {
            double resultado = 1.0/Fatorial(j);
            soma += resultado;
        }
        return  soma;
    }
}
