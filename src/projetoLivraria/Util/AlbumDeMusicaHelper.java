package projetoLivraria.Util;

import projetoLivraria.Produtos.AlbumDeMusica;

import java.util.List;
import java.util.Scanner;

public class AlbumDeMusicaHelper {

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


}
