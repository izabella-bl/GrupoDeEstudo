package POO.ATP_RO9.Repository;

import POO.ATP_RO9.Domain.Produto;

import java.util.ArrayList;
import java.util.Scanner;

public class ProdutoRepository {
    private ArrayList <Produto> lista;

    public ProdutoRepository() {
        lista = new ArrayList<>();
    }

    public void create(Produto p){
        lista.add(p);
    }

    public ArrayList<Produto> read(){
        return lista;
    }

    public void update(Produto p ) {
        for (int i = 0; i < lista.size() ; i++) {

            if(this.lista.get(i).getCodigo() == p.getCodigo()) {
                Produto produtoAntigo =  this.lista.get(i);
                p.setDescricao(produtoAntigo.getDescricao());
                p.setValor(produtoAntigo.getValor());
                lista.set(i,p);
            }

        }

    }
    public void delete(Produto p){
        lista.remove(p);
    }

}
