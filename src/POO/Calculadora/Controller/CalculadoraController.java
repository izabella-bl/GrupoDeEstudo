package POO.Calculadora.Controller;

import POO.Calculadora.Model.Numeros;

public class CalculadoraController {
    private Numeros numero ;

    public CalculadoraController(){
        this.numero = new Numeros();
    }

    public int soma(){
        return numero.getNum1() + numero.getNum2();
    }

    public int subtracao(){
        return numero.getNum1() - numero.getNum2();

    }

    public int multiplicacao(){
        return numero.getNum1() * numero.getNum2();
    }

    public double divisao(){
        return (double)numero.getNum1() / (double) numero.getNum2();
    }

}
