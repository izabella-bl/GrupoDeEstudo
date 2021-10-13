package POO.L1_N1;

import java.util.Scanner;

public class Main {
     static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int op;
        Contador c = new Contador();
        System.out.println("Digite um numero:");
        int num =Integer.parseInt(sc.nextLine());
        c.setNum(num);


        do{
            System.out.println("Digite : 1 - Para zerar || 2 - Para encrementar || 3 - Sair");
            op = Integer.parseInt(sc.nextLine());

            switch (op){
                case 1:
                    c.zera();
                    System.out.println(c.toString());
                    break;
                case 2:
                    c.encrementar();
                    System.out.println(c.toString());
                    break;

                case 3:
                    System.out.println("Obrigada!");
                    break;
            }

        }while (op == 1 || op == 2 );

    }

}
