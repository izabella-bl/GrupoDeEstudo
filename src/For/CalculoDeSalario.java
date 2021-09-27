package For;

import java.util.Scanner;

//ATENÇÃ0:Esse codigo só vai sair do loop se digitar o numero 5 do menu , caso ao contrario vai aparecer toda hora o menu.

public class CalculoDeSalario {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("--------------------Bem vindo ao sistema de salário!--------------");
        boolean continuar = true;
        boolean validacao = true;


        while(continuar){  //Verificar se a pessoa vai digitar o numero errado ou deseja fazer outra consulta.

            System.out.println("Menu:\n1-Serviços Gerais\n2-Vigia\n3-Recepcionista\n4-Vendedor\n5-sair\n");
            System.out.print("Digite o numero do cargo ou 5 para sair:");
            short opcao = sc.nextShort();

            switch (opcao){
                case 1:
                    do{
                        System.out.print("Digite o seu salário: R$ ");
                        double salario = sc.nextFloat();

                        if (salario <= 0){ // verificar se o salario é igual ou menor a zero
                            System.out.println("Salario tem que ser maior do que zero reais!");
                            validacao =true; //  persistencia até ele digitar corretamente e chegar no else
                        }
                        else{
                            salario *= 1.5; // calcula o aumento do salario.
                            System.out.println("\nCargo:Serviços Gerais ");
                            System.out.printf("Salário: R$ %.2f \n",salario);
                            validacao = false; // Chegou no else ele vai parar de persistir de pergunta do salario e imprimir o resultado

                        }

                    }while (validacao);

                 break;

                case 2:
                    do{
                        System.out.print("Digite o seu salário: R$ ");
                        double salario = sc.nextFloat();

                        if (salario <= 0.0){
                            System.out.println("Salario tem que ser maior do que zero reais!");
                            validacao =true;
                        }
                        else{
                            salario *= 1.3;
                            System.out.println("Cargo: Vigia");
                            System.out.printf("Salário: R$ %.2f \n",salario);
                            validacao = false;

                        }

                    }while (validacao);
                break;

                case 3:
                    do{
                        System.out.print("Digite o seu salário: R$ ");
                        double salario = sc.nextFloat();

                        if (salario <= 0){
                            System.out.println("Salario tem que ser maior do que zero reais!");
                            validacao =true;
                        }
                        else{
                            salario *= 1.25;
                            System.out.println("Cargo: Recepcionista");
                            System.out.printf("Salário: R$ %.2f \n",salario);
                            validacao = false;

                        }

                    }while (validacao);
                break;

                case 4:
                    do{
                        System.out.print("Digite o seu salário: R$ ");
                        double salario = sc.nextFloat();

                        if (salario <= 0){
                            System.out.println("Salario tem que ser maior do que zero reais!");
                            validacao =true;
                        }
                        else{
                            salario *= 1.15;
                            System.out.println("Cargo: Vendedor");
                            System.out.printf("Salário: R$ %.2f \n",salario);
                            validacao = false;

                        }

                    }while (validacao);
                break;

                case 5:
                    System.out.println("Obrigada pela visita!");
                    continuar = false; //Só ira sair do loop se digitar o numero 5
                break;

                default:
                    System.out.println("\nCodigo incorreto , tente novamente!\n");
                break;

            }
        }
    }
}
