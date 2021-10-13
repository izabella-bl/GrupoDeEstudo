package POO.ATP_RO9.Repository;

import POO.ATP_RO9.Domain.Produto;

import java.util.ArrayList;

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
        if(this.lista.contains(p)) {
            delete(p);
            create(p);
        }
    }
    public void delete(Produto p){
        lista.remove(p);
    }

}
