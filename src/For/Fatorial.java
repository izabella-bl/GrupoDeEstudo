package For;

import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int fatorial = 1;

        System.out.println("Informe o numero que você deseja o fatorial: ");
        int num = sc.nextInt();

        for (int i = 1; i <= num; i++) {
             fatorial *= i;
        }
        System.out.println("Fatorial desse numero é"+fatorial);

    }
}
