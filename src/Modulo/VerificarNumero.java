package Modulo;

import java.util.Scanner;

public class VerificarNumero {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
         int vezes = (int) Informar("Informa a quantidade vezes:");

        for (int i = 1; i <=  vezes  ; i++) {
            double num = Informar("Informa o numero "+i+" :");

              boolean resultado = Verifica(num);
              if(resultado = true){
                  System.out.println( "Numero negativo!");
              }
              else{
                  System.out.println("Numero positivo");
              }

        }


    }

    static double Informar(String mensagem){
        System.out.println(mensagem);
        double num = Double.parseDouble(sc.nextLine());
        return num;
    }

    static  boolean Verifica(double num){

        if(num < 0){
            return true;
        }
            return  false;

    }
}
