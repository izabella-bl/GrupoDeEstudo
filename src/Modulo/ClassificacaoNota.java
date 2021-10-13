 /*Faça  um procedimento que  recebe  a  média  final  de  um  aluno,  identifica  e  exibe  o  seu conceito,
 conforme  a  tabela  abaixo.  Faça  um  programa  que  leia  a  média  de  N  alunos,
 acionando o procedimento para cada um deles.
 (N deve ser lido doteclado)*/

package Modulo;

 import java.util.Scanner;

 public class ClassificacaoNota {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
       int qtdAlunos = (int)informa("Informa a quantidade de alunos:");
       Conceito(qtdAlunos);




    }

    static double informa(String mensagem){
        System.out.println(mensagem);
        double num = sc.nextDouble();
        return num;
    }

    static void Conceito(int qtdAluno){
        boolean isValido;
        double media ;

        for (int i = 1; i <= qtdAluno ; i++) {
            System.out.printf("------------------------------ Aluno %d -------------------------\n",i);
            do{
                media = informa("Informa a media final do exercicio do Aluno:");
                isValido = validarMedia(media);
            }while (!isValido);


            if (media <= 39){
                System.out.println("Conceito do aluno é F");
            }
            else if(media >=40 && media <=59 ){
                System.out.println("Conceito do aluno é E");
            }
            else if(media >=60 && media <=69 ){
                System.out.println("Conceito do aluno é D");
            }
            else if(media >=70 && media <=79 ){
                System.out.println("Conceito do aluno é C");
            }
            else if(media >=80 && media <=89 ){
                System.out.println("Conceito do aluno é B");
            }
            else if(media >= 90 ){
                System.out.println("Conceito do aluno é ");
            }

        }

    }

    static boolean validarMedia(double nota){
        if(nota < 0){
            System.out.println("Media invalida! Tente novamente.");
            return false;
        }
        return true;
    }

}
