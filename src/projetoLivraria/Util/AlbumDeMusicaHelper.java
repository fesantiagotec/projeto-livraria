package projetoLivraria.Util;

import projetoLivraria.Produtos.AlbumDeMusica;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AlbumDeMusicaHelper {

    private static Scanner scanner;
    private List<AlbumDeMusica> listaAlbunsDeMusica = new ArrayList<>();
    public static Integer contID = 0;
    Scanner sc = new Scanner(System.in);

    public static AlbumDeMusica cadastrarAlbumDeMusica (Scanner scanner, Integer contId, List listaAlbunsDeMusica) {
        AlbumDeMusica musica = new AlbumDeMusica();

        musica.setId(contId + 1);

        System.out.println("Qual o nome da música que deseja cadastrar?");
        scanner.nextLine();
        musica.setNome(scanner.nextLine());
        System.out.println("Qual preço da música que deseja cadastrar?");
        musica.setPreco(scanner.nextDouble());
        System.out.println("Quais os músicos da banda que deseja cadastrar?");
        scanner.nextLine();
        musica.setMusicosBanda(scanner.nextLine());
        System.out.println("Qual o genero musical que deseja cadastrar?");
        musica.setGenero(scanner.nextLine());
        System.out.println("Qual o selo da música que deseja cadastrar?");
        musica.setSelo(scanner.nextLine());

        listaAlbunsDeMusica.add(musica);

        System.out.println("Produto cadastrado com sucesso!");
        System.out.println();

        return musica;
    }

    public static void exibirMenuAtributosAlbumDeMusica () {
        System.out.println("Produto encontrado no estoque!");
        System.out.println();
        System.out.println("Qual dado deseja alterar?");
        System.out.println("1 - Nome");
        System.out.println("2 - Preço");
        System.out.println("3 - Músicos da Banda");
        System.out.println("4 - Gênero");
        System.out.println("5 - Selo");
        System.out.println("Digite a opção:");
    }

}
