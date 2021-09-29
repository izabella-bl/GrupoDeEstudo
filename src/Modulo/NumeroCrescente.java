package Modulo;

import java.util.Scanner;

public class NumeroCrescente {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
      int num1= informa("Informa o primeiro numero:");
      int num2= informa("Informa o segundo numero:");
      int num3= informa("Informa o terceiro numero:");
      crescente(num1,num2,num3);


    }

    static int informa(String mensagem){
        System.out.println(mensagem);
        int num =Integer.parseInt(sc.nextLine());
        return num;
    }

    static void crescente(int num1,int num2,int num3){
        int auxiliar;
        if (num1 > num2) {
            auxiliar = num1;
            num1 = num2;
            num2 = auxiliar;
        }

        if (num2 > num3) {
            auxiliar = num2;
            num2 = num3;
            num3 = auxiliar;

        }


        if (num1 > num2) {
            auxiliar = num1;
            num1 = num2;
            num2 = auxiliar;
        }
        System.out.printf("crescente: %d %d %d",num1,num2,num3);
    }


}
