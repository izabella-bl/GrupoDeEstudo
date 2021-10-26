package POO.Calculadora.View;

import POO.Calculadora.Controller.CalculadoraController;
import POO.Calculadora.Model.Numeros;

import java.util.Scanner;


public class CasesView {
    static CalculadoraController cal = new CalculadoraController();
    static Numeros num = new Numeros();

    public void cases(int op){
        switch (op){
            case 1:
                System.out.println("Soma: "+cal.soma());
                break;
            case 2:
                System.out.println("Subtração: "+cal.subtracao());
                break;
            case 3:
                System.out.println("Multiplicação: "+cal.multiplicacao());
                break;
            case 4:

                do{
                    try{
                        System.out.println("Multiplicação: "+cal.multiplicacao());
                        validar(num.getNum2());
                    }

                }

                System.out.println("Multiplicação: "+cal.multiplicacao());
                break;
        }
    }

    public int lerNumero(String messangem){
        Scanner sc = new Scanner(System.in);
        int num = 0;
        boolean validar = true;
        do{
            try{
                System.out.println(messangem);
                num = Integer.parseInt(sc.nextLine());
                validar = true;
            }catch (Exception e){
                System.out.println(e.getMessage());
                validar =  false;

            }
        }while (!validar);

        return num;
    }

    public void  validar(int numero){
        if(numero == 0){
            throw new IllegalArgumentException("O divisor não pode ser zero!");
        }
        else{
            throw new NumberFormatException ("Valor inválido.O valor deve ser um número inteiro");
        }
    }
}
