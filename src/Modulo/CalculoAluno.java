package Modulo;

import java.util.Locale;
import java.util.Scanner;

public class CalculoAluno{

    static Scanner  sc = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println("---------------------------Bem Vindo!---------------------------");
        menu();
    
        
    }

    static double nota (String Mensagem){
        boolean valida =  true;
        double nota = 0 ;
        do{ 
            System.out.println(Mensagem);
            nota = Double.parseDouble(sc.nextLine());
            valida = validarNota(nota);
        }while(!valida);
        return nota;
    }

    static int qtdAluno (){
        System.out.println("Informe a quantidade de aluno :");
        int qtdAluno = Integer.parseInt(sc.nextLine());
        return qtdAluno;
    }

    static char opcao(String Mensagem){
        System.out.println(Mensagem);
        char opcao = sc.nextLine().toUpperCase().charAt(0);
        return opcao;
    }

    static boolean validarNota(double nota){
           if(nota>= 0 && nota <=10){
               return true;
           }
           else{
               System.out.println("Nota invalida tente novamente!");
               return false;
           }
        

    }

    static  void menu(){
        boolean validar = true;
        do{
            int qtd = qtdAluno();
            char opcao = opcao("\nInforme:\nA - Para media aritmética\nP - Para media ponderada\nS-Para sair\n");

        
           
                switch(opcao){
                    case 'A':
                     for(int i = 1; i <= qtd ;i++){
                        double nota1 = nota("Informe a primeira nota do aluno "+i+" :");
                        double nota2 = nota("Informe a segunda nota aluno "+i+" :");
                        double nota3 = nota("Informe a terceira nota aluno "+i+" :");
                        double media1 = (nota1 + nota2 + nota3)/3;
                        System.out.printf("Media final nota aluno %d: %.2f\n",i,media1);
                        validar = true;
                        
                     }
                     break;

                     case 'P':
                      for(int i = 1; i <= qtd ;i++){
                        double nota4= nota("Informe a primeira nota aluno "+i+" :");
                        double nota5 = nota("Informe a segunda nota aluno "+i+" :");
                        double nota6 = nota("Informe a terceira nota aluno "+i+" :");
                        double media2 = ((nota4*5)+ (nota5*3) + (nota6*2))/3;
                          System.out.printf("Media final nota aluno %d: %.2f\n",i,media2);
                        validar = true;
                    
                      }
                      break;

                      case 'S':
                         System.out.println("Obrigada!");
                         validar = false;
                         break;

                      default:
                        System.out.println("Letra invalida!");
                        validar = true;
                        break;

                }
            
        
        }while(validar);

        

    }

  
}