package POO.ATP_RO9.View;

import POO.ATP_RO9.Domain.Produto;
import POO.ATP_RO9.Repository.ProdutoRepository;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ProdutoRepository pr = new ProdutoRepository();

        for (int i = 1; i <= 3; i++) {
            Produto p = new Produto();
            boolean repetido = false;

            do {
                for (Produto produto : pr.read()) {
                    if (produto.equals(p)) {
                        p = new Produto();
                        repetido = true;
                        break;
                    }
                    else {
                        repetido = false;
                    }

                }
            }while (repetido);

            System.out.printf("\n--------------Produto %d---------------\n", i);
            System.out.println("Informe o nome do produto:");
            String nome = sc.nextLine();
            p.setNome(nome);

            System.out.println("Informe a descrição desse prduto:");
            String descricao = sc.nextLine();
            p.setDescricao(descricao);

            System.out.print("\nInforme o valor desse produto: R$ ");
            double valor = Double.parseDouble(sc.nextLine());
            p.setValor(valor);

            pr.create(p);
        }

        for (Produto p : pr.read()) {
            System.out.println(p);
        }


        Produto p = new Produto();
        System.out.println("Digite o id do produto que deseja atulizar:");
        int id = Integer.parseInt(sc.nextLine());
        p.setCodigo(id);

        System.out.println("altere o nome:");
        String nome = sc.nextLine();
        p.setNome(nome);
        pr.update(p);

        for (Produto p1 : pr.read()) {
            System.out.println(p1);
        }

    }
}
