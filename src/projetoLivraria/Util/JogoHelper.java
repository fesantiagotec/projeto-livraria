package projetoLivraria.Util;

import projetoLivraria.Produtos.Jogo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JogoHelper {

    private static List<Jogo> listaJogos = new ArrayList();
    private static Integer contID = 1;

    public static void cadastrarJogo (Scanner scanner) {

        Jogo jogo = new Jogo();

        jogo.setId(contID);

        System.out.println("Qual o nome do jogo que deseja cadastrar?");
        scanner.nextLine();
        jogo.setNome(scanner.nextLine());
        System.out.println("Qual preço do jogo que deseja cadastrar?");
        jogo.setPreco(scanner.nextDouble());
        System.out.println("Qual o estudio do filme que deseja cadastrar?");
        scanner.nextLine();
        jogo.setEstudio(scanner.nextLine());
        System.out.println("Qual a distribudora do filme que deseja cadastrar?");
        jogo.setDistribuidora(scanner.nextLine());
        System.out.println("Qual o genero do filme que deseja cadastrar?");
        jogo.setGenero(scanner.nextLine());

        listaJogos.add(jogo);

        System.out.println("Produto cadastrado com sucesso!");
        System.out.println();

        contID++;

    }

    public static void imprimirListaJogos() {
        for (Jogo objetoListaJogo : listaJogos) {
            System.out.println("Id: " + objetoListaJogo.getId());
            System.out.println("Nome: " + objetoListaJogo.getNome());
            System.out.println("Preço: " + objetoListaJogo.getPreco());
            System.out.println("Distribuidora: " + objetoListaJogo.getDistribuidora());
            System.out.println("Gênero: " + objetoListaJogo.getGenero());
            System.out.println("Estudio: " + objetoListaJogo.getEstudio());
            System.out.println();
        }
    }

    public static void exibirMenuAtributosJogo() {
        System.out.println("Produto encontrado no estoque!");
        System.out.println();
        System.out.println("Qual dado deseja alterar?");
        System.out.println("1 - Nome");
        System.out.println("2 - Preço");
        System.out.println("3 - Distribuidora");
        System.out.println("4 - Gênero");
        System.out.println("5 - Estúdio");
        System.out.println("Digite a opção:");
    }

}
