package For;

import java.util.Scanner;

public class NumerosImparFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean valido = true;
     do {
         System.out.println("Digite um numero de entrada:");
         int num = sc.nextInt();

       if(num <= 1000) {
           for (int i = 0; i <= num; i++) {

               if (i % 2 == 1) {
                   System.out.println(i);
               }
               else if( i<= num){
                   valido = false;
               }

           }

          }else{
           System.out.println("Número tem que ser menor que 1000!");
          }
     } while (valido);
    }
}

