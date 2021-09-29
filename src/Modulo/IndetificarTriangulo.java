package Modulo;

import java.util.Scanner;

public class IndetificarTriangulo {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        double num1 = informa("Informa o primeiro  lado do triangulo:");
        double num2 = informa("Informa o segundo lado do triangulo:");
        double num3 = informa("Informa o terceiro  lado do triangulo:");

        TrianguloEquilatero(num1,num2,num3);
        TrianguloEscaleno(num1,num2,num3);
        TrianguloIsosceles(num1,num2,num3);

    }

    public static double informa( String mensagem){
        System.out.println(mensagem);
        double num = Integer.parseInt(sc.nextLine());
        return num;
    }

    public static boolean TrianguloEquilatero(double num1,double num2,double num3){
        if(num1 == num2 && num2 == num3 && num1 == num3){
            System.out.println("Triângulo Equilátero");
            return true;
        }
        return  false;
    }

    public static boolean TrianguloIsosceles(double num1,double num2,double num3){
        if(num1 == num2 && num1 != num3 && num2!=num3){
            System.out.println("Triângulo Isósceles");
            return true;
        }
        else if(num1 != num2 && num1 == num3 && num2!=num3){
            System.out.println("Triângulo Isósceles");
            return true;
        }
        else if(num1 != num2 && num1 != num3 && num2==num3){
            System.out.println("Triângulo Isósceles");
            return true;
        }
        return  false;
    }

    public static boolean TrianguloEscaleno(double num1,double num2,double num3){
        if(num1 != num2 && num2 !=num3 && num1 != num3){
            System.out.println("Triangulo Escaleno");
            return true;
        }
        return  false;
    }
}
