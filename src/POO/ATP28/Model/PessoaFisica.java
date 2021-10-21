package POO.ATP28.Model;

public class PessoaFisica extends Pessoa {
    private String nome;
    private String cpf;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        return String.format("\nID: %d\n"+
                             "Nome: %s\n "+
                             "CPF: %s\n"+
                             super.toString(), this.getId(), this.nome,this.cpf);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof PessoaFisica) {
            PessoaFisica pessoaFisica = (PessoaFisica) obj;
            if (this.getId() == pessoaFisica.getId()) {
                return true;
            }
        }
        return false;
    }
}


