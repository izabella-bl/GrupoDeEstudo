package Modulo;

import java.util.Scanner;

public class PesquisaPrefeitura {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int pessoa = 0;
        int pessoa2= 1;
        boolean novamente = true;
        double salarioPopulacao = 0  ;
        do {

            System.out.printf("\n------------------Pessoa %d------------------\n",pessoa2);
            double qtdFilhos = informa("Informa a quantidade de filhos:");
            double salario = informa("Informa o seu salario:");
            pessoa ++;
            pessoa2 ++;
            salarioPopulacao += salario;


            novamente = continuar();

        }while( novamente);
        double mediaPopulacao =MediaSalario(salarioPopulacao,pessoa);
        System.out.printf("\nSalario médio da população: R$ %.2f", mediaPopulacao);


    }

    public static double MediaSalario(  double salario , int pessoas){
        double media = salario / pessoas;
        return  media;

    }

    public  static double informa( String mensagem){
        boolean validar = true;
        double num = 0;
        do {
            System.out.println(mensagem);
            num = Double.parseDouble(sc.nextLine());
            validar = validarNum(num);
        }while (!validar);
        return  num;
    }

    public static boolean validarNum(double num){
        if(num < 0){
            System.out.println("Numero invalido!Tente novamente");
            return false;
        }
        return  true;

    }

    public static boolean continuar( ){
          boolean validar;
          boolean retorno = true;
        do {
            System.out.println("Deseja continuar ? S - sim | N - não");
            char opcao = sc.nextLine().toUpperCase().charAt(0);
            if (opcao == 'S') {
                validar = true;
                retorno = true;

            } else if (opcao == 'N'){
                validar = true;
                retorno = false;
            }
            else{
                System.out.println("Opção invalida!Tente novamenter.");
                validar = false;
            }

        }while (!validar);

        return  retorno;
    }


}

