package projetoLivraria.Util;

import projetoLivraria.Produtos.Livro;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LivroHelper {

    private static List<Livro> listaLivros = new ArrayList();
    private static Integer contID = 1;

    public static void cadastrarLivro (Scanner scanner) {

        Livro livro = new Livro();

        livro.setId(contID);

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

        contID++;

    }
    public static void imprimirListaLivros(){
        for (Livro objetoListaLivro : listaLivros) {
            System.out.println("Id: " + objetoListaLivro.getId());
            System.out.println("Nome: " + objetoListaLivro.getNome());
            System.out.println("Preço: " + objetoListaLivro.getPreco());
            System.out.println("Gênero: " + objetoListaLivro.getGenero());
            System.out.println("Escritor: " + objetoListaLivro.getEscritor());
            System.out.println("Editora: " + objetoListaLivro.getEditora());
            System.out.println();
        }
    }

    public static void removerLivro (Integer id) {
        for (Livro objetoListaLivro: listaLivros) {
            if (id.equals(objetoListaLivro.getId())) {
                listaLivros.remove(objetoListaLivro);//retirado do estoque
            }
        }
    }

    public static void exibirMenuAtributosLivro () {
        System.out.println("Produto encontrado no estoque!");
        System.out.println();
        System.out.println("Qual dado deseja alterar?");
        System.out.println("1 - Nome");
        System.out.println("2 - Preço");
        System.out.println("3 - Gênero");
        System.out.println("4 - Escritor");
        System.out.println("5 - Editora");
        System.out.println("Digite a opção:");
    }

}
