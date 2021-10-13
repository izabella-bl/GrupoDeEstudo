package POO.ATP_RO9.Domain;

import java.util.Random;

public class Produto {
    private long codigo;
    private String nome;
    private String descricao;
    private double valor;

    public Produto(){
        this.sorteoCod();
    }

    public void setCodigo(long codigo) {
        this.codigo = codigo;
    }

    public long getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    private int sorteoCod() {
        Random gerador = new Random();
        this.codigo = gerador.nextInt(3);


    }

    @Override
    public String toString() {
        return "-------------Produto-------------" + "\n" +
                "Codigo=" + this.codigo + "\n" +
                "Nome: " + this.nome + "\n" +
                "Descricao: " + this.descricao + "\n" +
                "Valor :" + this.valor + "\n" +
                "--------------------------------\n";

    }

}