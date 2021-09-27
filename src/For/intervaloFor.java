package For;

import java.util.Scanner;

public class intervaloFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int cont = 0 , cont1 = 0;

        System.out.println("Infome um valor :");
        int num = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i <=num; i++) {
            int x = sc.nextInt();

            if(x >= 10 && x <= 20){
                cont ++;
            }else {
                cont1++;
            }

        }
        System.out.println("Dentro do intervalo tem :"+cont);
        System.out.println("Fora do intervalo tem:"+ cont1);

    }
}
