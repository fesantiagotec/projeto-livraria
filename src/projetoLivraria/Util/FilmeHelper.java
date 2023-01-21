package projetoLivraria.Util;

import projetoLivraria.Produtos.Filme;

import java.util.List;
import java.util.Scanner;

public class FilmeHelper {

    public static Filme cadastrarFilme (Scanner scanner,Integer contId, List listaFilmes) {

        Filme filme = new Filme();

        filme.setId(contId + 1);

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

        return filme;
    }

}
