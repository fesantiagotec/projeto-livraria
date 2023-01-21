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

//    public static void alterarDadosAlbumDeMusica (Scanner scanner, String nomeProdutoAlterar, Double valorAtualizado, List listaAlbunsDeMusica) {
//        System.out.println("Digite o nome do Álbum de Músicas que deseja alterar dados:");
//        scanner.nextLine();
//        nomeProdutoAlterar = scanner.nextLine();
//        System.out.println("Digite o valor preço que substituirá o atual:");
//        valorAtualizado = scanner.nextDouble();
//
//        for (AlbumDeMusica objetoListaAlbumDeMusica: listaAlbunsDeMusica) {
//            if (nomeProdutoAlterar.equals(objetoListaAlbumDeMusica.getNome())) {
//                objetoListaAlbumDeMusica.setPreco(valorAtualizado);//alterado preço do produto
//                System.out.println(objetoListaAlbumDeMusica.getPreco());
//            }
//        }
//    }


//    public static void imprimirListaAlbumDeMusica (List listaAlbunsDeMusica) {
//        for (AlbumDeMusica objetoListaAlbumDeMusica : listaAlbunsDeMusica) {
//            System.out.println("Id: " + objetoListaAlbumDeMusica.getId());
//            System.out.println("Nome: " + objetoListaAlbumDeMusica.getNome());
//            System.out.println("Preço: " + objetoListaAlbumDeMusica.getPreco());
//            System.out.println("Músicos da Banda: " + objetoListaAlbumDeMusica.getMusicosBanda());
//            System.out.println("Gênero: " + objetoListaAlbumDeMusica.getGenero());
//            System.out.println("Selo: " + objetoListaAlbumDeMusica.getSelo());
//            System.out.println();
//        }
//    }

//    public void imprimirListaAlbumDeMusica () {
//        listaAlbunsDeMusica.forEach((objetoListaAlbumDeMusica) -> {
//            System.out.println("Id: " + objetoListaAlbumDeMusica.getId());
//            System.out.println("Nome: " + objetoListaAlbumDeMusica.getNome());
//            System.out.println("Preço: " + objetoListaAlbumDeMusica.getPreco());
//            System.out.println("Músicos da Banda: " + objetoListaAlbumDeMusica.getMusicosBanda());
//            System.out.println("Gênero: " + objetoListaAlbumDeMusica.getGenero());
//            System.out.println("Selo: " + objetoListaAlbumDeMusica.getSelo());
//            System.out.println();
//        });
//    }


}
