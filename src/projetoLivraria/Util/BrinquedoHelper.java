package projetoLivraria.Util;

import projetoLivraria.Produtos.Brinquedo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BrinquedoHelper {

    private static List<Brinquedo> listaBrinquedos = new ArrayList();
    private static Integer contID = 1;

    public static void cadastrarBrinquedo (Scanner scanner) {

        Brinquedo brinquedo = new Brinquedo();

        brinquedo.setId(contID);

        System.out.println("Qual o nome do brinquedo que deseja cadastrar?");
        scanner.nextLine();
        brinquedo.setNome(scanner.nextLine());
        System.out.println("Qual preço do brinquedo que deseja cadastrar?");
        brinquedo.setPreco(scanner.nextDouble());
        System.out.println("Qual o tipo de brinquedo que deseja cadastrar?");
        scanner.nextLine();
        brinquedo.setTipo(scanner.nextLine());

        listaBrinquedos.add(brinquedo);

        System.out.println("Produto cadastrado com sucesso!");
        System.out.println();

        contID++;

    }

    public static void imprimirListaBrinquedos () {
        for (Brinquedo objetoListaBrinquedo : listaBrinquedos) {
            System.out.println("Id: " + objetoListaBrinquedo.getId());
            System.out.println("Nome: " + objetoListaBrinquedo.getNome());
            System.out.println("Preço: " + objetoListaBrinquedo.getPreco());
            System.out.println("Tipo: " + objetoListaBrinquedo.getTipo());
            System.out.println();
        }
    }

    public static void exibirMenuAtributosBrinquedo() {
        System.out.println("Produto encontrado no estoque!");
        System.out.println();
        System.out.println("Qual dado deseja alterar?");
        System.out.println("1 - Nome");
        System.out.println("2 - Preço");
        System.out.println("3 - Tipo");
        System.out.println("Digite a opção:");

    }
}
