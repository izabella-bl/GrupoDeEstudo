package POO.ATP28.View;


import POO.ATP28.Controller.PessoaFisicaController;
import POO.ATP28.Controller.PessoaJuridicaController;
import POO.ATP28.Model.Endereco;
import POO.ATP28.Model.PessoaFisica;
import POO.ATP28.Model.PessoaJuridica;

public class MainView {
    public static void main(String[] args) {
        PessoaFisica pf = new PessoaFisica();
        PessoaFisicaController pfc = new PessoaFisicaController();
        PessoaJuridicaController pjc = new PessoaJuridicaController();
        Endereco enpf = new Endereco();


        pf.setNome("Izabella");
        pf.setCpf("111.111.111-32");
        enpf.setLogradouro("Rua 24 de outubro");
        enpf.setCep("320233-333");
        enpf.setComplemento("Lot 34");
        enpf.setNumero(333);
        enpf.setCidade("Goiânia");
        enpf.setEstado("Goiás");
        pf.setEnderecoCorm(enpf);
        pf.setEnderecoResi(enpf);


        PessoaJuridica pj = new PessoaJuridica();
        pj.setNome("Izabella");
        pj.setCnpj("111.111.111-32");
        pj.setEnderecoResi(enpf);
        pj.setEnderecoCorm(enpf);



        pfc.create(pf);
        pjc.create(pj);

        System.out.println("==========================================Pessoa Física====================================");
        for ( PessoaFisica l: pfc.read()) {
            System.out.println(l);
        }

        System.out.println("==========================================Pessoa Jurídica====================================");
        for ( PessoaJuridica l1: pjc.read()) {
            System.out.println(l1);
        }




    }
}
