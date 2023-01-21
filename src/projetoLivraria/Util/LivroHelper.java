package projetoLivraria.Util;

import projetoLivraria.Produtos.Livro;

import java.util.List;
import java.util.Scanner;

public class LivroHelper {

    public static Livro cadastrarLivro (Scanner scanner, Integer contId, List listaLivros) {

        Livro livro = new Livro();

        livro.setId(contId + 1);

        System.out.println("Qual o nome do livro que deseja cadastrar?");
        scanner.nextLine();
        livro.setNome(scanner.nextLine());
        System.out.println("Qual o preço do livro que deseja cadastrar?");
        livro.setPreco(scanner.nextDouble());
        System.out.println("Qual o genero do livro que deseja cadastrar?");
        scanner.nextLine();
        livro.setGenero(scanner.nextLine());
        System.out.println("Qual o escritor do livro que deseja cadastrar?");
        livro.setEscritor(scanner.nextLine());
        System.out.println("Qual a editora do livro que deseja cadastrar?");
        livro.setEditora(scanner.nextLine());

        listaLivros.add(livro);

        System.out.println("Produto cadastrado com sucesso!");
        System.out.println();

        return livro;
    }

}
