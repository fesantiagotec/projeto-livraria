package projetoLivraria.Util;

import projetoLivraria.Produtos.Filme;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FilmeHelper {

    private static List<Filme> listaFilmes = new ArrayList();
    private static Integer contID = 1;
    public static void cadastrarFilme (Scanner scanner) {

        Filme filme = new Filme();

        filme.setId(contID);

        System.out.println("Qual o nome do filme que deseja cadastrar?");
        scanner.nextLine();
        filme.setNome(scanner.nextLine());
        System.out.println("Qual preço do filme que deseja cadastrar?");
        filme.setPreco(scanner.nextDouble());
        System.out.println("Qual o estudio do filme que deseja cadastrar?");
        scanner.nextLine();
        filme.setEstudio(scanner.nextLine());
        System.out.println("Qual o diretor do filme que deseja cadastrar?");
        filme.setDiretor(scanner.nextLine());
        System.out.println("Qual o genero do filme que deseja cadastrar?");
        filme.setGenero(scanner.nextLine());
        System.out.println("Qual o produtor do filme que deseja cadastrar?");
        filme.setProdutor(scanner.nextLine());

        listaFilmes.add(filme);

        System.out.println("Produto cadastrado com sucesso!");
        System.out.println();

        contID++;

    }

    public static void exibirMenuAtributosFilme () {
        System.out.println("Produto encontrado no estoque!");
        System.out.println();
        System.out.println("Qual dado deseja alterar?");
        System.out.println("1 - Nome");
        System.out.println("2 - Preço");
        System.out.println("3 - Estúdio");
        System.out.println("4 - Diretor");
        System.out.println("5 - Gênero");
        System.out.println("6 - Produtor");
        System.out.println("Digite a opção:");

    }

}
