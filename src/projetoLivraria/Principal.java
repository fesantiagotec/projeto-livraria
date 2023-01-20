package projetoLivraria;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {
    static Integer contId = 0;

    public static void main (String[] args) {

        //Criando a lista de objetos por categoria
        List<AlbumDeMusica> listaAlbunsDeMusica = new ArrayList();
        List<Brinquedo> listaBrinquedos = new ArrayList();
        List<Filme> listaFilmes = new ArrayList();
        List<Jogo> listaJogos = new ArrayList();
        List<Livro> listaLivros = new ArrayList();

        Scanner scanner = new Scanner(System.in);
        int opcaoMenu;
        int opcaoCategoria;

        //CaixaEmpresa caixaEmpresa = new CaixaEmpresa();
        Double dinheiroEmCaixaDaEmpresa = 1000.00;

        do {
            System.out.println();
            System.out.println("Bem vindos a Livraria - Good Vibes");
            System.out.println("Escolha um item do menu: ");
            System.out.println("1 - Cadastrar produto");
            System.out.println("2 - Editar produto cadastrado");
            System.out.println("3 - Remover produto cadastrado");
            System.out.println("4 - Visualizar produtos cadastrados");
            System.out.println("5 - Visualizar o quantitativo de produtos em estoque (por categoria)");
            System.out.println("6 - Visualizar listagem completa de produtos em estoque (geral)");
            System.out.println("7 - Visualizar listagem de produtos em estoque (por categoria)");
            System.out.println("8 - Realizar compra");
            System.out.println("9 - Valor em caixa (dinheiro)");
            System.out.println("10 - Sair");

            System.out.println("Digite a opção:");
            opcaoMenu = scanner.nextInt();

            switch (opcaoMenu) {
                case 1: //Menu 1 - Cadastrar produto

                    System.out.println("Trabalhamos com várias categorias de produtos:");
                    System.out.println("Qual categoria de produto deseja cadastrar?");
                    System.out.println("1 - Albuns De Musica");
                    System.out.println("2 - Brinquedos");
                    System.out.println("3 - Filme");
                    System.out.println("4 - Game");
                    System.out.println("5 - Livro");
                    System.out.println("Digite a opção:");
                    opcaoCategoria = scanner.nextInt();

                    switch (opcaoCategoria) {
                        case 1:

                            AlbumDeMusica musica = new AlbumDeMusica();

                            musica.setId(contId + 1);
                            contId = contId + 1;

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

                            break;
                        case 2:
                            Brinquedo brinquedo = new Brinquedo();

                            brinquedo.setId(contId + 1);
                            contId = contId + 1;

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
                            break;
                        case 3:
                            Filme filme = new Filme();

                            filme.setId(contId + 1);
                            contId = contId + 1;

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
                            break;
                        case 4:

                            Jogo jogo = new Jogo();

                            jogo.setId(contId + 1);
                            contId = contId + 1;

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

                            break;
                        case 5:
                            Livro livro = new Livro();

                            livro.setId(contId + 1);
                            contId = contId + 1;

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
                            break;
                        default:
                            System.out.println("Operação Inválida!");
                    }
                    break;
                case 2: //Menu 2 - Editar produto cadastrado

                    System.out.println("Trabalhamos com várias categorias de produtos:");
                    System.out.println("Qual categoria de produto deseja remover?");
                    System.out.println("1 - Albuns De Musica");
                    System.out.println("2 - Brinquedos");
                    System.out.println("3 - Filme");
                    System.out.println("4 - Jogo");
                    System.out.println("5 - Livro");
                    System.out.println("Digite a opção:");
                    opcaoCategoria = scanner.nextInt();

                    String nomeProdutoAlterar;
                    Double valorAtualizado;

                    switch (opcaoCategoria) {
                        case 1:

                            //Imprimindo a lista atual antes da alteração
                            System.out.println("Lista de Albuns de Música disponíveis em estoque");
                            for (AlbumDeMusica objetoListaAlbumDeMusica : listaAlbunsDeMusica) {
                                System.out.println("Id: " + objetoListaAlbumDeMusica.getId());
                                System.out.println("Nome: " + objetoListaAlbumDeMusica.getNome());
                                System.out.println("Preço: " + objetoListaAlbumDeMusica.getPreco());
                                System.out.println("Músicos da Banda: " + objetoListaAlbumDeMusica.getMusicosBanda());
                                System.out.println("Gênero: " + objetoListaAlbumDeMusica.getGenero());
                                System.out.println("Selo: " + objetoListaAlbumDeMusica.getSelo());
                                System.out.println();
                            }

                            System.out.println("Digite o nome do Álbum de Músicas que deseja alterar dados:");
                            scanner.nextLine();
                            nomeProdutoAlterar = scanner.nextLine();
                            System.out.println("Digite o valor preço que substituirá o atual:");
                            valorAtualizado = scanner.nextDouble();

                            for (AlbumDeMusica objetoListaAlbumDeMusica: listaAlbunsDeMusica) {
                                if (nomeProdutoAlterar.equals(objetoListaAlbumDeMusica.getNome())) {
                                    objetoListaAlbumDeMusica.setPreco(valorAtualizado);//alterado preço do produto
                                    System.out.println(objetoListaAlbumDeMusica.getPreco());
                                }
                            }
                            //Reimprimir só para conferir que foi alterado
                            System.out.println("Reimpressão de Lista de Álbum de Música em estoque");
                            for (AlbumDeMusica objetoListaAlbumDeMusica : listaAlbunsDeMusica) {
                                System.out.println("Id: " + objetoListaAlbumDeMusica.getId());
                                System.out.println("Nome: " + objetoListaAlbumDeMusica.getNome());
                                System.out.println("Preço: " + objetoListaAlbumDeMusica.getPreco());
                                System.out.println("Músicos da Banda: " + objetoListaAlbumDeMusica.getMusicosBanda());
                                System.out.println("Gênero: " + objetoListaAlbumDeMusica.getGenero());
                                System.out.println("Selo: " + objetoListaAlbumDeMusica.getSelo());
                                System.out.println();
                            }

                            System.out.println("Dado do Produto alterado com sucesso!");
                            break;
                        case 2:
                            //Imprimindo a lista atual antes da alteração
                            System.out.println("Lista de Brinquedos disponíveis em estoque");
                            for (Brinquedo objetoListaBrinquedo : listaBrinquedos) {
                                System.out.println("Id: " + objetoListaBrinquedo.getId());
                                System.out.println("Nome: " + objetoListaBrinquedo.getNome());
                                System.out.println("Preço: " + objetoListaBrinquedo.getPreco());
                                System.out.println("Tipo: " + objetoListaBrinquedo.getTipo());
                                System.out.println();
                            }

                            System.out.println("Digite o nome do Brinquedo que deseja alterar dados:");
                            scanner.nextLine();
                            nomeProdutoAlterar = scanner.nextLine();
                            System.out.println("Digite o valor preço que substituirá o atual:");
                            valorAtualizado = scanner.nextDouble();

                            for (Brinquedo objetoListaBrinquedo: listaBrinquedos) {
                                if (nomeProdutoAlterar.equals(objetoListaBrinquedo.getNome())) {
                                    objetoListaBrinquedo.setPreco(valorAtualizado);//alterado preço do produto
                                    System.out.println(objetoListaBrinquedo.getPreco());
                                }
                            }
                            //Reimprimir só para conferir que foi alterado
                            System.out.println("Reimpressão de Lista de Brinquedos em estoque");
                            for (Brinquedo objetoListaBrinquedo : listaBrinquedos) {
                                System.out.println("Id: " + objetoListaBrinquedo.getId());
                                System.out.println("Nome: " + objetoListaBrinquedo.getNome());
                                System.out.println("Preço: " + objetoListaBrinquedo.getPreco());
                                System.out.println("Tipo: " + objetoListaBrinquedo.getTipo());
                                System.out.println();
                            }

                            System.out.println("Dado do Produto alterado com sucesso!");
                            break;
                        case 3:
                            //Imprimindo a lista atual antes da alteração
                            System.out.println("Lista de Filmes disponíveis em estoque");
                            for (Filme objetoListaFilme : listaFilmes) {
                                System.out.println("Id: " + objetoListaFilme.getId());
                                System.out.println("Nome: " + objetoListaFilme.getNome());
                                System.out.println("Preço: " + objetoListaFilme.getPreco());
                                System.out.println("Estudio: " + objetoListaFilme.getEstudio());
                                System.out.println("Diretor: " + objetoListaFilme.getDiretor());
                                System.out.println("Gênero: " + objetoListaFilme.getGenero());
                                System.out.println("Produtor: " + objetoListaFilme.getProdutor());
                                System.out.println();
                            }

                            System.out.println("Digite o nome do Filme que deseja alterar dados:");
                            scanner.nextLine();
                            nomeProdutoAlterar = scanner.nextLine();
                            System.out.println("Digite o valor preço que substituirá o atual:");
                            valorAtualizado = scanner.nextDouble();

                            for (Filme objetoListaFilme: listaFilmes) {
                                if (nomeProdutoAlterar.equals(objetoListaFilme.getNome())) {
                                    objetoListaFilme.setPreco(valorAtualizado);//alterado preço do produto
                                    System.out.println(objetoListaFilme.getPreco());
                                }
                            }

                            //Reimprimir só para conferir que foi alterado
                            System.out.println("Reimpressão de Lista de Filmes em estoque");
                            for (Filme objetoListaFilme : listaFilmes) {
                                System.out.println("Id: " + objetoListaFilme.getId());
                                System.out.println("Nome: " + objetoListaFilme.getNome());
                                System.out.println("Preço: " + objetoListaFilme.getPreco());
                                System.out.println("Estudio: " + objetoListaFilme.getEstudio());
                                System.out.println("Diretor: " + objetoListaFilme.getDiretor());
                                System.out.println("Gênero: " + objetoListaFilme.getGenero());
                                System.out.println("Produtor: " + objetoListaFilme.getProdutor());
                                System.out.println();
                            }

                            System.out.println("Dado do Produto alterado com sucesso!");
                            break;
                        case 4:

                            //Imprimindo a lista atual antes da alteração
                            System.out.println("Lista de Jogos disponíveis em estoque");
                            for (Jogo objetoListaJogo : listaJogos) {
                                System.out.println("Id: " + objetoListaJogo.getId());
                                System.out.println("Nome: " + objetoListaJogo.getNome());
                                System.out.println("Preço: " + objetoListaJogo.getPreco());
                                System.out.println("Distribuidora: " + objetoListaJogo.getDistribuidora());
                                System.out.println("Gênero: " + objetoListaJogo.getGenero());
                                System.out.println("Estudio: " + objetoListaJogo.getEstudio());
                                System.out.println();
                            }

                            System.out.println("Digite o nome do Jogo que deseja alterar dados:");
                            scanner.nextLine();
                            nomeProdutoAlterar = scanner.nextLine();
                            System.out.println("Digite o valor preço que substituirá o atual:");
                            valorAtualizado = scanner.nextDouble();

                            for (Jogo objetoListaJogo: listaJogos) {
                                if (nomeProdutoAlterar.equals(objetoListaJogo.getNome())) {
                                    objetoListaJogo.setPreco(valorAtualizado);//alterado preço do produto
                                    System.out.println(objetoListaJogo.getPreco());
                                }
                            }

                            //Reimprimir só para conferir que foi alterado
                            System.out.println("Reimpressão de Lista de Jogos em estoque");
                            for (Jogo objetoListaJogo : listaJogos) {
                                System.out.println("Id: " + objetoListaJogo.getId());
                                System.out.println("Nome: " + objetoListaJogo.getNome());
                                System.out.println("Preço: " + objetoListaJogo.getPreco());
                                System.out.println("Distribuidora: " + objetoListaJogo.getDistribuidora());
                                System.out.println("Gênero: " + objetoListaJogo.getGenero());
                                System.out.println("Estudio: " + objetoListaJogo.getEstudio());
                                System.out.println();
                            }

                            System.out.println("Dado do Produto alterado com sucesso!");

                            break;
                        case 5:

                            //Imprimindo a lista atual antes da alteração
                            System.out.println("Lista de Livros disponíveis em estoque");
                            for (Livro objetoListaLivro : listaLivros) {
                                System.out.println("Id: " + objetoListaLivro.getId());
                                System.out.println("Nome: " + objetoListaLivro.getNome());
                                System.out.println("Preço: " + objetoListaLivro.getPreco());
                                System.out.println("Gênero: " + objetoListaLivro.getGenero());
                                System.out.println("Escritor: " + objetoListaLivro.getEscritor());
                                System.out.println("Editora: " + objetoListaLivro.getEditora());
                                System.out.println();
                            }

                            System.out.println("Digite o nome do Livro que deseja alterar dados:");
                            scanner.nextLine();
                            nomeProdutoAlterar = scanner.nextLine();
                            System.out.println("Digite o valor preço que substituirá o atual:");
                            valorAtualizado = scanner.nextDouble();

                            for (Livro objetoListaLivro: listaLivros) {
                                if (nomeProdutoAlterar.equals(objetoListaLivro.getNome())) {
                                    objetoListaLivro.setPreco(valorAtualizado);//alterado preço do produto
                                    System.out.println(objetoListaLivro.getPreco());
                                }
                            }

                            //Reimprimir só para conferir que foi alterado
                            System.out.println("Reimpressão de Lista de Livros em estoque");
                            for (Livro objetoListaLivro : listaLivros) {
                                System.out.println("Id: " + objetoListaLivro.getId());
                                System.out.println("Nome: " + objetoListaLivro.getNome());
                                System.out.println("Preço: " + objetoListaLivro.getPreco());
                                System.out.println("Gênero: " + objetoListaLivro.getGenero());
                                System.out.println("Escritor: " + objetoListaLivro.getEscritor());
                                System.out.println("Editora: " + objetoListaLivro.getEditora());
                                System.out.println();
                            }

                            System.out.println("Dado do Produto alterado com sucesso!");
                            break;
                        default:
                            System.out.println("Operação Inválida!");
                    }

                    break;
                case 3: // Menu 3 - Remover produto cadastrado
                    System.out.println("Trabalhamos com várias categorias de produtos:");
                    System.out.println("Qual categoria de produto deseja remover?");
                    System.out.println("1 - Albuns De Musica");
                    System.out.println("2 - Brinquedos");
                    System.out.println("3 - Filme");
                    System.out.println("4 - Jogo");
                    System.out.println("5 - Livro");
                    System.out.println("Digite a opção:");
                    opcaoCategoria = scanner.nextInt();

                    String nomeProdutoRemover;

                    switch (opcaoCategoria) {
                        case 1:

                            //Imprimindo a lista atual antes da remoção (o que há no estoque)
                            System.out.println("Lista de Albuns de Música disponíveis em estoque");
                            for (AlbumDeMusica objetoListaAlbumDeMusica : listaAlbunsDeMusica) {
                                System.out.println("Id: " + objetoListaAlbumDeMusica.getId());
                                System.out.println("Nome: " + objetoListaAlbumDeMusica.getNome());
                                System.out.println("Preço: " + objetoListaAlbumDeMusica.getPreco());
                                System.out.println("Músicos da Banda: " + objetoListaAlbumDeMusica.getMusicosBanda());
                                System.out.println("Gênero: " + objetoListaAlbumDeMusica.getGenero());
                                System.out.println("Selo: " + objetoListaAlbumDeMusica.getSelo());
                                System.out.println();
                            }

                            System.out.println("Digite o nome do Álbum de Músicas que deseja remover:");
                            scanner.nextLine();
                            nomeProdutoRemover = scanner.nextLine();

                            for (AlbumDeMusica objetoListaAlbumDeMusica: listaAlbunsDeMusica) {
                                if (nomeProdutoRemover.equals(objetoListaAlbumDeMusica.getNome())) {
                                    listaAlbunsDeMusica.remove(objetoListaAlbumDeMusica);//retirado do estoque
                                }
                            }
                            //Reimprimir só para conferir que foi retirado
                            System.out.println("Reimpressão de Lista de Álbum de Música em estoque");
                            for (AlbumDeMusica objetoListaAlbumDeMusica : listaAlbunsDeMusica) {
                                System.out.println("Id: " + objetoListaAlbumDeMusica.getId());
                                System.out.println("Nome: " + objetoListaAlbumDeMusica.getNome());
                                System.out.println("Preço: " + objetoListaAlbumDeMusica.getPreco());
                                System.out.println("Músicos da Banda: " + objetoListaAlbumDeMusica.getMusicosBanda());
                                System.out.println("Gênero: " + objetoListaAlbumDeMusica.getGenero());
                                System.out.println("Selo: " + objetoListaAlbumDeMusica.getSelo());
                                System.out.println();
                            }

                            System.out.println("Produto removido com sucesso!");
                            break;
                        case 2:
                            //Imprimindo a lista atual antes da remoção (o que há no estoque)
                            System.out.println("Lista de Brinquedos disponíveis em estoque");
                            for (Brinquedo objetoListaBrinquedo : listaBrinquedos) {
                                System.out.println("Id: " + objetoListaBrinquedo.getId());
                                System.out.println("Nome: " + objetoListaBrinquedo.getNome());
                                System.out.println("Preço: " + objetoListaBrinquedo.getPreco());
                                System.out.println("Tipo: " + objetoListaBrinquedo.getTipo());
                                System.out.println();
                            }

                            System.out.println("Digite o nome do Brinquedo que deseja remover:");
                            scanner.nextLine();
                            nomeProdutoRemover = scanner.nextLine();

                            for (Brinquedo objetoListaBrinquedo: listaBrinquedos) {
                                if (nomeProdutoRemover.equals(objetoListaBrinquedo.getNome())) {
                                    listaBrinquedos.remove(objetoListaBrinquedo);//retirado do estoque
                                }
                            }
                            //Reimprimir só para conferir que foi retirado
                            System.out.println("Reimpressão de Lista de Brinquedos em estoque");
                            for (Brinquedo objetoListaBrinquedo : listaBrinquedos) {
                                System.out.println("Id: " + objetoListaBrinquedo.getId());
                                System.out.println("Nome: " + objetoListaBrinquedo.getNome());
                                System.out.println("Preço: " + objetoListaBrinquedo.getPreco());
                                System.out.println("Tipo: " + objetoListaBrinquedo.getTipo());
                                System.out.println();
                            }

                            System.out.println("Produto removido com sucesso!");
                            break;
                        case 3:
                            //Imprimindo a lista atual antes da remoção (o que há no estoque)
                            System.out.println("Lista de Filmes disponíveis em estoque");
                            for (Filme objetoListaFilme : listaFilmes) {
                                System.out.println("Id: " + objetoListaFilme.getId());
                                System.out.println("Nome: " + objetoListaFilme.getNome());
                                System.out.println("Preço: " + objetoListaFilme.getPreco());
                                System.out.println("Estudio: " + objetoListaFilme.getEstudio());
                                System.out.println("Diretor: " + objetoListaFilme.getDiretor());
                                System.out.println("Gênero: " + objetoListaFilme.getGenero());
                                System.out.println("Produtor: " + objetoListaFilme.getProdutor());
                                System.out.println();
                            }

                            System.out.println("Digite o nome do Filme que deseja remover:");
                            scanner.nextLine();
                            nomeProdutoRemover = scanner.nextLine();

                            for (Filme objetoListaFilme: listaFilmes) {
                                if (nomeProdutoRemover.equals(objetoListaFilme.getNome())) {
                                    listaFilmes.remove(objetoListaFilme);//retirado do estoque
                                }
                            }
                            //Reimprimir só para conferir que foi retirado
                            System.out.println("Reimpressão de Lista de Filmes em estoque");
                            for (Filme objetoListaFilme : listaFilmes) {
                                System.out.println("Id: " + objetoListaFilme.getId());
                                System.out.println("Nome: " + objetoListaFilme.getNome());
                                System.out.println("Preço: " + objetoListaFilme.getPreco());
                                System.out.println("Estudio: " + objetoListaFilme.getEstudio());
                                System.out.println("Diretor: " + objetoListaFilme.getDiretor());
                                System.out.println("Gênero: " + objetoListaFilme.getGenero());
                                System.out.println("Produtor: " + objetoListaFilme.getProdutor());
                                System.out.println();
                            }

                            System.out.println("Produto removido com sucesso!");
                            break;
                        case 4:

                            //Imprimindo a lista atual antes da remoção (o que há no estoque)
                            System.out.println("Lista de Jogos disponíveis em estoque");
                            for (Jogo objetoListaJogo : listaJogos) {
                                System.out.println("Id: " + objetoListaJogo.getId());
                                System.out.println("Nome: " + objetoListaJogo.getNome());
                                System.out.println("Preço: " + objetoListaJogo.getPreco());
                                System.out.println("Distribuidora: " + objetoListaJogo.getDistribuidora());
                                System.out.println("Gênero: " + objetoListaJogo.getGenero());
                                System.out.println("Estudio: " + objetoListaJogo.getEstudio());
                                System.out.println();
                            }

                            System.out.println("Digite o nome do Jogo que deseja remover:");
                            scanner.nextLine();
                            nomeProdutoRemover = scanner.nextLine();

                            for (Jogo objetoListaJogo: listaJogos) {
                                if (nomeProdutoRemover.equals(objetoListaJogo.getNome())) {
                                    listaJogos.remove(objetoListaJogo);//retirado do estoque
                                }
                            }
                            //Reimprimir só para conferir que foi retirado
                            System.out.println("Reimpressão de Lista de Jogos em estoque");
                            for (Jogo objetoListaJogo : listaJogos) {
                                System.out.println("Id: " + objetoListaJogo.getId());
                                System.out.println("Nome: " + objetoListaJogo.getNome());
                                System.out.println("Preço: " + objetoListaJogo.getPreco());
                                System.out.println("Distribuidora: " + objetoListaJogo.getDistribuidora());
                                System.out.println("Gênero: " + objetoListaJogo.getGenero());
                                System.out.println("Estudio: " + objetoListaJogo.getEstudio());
                                System.out.println();
                            }

                            System.out.println("Produto removido com sucesso!");

                            break;
                        case 5:

                            //Imprimindo a lista atual antes da remoção (o que há no estoque)
                            System.out.println("Lista de Livros disponíveis em estoque");
                            for (Livro objetoListaLivro : listaLivros) {
                                System.out.println("Id: " + objetoListaLivro.getId());
                                System.out.println("Nome: " + objetoListaLivro.getNome());
                                System.out.println("Preço: " + objetoListaLivro.getPreco());
                                System.out.println("Gênero: " + objetoListaLivro.getGenero());
                                System.out.println("Escritor: " + objetoListaLivro.getEscritor());
                                System.out.println("Editora: " + objetoListaLivro.getEditora());
                                System.out.println();
                            }

                            System.out.println("Digite o nome do Livro que deseja remover:");
                            scanner.nextLine();
                            nomeProdutoRemover = scanner.nextLine();

                            for (Livro objetoListaLivro: listaLivros) {
                                if (nomeProdutoRemover.equals(objetoListaLivro.getNome())) {
                                    listaLivros.remove(objetoListaLivro);//retirado do estoque
                                }
                            }
                            //Reimprimir só para conferir que foi retirado
                            System.out.println("Reimpressão de Lista de Livros em estoque");
                            for (Livro objetoListaLivro : listaLivros) {
                                System.out.println("Id: " + objetoListaLivro.getId());
                                System.out.println("Nome: " + objetoListaLivro.getNome());
                                System.out.println("Preço: " + objetoListaLivro.getPreco());
                                System.out.println("Gênero: " + objetoListaLivro.getGenero());
                                System.out.println("Escritor: " + objetoListaLivro.getEscritor());
                                System.out.println("Editora: " + objetoListaLivro.getEditora());
                                System.out.println();
                            }

                            System.out.println("Produto removido com sucesso!");
                            break;
                        default:
                            System.out.println("Operação Inválida!");
                    }
                    break;
                case 4: // Menu 4 - Visualizar produtos cadastrados
                    System.out.println("Trabalhamos com várias categorias de produtos:");
                    System.out.println("Qual categoria de produto deseja visualizar os itens?");
                    System.out.println("1 - Albuns De Musica");
                    System.out.println("2 - Brinquedos");
                    System.out.println("3 - Filme");
                    System.out.println("4 - Jogo");
                    System.out.println("5 - Livro");
                    System.out.println("Digite a opção:");
                    opcaoCategoria = scanner.nextInt();

                    switch (opcaoCategoria) {
                        case 1:
                            System.out.println("Lista de Albuns de Música");
                            for (AlbumDeMusica objetoListaAlbumDeMusica : listaAlbunsDeMusica) {
                                System.out.println("Id: " + objetoListaAlbumDeMusica.getId());
                                System.out.println("Nome: " + objetoListaAlbumDeMusica.getNome());
                                System.out.println("Preço: " + objetoListaAlbumDeMusica.getPreco());
                                System.out.println("Músicos da Banda: " + objetoListaAlbumDeMusica.getMusicosBanda());
                                System.out.println("Gênero: " + objetoListaAlbumDeMusica.getGenero());
                                System.out.println("Selo: " + objetoListaAlbumDeMusica.getSelo());
                                System.out.println();
                            }
                            break;
                        case 2:
                            System.out.println("Lista de Brinquedos");
                            for (Brinquedo objetoListaBrinquedo : listaBrinquedos) {
                                System.out.println("Id: " + objetoListaBrinquedo.getId());
                                System.out.println("Nome: " + objetoListaBrinquedo.getNome());
                                System.out.println("Preço: " + objetoListaBrinquedo.getPreco());
                                System.out.println("Tipo: " + objetoListaBrinquedo.getTipo());
                                System.out.println();
                            }
                            break;
                        case 3:
                            System.out.println("Lista de Filmes");
                            for (Filme objetoListaFilme : listaFilmes) {
                                System.out.println("Id: " + objetoListaFilme.getId());
                                System.out.println("Nome: " + objetoListaFilme.getNome());
                                System.out.println("Preço: " + objetoListaFilme.getPreco());
                                System.out.println("Estudio: " + objetoListaFilme.getEstudio());
                                System.out.println("Diretor: " + objetoListaFilme.getDiretor());
                                System.out.println("Gênero: " + objetoListaFilme.getGenero());
                                System.out.println("Produtor: " + objetoListaFilme.getProdutor());
                                System.out.println();
                            }
                            break;
                        case 4:
                            System.out.println("Lista de Jogos");

                            for (Jogo objetoListaJogo : listaJogos) {
                                System.out.println("Id: " + objetoListaJogo.getId());
                                System.out.println("Nome: " + objetoListaJogo.getNome());
                                System.out.println("Preço: " + objetoListaJogo.getPreco());
                                System.out.println("Distribuidora: " + objetoListaJogo.getDistribuidora());
                                System.out.println("Gênero: " + objetoListaJogo.getGenero());
                                System.out.println("Estudio: " + objetoListaJogo.getEstudio());
                                System.out.println();
                            }

                            break;
                        case 5:
                            System.out.println("Lista de Livros");
                            for (Livro objetoListaLivro : listaLivros) {
                                System.out.println("Id: " + objetoListaLivro.getId());
                                System.out.println("Nome: " + objetoListaLivro.getNome());
                                System.out.println("Preço: " + objetoListaLivro.getPreco());
                                System.out.println("Gênero: " + objetoListaLivro.getGenero());
                                System.out.println("Escritor: " + objetoListaLivro.getEscritor());
                                System.out.println("Editora: " + objetoListaLivro.getEditora());
                                System.out.println();
                            }

                            break;
                        default:
                            System.out.println("Operação Inválida!");
                    }
                    break;
                case 5: // Menu 5 - Visualizar o quantitativo de produtos em estoque (por categoria)
                    System.out.println("Trabalhamos com várias categorias de produtos:");
                    System.out.println("Qual categoria de produto deseja visualizar o quantitativo?");
                    System.out.println("1 - Albuns De Musica");
                    System.out.println("2 - Brinquedos");
                    System.out.println("3 - Filme");
                    System.out.println("4 - Jogo");
                    System.out.println("5 - Livro");
                    System.out.println("Digite a opção:");
                    opcaoCategoria = scanner.nextInt();

                    switch (opcaoCategoria) {
                        case 1:
                            int quantitativoItensAlbumDeMusica;
                            quantitativoItensAlbumDeMusica = listaAlbunsDeMusica.size();
                            System.out.println("O quantitativo de produtos do categoria Albuns de Música é " + quantitativoItensAlbumDeMusica);
                            break;
                        case 2:
                            int quantitativoItensBrinquedo;
                            quantitativoItensBrinquedo = listaBrinquedos.size();
                            System.out.println("O quantitativo de produtos da categoria Brinquedo é " + quantitativoItensBrinquedo);
                            break;
                        case 3:
                            int quantitativoItensFilme;
                            quantitativoItensFilme = listaFilmes.size();
                            System.out.println("O quantitativo de produtos da categoria Filme é " + quantitativoItensFilme);
                            break;
                        case 4:
                            int quantitativoItensJogo;
                            quantitativoItensJogo = listaJogos.size();
                            System.out.println("O quantitativo de produtos da categoria Jogo é " + quantitativoItensJogo);
                            break;
                        case 5:
                            int quantitativoItensLivro;
                            quantitativoItensLivro = listaLivros.size();
                            System.out.println("O quantitativo de produtos da categoria Livro é " + quantitativoItensLivro);
                            break;
                        default:
                            System.out.println("Operação Inválida!");
                    }
                    break;
                case 6: // Menu 6 - Visualizar listagem completa de produtos em estoque (geral)
                    System.out.println("-----> Lista completa de produtos em estoque (geral) <-----");

                    for (AlbumDeMusica objetoListaAlbumDeMusica : listaAlbunsDeMusica) {
                        System.out.println("Id: " + objetoListaAlbumDeMusica.getId());
                        System.out.println("Nome: " + objetoListaAlbumDeMusica.getNome());
                        System.out.println("Preço: " + objetoListaAlbumDeMusica.getPreco());
                        System.out.println("Músicos da Banda: " + objetoListaAlbumDeMusica.getMusicosBanda());
                        System.out.println("Gênero: " + objetoListaAlbumDeMusica.getGenero());
                        System.out.println("Selo: " + objetoListaAlbumDeMusica.getSelo());
                        System.out.println();
                    }

                    for (Brinquedo objetoListaBrinquedo : listaBrinquedos) {
                        System.out.println("Id: " + objetoListaBrinquedo.getId());
                        System.out.println("Nome: " + objetoListaBrinquedo.getNome());
                        System.out.println("Preço: " + objetoListaBrinquedo.getPreco());
                        System.out.println("Tipo: " + objetoListaBrinquedo.getTipo());
                        System.out.println();
                    }

                    for (Filme objetoListaFilme : listaFilmes) {
                        System.out.println("Id: " + objetoListaFilme.getId());
                        System.out.println("Nome: " + objetoListaFilme.getNome());
                        System.out.println("Preço: " + objetoListaFilme.getPreco());
                        System.out.println("Estudio: " + objetoListaFilme.getEstudio());
                        System.out.println("Diretor: " + objetoListaFilme.getDiretor());
                        System.out.println("Gênero: " + objetoListaFilme.getGenero());
                        System.out.println("Produtor: " + objetoListaFilme.getProdutor());
                        System.out.println();
                    }

                    for (Jogo objetoListaJogo : listaJogos) {
                        System.out.println("Id: " + objetoListaJogo.getId());
                        System.out.println("Nome: " + objetoListaJogo.getNome());
                        System.out.println("Preço: " + objetoListaJogo.getPreco());
                        System.out.println("Distribuidora: " + objetoListaJogo.getDistribuidora());
                        System.out.println("Gênero: " + objetoListaJogo.getGenero());
                        System.out.println("Estudio: " + objetoListaJogo.getEstudio());
                        System.out.println();
                    }

                    for (Livro objetoListaLivro : listaLivros) {
                        System.out.println("Id: " + objetoListaLivro.getId());
                        System.out.println("Nome: " + objetoListaLivro.getNome());
                        System.out.println("Preço: " + objetoListaLivro.getPreco());
                        System.out.println("Gênero: " + objetoListaLivro.getGenero());
                        System.out.println("Escritor: " + objetoListaLivro.getEscritor());
                        System.out.println("Editora: " + objetoListaLivro.getEditora());
                        System.out.println();
                    }

                    break;
                case 7: // Menu 7 - Visualizar listagem de produtos em estoque (por categoria)
                    System.out.println("-----> Lista completa de produtos em estoque (por categoria) <-----");

                    System.out.println("Lista de Albuns de Música <-----");
                    for (AlbumDeMusica objetoListaAlbumDeMusica : listaAlbunsDeMusica) {
                        System.out.println("Id: " + objetoListaAlbumDeMusica.getId());
                        System.out.println("Nome: " + objetoListaAlbumDeMusica.getNome());
                        System.out.println("Preço: " + objetoListaAlbumDeMusica.getPreco());
                        System.out.println("Músicos da Banda: " + objetoListaAlbumDeMusica.getMusicosBanda());
                        System.out.println("Gênero: " + objetoListaAlbumDeMusica.getGenero());
                        System.out.println("Selo: " + objetoListaAlbumDeMusica.getSelo());
                        System.out.println();
                    }

                    System.out.println("-----> Lista de Brinquedos <-----");
                    for (Brinquedo objetoListaBrinquedo : listaBrinquedos) {
                        System.out.println("Id: " + objetoListaBrinquedo.getId());
                        System.out.println("Nome: " + objetoListaBrinquedo.getNome());
                        System.out.println("Preço: " + objetoListaBrinquedo.getPreco());
                        System.out.println("Tipo: " + objetoListaBrinquedo.getTipo());
                        System.out.println();
                    }

                    System.out.println("-----> Lista de Filmes <-----");
                    for (Filme objetoListaFilme : listaFilmes) {
                        System.out.println("Id: " + objetoListaFilme.getId());
                        System.out.println("Nome: " + objetoListaFilme.getNome());
                        System.out.println("Preço: " + objetoListaFilme.getPreco());
                        System.out.println("Estudio: " + objetoListaFilme.getEstudio());
                        System.out.println("Diretor: " + objetoListaFilme.getDiretor());
                        System.out.println("Gênero: " + objetoListaFilme.getGenero());
                        System.out.println("Produtor: " + objetoListaFilme.getProdutor());
                        System.out.println();
                    }

                    System.out.println("-----> Lista de Jogos <-----");

                    for (Jogo objetoListaJogo : listaJogos) {
                        System.out.println("Id: " + objetoListaJogo.getId());
                        System.out.println("Nome: " + objetoListaJogo.getNome());
                        System.out.println("Preço: " + objetoListaJogo.getPreco());
                        System.out.println("Distribuidora: " + objetoListaJogo.getDistribuidora());
                        System.out.println("Gênero: " + objetoListaJogo.getGenero());
                        System.out.println("Estudio: " + objetoListaJogo.getEstudio());
                        System.out.println();
                    }

                    System.out.println("-----> Lista de Livros <-----");
                    for (Livro objetoListaLivro : listaLivros) {
                        System.out.println("Id: " + objetoListaLivro.getId());
                        System.out.println("Nome: " + objetoListaLivro.getNome());
                        System.out.println("Preço: " + objetoListaLivro.getPreco());
                        System.out.println("Gênero: " + objetoListaLivro.getGenero());
                        System.out.println("Escritor: " + objetoListaLivro.getEscritor());
                        System.out.println("Editora: " + objetoListaLivro.getEditora());
                        System.out.println();
                    }

                    break;
                case 8: // Menu 8 - Realizar compra
                    System.out.println("Trabalhamos com várias categorias de produtos:");
                    System.out.println("Qual categoria de produto deseja visualizar para realizar a compra?");
                    System.out.println("1 - Albuns De Musica");
                    System.out.println("2 - Brinquedos");
                    System.out.println("3 - Filme");
                    System.out.println("4 - Jogo");
                    System.out.println("5 - Livro");
                    System.out.println("Digite a opção:");
                    opcaoCategoria = scanner.nextInt();

                    String nomeProdutoCompra;

                    switch (opcaoCategoria) {
                        case 1:
                            System.out.println("Lista de Albuns de Música disponíveis em estoque");
                            for (AlbumDeMusica objetoListaAlbumDeMusica : listaAlbunsDeMusica) {
                                System.out.println("Id: " + objetoListaAlbumDeMusica.getId());
                                System.out.println("Nome: " + objetoListaAlbumDeMusica.getNome());
                                System.out.println("Preço: " + objetoListaAlbumDeMusica.getPreco());
                                System.out.println("Músicos da Banda: " + objetoListaAlbumDeMusica.getMusicosBanda());
                                System.out.println("Gênero: " + objetoListaAlbumDeMusica.getGenero());
                                System.out.println("Selo: " + objetoListaAlbumDeMusica.getSelo());
                                System.out.println();
                            }
                            System.out.println("Digite o nome do Álbum de Músicas que deseja comprar:");
                            scanner.nextLine();
                            nomeProdutoCompra = scanner.nextLine();

                            for (AlbumDeMusica objetoListaAlbumDeMusica: listaAlbunsDeMusica) {
                                if (nomeProdutoCompra.equals(objetoListaAlbumDeMusica.getNome())) {
                                    listaAlbunsDeMusica.remove(objetoListaAlbumDeMusica);//retirado do estoque
                                    dinheiroEmCaixaDaEmpresa = dinheiroEmCaixaDaEmpresa + objetoListaAlbumDeMusica.getPreco(); //valor pago adicionado ao caixa da empresa
                                }
                            }

                            System.out.println("Compra realizada com sucesso!");
                            System.out.println("Dinheiro em caixa atualizado " + dinheiroEmCaixaDaEmpresa);
                            System.out.println("Reimpressão de Lista de Álbum de Música em estoque");
                            for (AlbumDeMusica objetoListaAlbumDeMusica : listaAlbunsDeMusica) {
                                System.out.println("Id: " + objetoListaAlbumDeMusica.getId());
                                System.out.println("Nome: " + objetoListaAlbumDeMusica.getNome());
                                System.out.println("Preço: " + objetoListaAlbumDeMusica.getPreco());
                                System.out.println("Músicos da Banda: " + objetoListaAlbumDeMusica.getMusicosBanda());
                                System.out.println("Gênero: " + objetoListaAlbumDeMusica.getGenero());
                                System.out.println("Selo: " + objetoListaAlbumDeMusica.getSelo());
                                System.out.println();
                            }
                            break;
                        case 2:
                            System.out.println("Lista de Brinquedos disponíveis em estoque");
                            for (Brinquedo objetoListaBrinquedo : listaBrinquedos) {
                                System.out.println("Id: " + objetoListaBrinquedo.getId());
                                System.out.println("Nome: " + objetoListaBrinquedo.getNome());
                                System.out.println("Preço: " + objetoListaBrinquedo.getPreco());
                                System.out.println("Tipo: " + objetoListaBrinquedo.getTipo());
                                System.out.println();
                            }
                            System.out.println("Digite o nome do brinquedo que deseja comprar:");
                            scanner.nextLine();
                            nomeProdutoCompra = scanner.nextLine();

                            for (Brinquedo objetoListaBrinquedo: listaBrinquedos) {
                                if (nomeProdutoCompra.equals(objetoListaBrinquedo.getNome())) {
                                    listaBrinquedos.remove(objetoListaBrinquedo);//retirado do estoque
                                    dinheiroEmCaixaDaEmpresa = dinheiroEmCaixaDaEmpresa + objetoListaBrinquedo.getPreco();//valor pago adicionado ao caixa da empresa
                                }
                            }

                            System.out.println("Compra realizada com sucesso!");
                            System.out.println("Dinheiro em caixa atualizado " + dinheiroEmCaixaDaEmpresa);
                            System.out.println("Reimpressão de Lista de Brinquedos em estoque");
                            for (Brinquedo objetoListaBrinquedo : listaBrinquedos) {
                                System.out.println("Id: " + objetoListaBrinquedo.getId());
                                System.out.println("Nome: " + objetoListaBrinquedo.getNome());
                                System.out.println("Preço: " + objetoListaBrinquedo.getPreco());
                                System.out.println("Tipo: " + objetoListaBrinquedo.getTipo());
                                System.out.println();
                            }
                            break;
                        case 3:
                            System.out.println("Lista de Filmes disponíveis em estoque");
                            for (Filme objetoListaFilme : listaFilmes) {
                                System.out.println("Id: " + objetoListaFilme.getId());
                                System.out.println("Nome: " + objetoListaFilme.getNome());
                                System.out.println("Preço: " + objetoListaFilme.getPreco());
                                System.out.println("Estudio: " + objetoListaFilme.getEstudio());
                                System.out.println("Diretor: " + objetoListaFilme.getDiretor());
                                System.out.println("Gênero: " + objetoListaFilme.getGenero());
                                System.out.println("Produtor: " + objetoListaFilme.getProdutor());
                                System.out.println();
                            }
                            System.out.println("Digite o nome do filme que deseja comprar:");
                            scanner.nextLine();
                            nomeProdutoCompra = scanner.nextLine();

                            for (Filme objetoListaFilme: listaFilmes) {
                                if (nomeProdutoCompra.equals(objetoListaFilme.getNome())) {
                                    listaFilmes.remove(objetoListaFilme);//retirado do estoque
                                    dinheiroEmCaixaDaEmpresa = dinheiroEmCaixaDaEmpresa + objetoListaFilme.getPreco();//valor pago adicionado ao caixa da empresa
                                }
                            }

                            System.out.println("Compra realizada com sucesso!");
                            System.out.println("Dinheiro em caixa atualizado " + dinheiroEmCaixaDaEmpresa);
                            System.out.println("Reimpressão de Lista de Filmes em estoque");
                            for (Filme objetoListaFilme : listaFilmes) {
                                System.out.println("Id: " + objetoListaFilme.getId());
                                System.out.println("Nome: " + objetoListaFilme.getNome());
                                System.out.println("Preço: " + objetoListaFilme.getPreco());
                                System.out.println("Estudio: " + objetoListaFilme.getEstudio());
                                System.out.println("Diretor: " + objetoListaFilme.getDiretor());
                                System.out.println("Gênero: " + objetoListaFilme.getGenero());
                                System.out.println("Produtor: " + objetoListaFilme.getProdutor());
                                System.out.println();
                            }
                            break;
                        case 4:

                            System.out.println("Lista de Jogos disponíveis em estoque");

                            for (Jogo objetoListaJogo : listaJogos) {
                                System.out.println("Id: " + objetoListaJogo.getId());
                                System.out.println("Nome: " + objetoListaJogo.getNome());
                                System.out.println("Preço: " + objetoListaJogo.getPreco());
                                System.out.println("Distribuidora: " + objetoListaJogo.getDistribuidora());
                                System.out.println("Gênero: " + objetoListaJogo.getGenero());
                                System.out.println("Estudio: " + objetoListaJogo.getEstudio());
                                System.out.println();
                            }

                            System.out.println("Digite o nome do jogo que deseja comprar:");
                            scanner.nextLine();
                            nomeProdutoCompra = scanner.nextLine();

                            for (Jogo objetoListaJogo: listaJogos) {
                                if (nomeProdutoCompra.equals(objetoListaJogo.getNome())) {
                                    listaJogos.remove(objetoListaJogo);//retirado do estoque
                                    dinheiroEmCaixaDaEmpresa = dinheiroEmCaixaDaEmpresa + objetoListaJogo.getPreco();//valor pago adicionado ao caixa da empresa
                                }
                            }

                            System.out.println("Compra realizada com sucesso!");
                            System.out.println("Dinheiro em caixa atualizado " + dinheiroEmCaixaDaEmpresa);
                            System.out.println("Reimpressão de Lista de Filmes em estoque");
                            for (Jogo objetoListaJogo : listaJogos) {
                                System.out.println("Id: " + objetoListaJogo.getId());
                                System.out.println("Nome: " + objetoListaJogo.getNome());
                                System.out.println("Preço: " + objetoListaJogo.getPreco());
                                System.out.println("Distribuidora: " + objetoListaJogo.getDistribuidora());
                                System.out.println("Gênero: " + objetoListaJogo.getGenero());
                                System.out.println("Estudio: " + objetoListaJogo.getEstudio());
                                System.out.println();
                            }

                            break;
                        case 5:
                            System.out.println("Lista de Livro disponíveis em estoque");
                            for (Livro objetoListaLivro : listaLivros) {
                                System.out.println("Id: " + objetoListaLivro.getId());
                                System.out.println("Nome: " + objetoListaLivro.getNome());
                                System.out.println("Preço: " + objetoListaLivro.getPreco());
                                System.out.println("Gênero: " + objetoListaLivro.getGenero());
                                System.out.println("Escritor: " + objetoListaLivro.getEscritor());
                                System.out.println("Editora: " + objetoListaLivro.getEditora());
                                System.out.println();
                            }

                            System.out.println("Digite o nome do livro que deseja comprar:");
                            scanner.nextLine();
                            nomeProdutoCompra = scanner.nextLine();

                            for (Livro objetoListaLivro: listaLivros) {
                                if (nomeProdutoCompra.equals(objetoListaLivro.getNome())) {
                                    listaLivros.remove(objetoListaLivro);//retirado do estoque
                                    dinheiroEmCaixaDaEmpresa = dinheiroEmCaixaDaEmpresa + objetoListaLivro.getPreco();//valor pago adicionado ao caixa da empresa
                                }
                            }

                            System.out.println("Compra realizada com sucesso!");
                            System.out.println("Dinheiro em caixa atualizado " + dinheiroEmCaixaDaEmpresa);
                            System.out.println("Reimpressão de Lista de Filmes em estoque");
                            for (Livro objetoListaLivro : listaLivros) {
                                System.out.println("Id: " + objetoListaLivro.getId());
                                System.out.println("Nome: " + objetoListaLivro.getNome());
                                System.out.println("Preço: " + objetoListaLivro.getPreco());
                                System.out.println("Gênero: " + objetoListaLivro.getGenero());
                                System.out.println("Escritor: " + objetoListaLivro.getEscritor());
                                System.out.println("Editora: " + objetoListaLivro.getEditora());
                                System.out.println();
                            }

                            break;
                        default:
                            System.out.println("Operação Inválida!");
                    }
                    break;
                case 9: // Menu 9 - Valor em caixa (dinheiro)
                    System.out.println("Dinheiro em caixa atualizado " + dinheiroEmCaixaDaEmpresa);
                    break;
                default:
                    System.out.println("Operação Inválida");
            }

            System.out.println("Deseja retornar ao menu principal? (S/N)");
            String respostaRetornarMenu = scanner.nextLine();

            if (respostaRetornarMenu.equalsIgnoreCase("N")) {
                opcaoMenu = 10;
            }

        } while (opcaoMenu != 10 && opcaoMenu <= 9);

        System.out.println("Bye bye. Até a próxima!");

    }

}
