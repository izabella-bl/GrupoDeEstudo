/*Escreva uma função que recebe por parâmetro um valor inteiro e positivo N e retornao valor de S,
calculado segundo a fórmulaabaixo.S = 2/4 + 5/5 + 10/6 + 17/7 + 26/8 + ... +((n^2)+1)/(n+3)
Faça um programa que leia N e imprima o valor retornado pela função.*/

package Modulo;

import java.util.Scanner;

public class CalculoFormula {

    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);

        double soma = 0;
        double resultado = 0;
        System.out.println("Informe um numero:");
        int num = Integer.parseInt(sc.nextLine());

        for (int i = 1; i <= num; i++) {
            resultado = funcao(i);
            System.out.println(resultado);
            soma += resultado;

        }

        System.out.printf("\nSoma total : %.2f",soma);
    }

    static double funcao(int num){
        double resultado = ((num^2)+1.0)/(num+3.0);
        return resultado;
    }
}
