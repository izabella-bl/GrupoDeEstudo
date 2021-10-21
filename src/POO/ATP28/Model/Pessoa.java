package POO.ATP28.Model;

public class Pessoa extends BaseId {
    private String nome;
    private Endereco enderecoResi;
    private Endereco enderecoCorm;


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Endereco getEnderecoResi() {
        return enderecoResi;
    }

    public void setEnderecoResi(Endereco enderecoResi) {
        this.enderecoResi = enderecoResi;
    }

    public Endereco getEnderecoCorm() {
        return enderecoCorm;
    }

    public void setEnderecoCorm(Endereco enderecoCorm) {
        this.enderecoCorm = enderecoCorm;
    }

    @Override
    public String
    toString() {
        return "Nome: "+this.nome +"\n"+
                "Endereço Residencial:" + enderecoResi.getLogradouro()+","+enderecoResi.getNumero()+","+enderecoResi.getComplemento()+". Cep:"+enderecoResi.getCep()+"."+enderecoResi.getCidade()+"-"+enderecoResi.getEstado()+"\n" +
                "Endereço Cormecial:" + enderecoCorm.getLogradouro()+","+enderecoCorm.getNumero()+","+enderecoCorm.getComplemento()+". Cep:"+enderecoCorm.getCep()+"."+enderecoCorm.getCidade()+"-"+enderecoCorm.getEstado()+"\n";
    }

}
