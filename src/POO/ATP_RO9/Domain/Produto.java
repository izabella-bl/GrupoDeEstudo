package POO.ATP_RO9.Domain;

import java.util.Random;

public class Produto {
    private long codigo;
    private String nome;
    private String descricao;
    private double valor;

    public Produto (){
        this.codigo = sorteoCod();
    }

    public long getCodigo() {
        return codigo;
    }

    public void setCodigo(long codigo) {
        this.codigo = codigo;
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

    private long sorteoCod() {
        Random gerador = new Random();
        return gerador.nextInt(3);
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

    @Override
    public boolean equals(Object obj) {
        Produto produto = (Produto) obj;

        if(this.codigo == produto.getCodigo()){
            return true;
        }
        else{
            return false;
        }
    }
}