package projetoLivraria;

import projetoLivraria.Produtos.*;
import projetoLivraria.Util.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {
    public static Integer contId = 0;

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
                            AlbumDeMusicaHelper.cadastrarAlbumDeMusica(scanner, contId, listaAlbunsDeMusica);
                            contId = contId + 1;
                            break;
                        case 2:
                            BrinquedoHelper.cadastrarBrinquedo(scanner, contId, listaBrinquedos);
                            contId = contId + 1;
                            break;
                        case 3:
                            FilmeHelper.cadastrarFilme(scanner,contId, listaFilmes);
                            contId = contId + 1;
                            break;
                        case 4:
                            JogoHelper.cadastrarJogo(scanner,contId, listaJogos);
                            contId = contId + 1;
                            break;
                        case 5:
                            LivroHelper.cadastrarLivro(scanner, contId, listaLivros);
                            contId = contId + 1;
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

                    Integer idProdutoAlterar;

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

                            System.out.println("Digite o ID do Álbum de Músicas que deseja alterar dados:");
                            scanner.nextLine();
                            idProdutoAlterar = scanner.nextInt();

                            for (AlbumDeMusica objetoListaAlbumDeMusica: listaAlbunsDeMusica) {
                                if (idProdutoAlterar.equals(objetoListaAlbumDeMusica.getId())) {
                                    System.out.println("Produto encontrado no estoque!");
                                    System.out.println();
                                    System.out.println("Qual dado deseja alterar?");
                                    System.out.println("1 - Nome");
                                    System.out.println("2 - Preço");
                                    System.out.println("3 - Músicos da Banda");
                                    System.out.println("4 - Gênero");
                                    System.out.println("5 - Selo");
                                    System.out.println("Digite a opção:");
                                    Integer opcaoDado = scanner.nextInt();

                                    switch (opcaoDado) {
                                        case 1:
                                            System.out.println("Digite o novo nome que substituirá o atual:");
                                            scanner.nextLine();
                                            String nomeAlterado = scanner.nextLine();
                                            objetoListaAlbumDeMusica.setNome(nomeAlterado);//alterado dado do produto
                                            System.out.println(objetoListaAlbumDeMusica.getNome());
                                            break;
                                        case 2:
                                            System.out.println("Digite o novo preço que substituirá o atual:");
                                            scanner.nextLine();
                                            objetoListaAlbumDeMusica.setPreco(scanner.nextDouble());//alterado dado do produto
                                            System.out.println(objetoListaAlbumDeMusica.getPreco());
                                            break;
                                        case 3:
                                            System.out.println("Digite os novos músicos da banda que substituirão os atuais:");
                                            scanner.nextLine();
                                            objetoListaAlbumDeMusica.setMusicosBanda(scanner.nextLine());//alterado dado do produto
                                            System.out.println(objetoListaAlbumDeMusica.getMusicosBanda());
                                            break;
                                        case 4:
                                            System.out.println("Digite o novo genero que substituirá o atual:");
                                            scanner.nextLine();
                                            objetoListaAlbumDeMusica.setGenero(scanner.nextLine());//alterado dado do produto
                                            System.out.println(objetoListaAlbumDeMusica.getGenero());
                                            break;
                                        case 5:
                                            System.out.println("Digite o novo selo que substituirá o atual:");
                                            scanner.nextLine();
                                            objetoListaAlbumDeMusica.setSelo(scanner.nextLine());//alterado dado do produto
                                            System.out.println(objetoListaAlbumDeMusica.getSelo());
                                            break;
                                        default:
                                            System.out.println("Operação Inválida!");
                                    }
                                    System.out.println("Dado alterado com sucesso");
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

                            System.out.println("Digite o ID do Brinquedo que deseja alterar dados:");
                            scanner.nextLine();
                            idProdutoAlterar = scanner.nextInt();

                            for (Brinquedo objetoListaBrinquedo: listaBrinquedos) {
                                if (idProdutoAlterar.equals(objetoListaBrinquedo.getId())) {
                                    System.out.println("Produto encontrado no estoque!");
                                    System.out.println();
                                    System.out.println("Qual dado deseja alterar?");
                                    System.out.println("1 - Nome");
                                    System.out.println("2 - Preço");
                                    System.out.println("3 - Tipo");
                                    System.out.println("Digite a opção:");
                                    Integer opcaoDado = scanner.nextInt();

                                    switch (opcaoDado) {
                                        case 1:
                                            System.out.println("Digite o novo nome que substituirá o atual:");
                                            scanner.nextLine();
                                            String nomeAlterado = scanner.nextLine();
                                            objetoListaBrinquedo.setNome(nomeAlterado);//alterado dado do produto
                                            System.out.println(objetoListaBrinquedo.getNome());
                                            break;
                                        case 2:
                                            System.out.println("Digite o novo preço que substituirá o atual:");
                                            scanner.nextLine();
                                            objetoListaBrinquedo.setPreco(scanner.nextDouble());//alterado dado do produto
                                            System.out.println(objetoListaBrinquedo.getPreco());
                                            break;
                                        case 3:
                                            System.out.println("Digite o novo tipo que substituirá o atual:");
                                            scanner.nextLine();
                                            objetoListaBrinquedo.setTipo(scanner.nextLine());//alterado dado do produto
                                            System.out.println(objetoListaBrinquedo.getTipo());
                                            break;
                                        default:
                                            System.out.println("Operação Inválida!");
                                    }
                                    System.out.println("Dado alterado com sucesso");
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

                            System.out.println("Digite o ID do Filme que deseja alterar dados:");
                            scanner.nextLine();
                            idProdutoAlterar = scanner.nextInt();

                            for (Filme objetoListaFilme: listaFilmes) {
                                if (idProdutoAlterar.equals(objetoListaFilme.getId())) {
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
                                    Integer opcaoDado = scanner.nextInt();

                                    switch (opcaoDado) {
                                        case 1:
                                            System.out.println("Digite o novo nome que substituirá o atual:");
                                            scanner.nextLine();
                                            String nomeAlterado = scanner.nextLine();
                                            objetoListaFilme.setNome(nomeAlterado);//alterado dado do produto
                                            System.out.println(objetoListaFilme.getNome());
                                            break;
                                        case 2:
                                            System.out.println("Digite o novo preço que substituirá o atual:");
                                            scanner.nextLine();
                                            objetoListaFilme.setPreco(scanner.nextDouble());//alterado dado do produto
                                            System.out.println(objetoListaFilme.getPreco());
                                            break;
                                        case 3:
                                            System.out.println("Digite o novo estúdio que substituirá o atual:");
                                            scanner.nextLine();
                                            objetoListaFilme.setEstudio(scanner.nextLine());//alterado dado do produto
                                            System.out.println(objetoListaFilme.getEstudio());
                                            break;
                                        case 4:
                                            System.out.println("Digite o novo diretor que substituirá o atual:");
                                            scanner.nextLine();
                                            objetoListaFilme.setDiretor(scanner.nextLine());//alterado dado do produto
                                            System.out.println(objetoListaFilme.getDiretor());
                                            break;
                                        case 5:
                                            System.out.println("Digite o novo genero que substituirá o atual:");
                                            scanner.nextLine();
                                            objetoListaFilme.setGenero(scanner.nextLine());//alterado dado do produto
                                            System.out.println(objetoListaFilme.getGenero());
                                            break;
                                        case 6:
                                            System.out.println("Digite o novo produtor que substituirá o atual:");
                                            scanner.nextLine();
                                            objetoListaFilme.setProdutor(scanner.nextLine());//alterado dado do produto
                                            System.out.println(objetoListaFilme.getProdutor());
                                            break;
                                        default:
                                            System.out.println("Operação Inválida!");
                                    }
                                    System.out.println("Dado alterado com sucesso");
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

                            System.out.println("Digite o ID do Jogo que deseja alterar dados:");
                            scanner.nextLine();
                            idProdutoAlterar = scanner.nextInt();

                            for (Jogo objetoListaJogo: listaJogos) {
                                if (idProdutoAlterar.equals(objetoListaJogo.getId())) {
                                    System.out.println("Produto encontrado no estoque!");
                                    System.out.println();
                                    System.out.println("Qual dado deseja alterar?");
                                    System.out.println("1 - Nome");
                                    System.out.println("2 - Preço");
                                    System.out.println("3 - Distribuidora");
                                    System.out.println("4 - Gênero");
                                    System.out.println("5 - Estúdio");
                                    System.out.println("Digite a opção:");
                                    Integer opcaoDado = scanner.nextInt();

                                    switch (opcaoDado) {
                                        case 1:
                                            System.out.println("Digite o novo nome que substituirá o atual:");
                                            scanner.nextLine();
                                            String nomeAlterado = scanner.nextLine();
                                            objetoListaJogo.setNome(nomeAlterado);//alterado dado do produto
                                            System.out.println(objetoListaJogo.getNome());
                                            break;
                                        case 2:
                                            System.out.println("Digite o novo preço que substituirá o atual:");
                                            scanner.nextLine();
                                            objetoListaJogo.setPreco(scanner.nextDouble());//alterado dado do produto
                                            System.out.println(objetoListaJogo.getPreco());
                                            break;
                                        case 3:
                                            System.out.println("Digite a nova distribuidora que substituirá o atual:");
                                            scanner.nextLine();
                                            objetoListaJogo.setDistribuidora(scanner.nextLine());//alterado dado do produto
                                            System.out.println(objetoListaJogo.getDistribuidora());
                                            break;
                                        case 4:
                                            System.out.println("Digite o novo genero que substituirá o atual:");
                                            scanner.nextLine();
                                            objetoListaJogo.setGenero(scanner.nextLine());//alterado dado do produto
                                            System.out.println(objetoListaJogo.getGenero());
                                            break;
                                        case 5:
                                            System.out.println("Digite o novo estúdio que substituirá o atual:");
                                            scanner.nextLine();
                                            objetoListaJogo.setEstudio(scanner.nextLine());//alterado dado do produto
                                            System.out.println(objetoListaJogo.getEstudio());
                                            break;
                                        default:
                                            System.out.println("Operação Inválida!");
                                    }
                                    System.out.println("Dado alterado com sucesso");
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

                            System.out.println("Digite o ID do Livro que deseja alterar dados:");
                            scanner.nextLine();
                            idProdutoAlterar = scanner.nextInt();

                            for (Livro objetoListaLivro: listaLivros) {
                                if (idProdutoAlterar.equals(objetoListaLivro.getId())) {
                                    System.out.println("Produto encontrado no estoque!");
                                    System.out.println();
                                    System.out.println("Qual dado deseja alterar?");
                                    System.out.println("1 - Nome");
                                    System.out.println("2 - Preço");
                                    System.out.println("3 - Gênero");
                                    System.out.println("4 - Escritor");
                                    System.out.println("5 - Editora");
                                    System.out.println("Digite a opção:");
                                    Integer opcaoDado = scanner.nextInt();

                                    switch (opcaoDado) {
                                        case 1:
                                            System.out.println("Digite o novo nome que substituirá o atual:");
                                            scanner.nextLine();
                                            String nomeAlterado = scanner.nextLine();
                                            objetoListaLivro.setNome(nomeAlterado);//alterado dado do produto
                                            System.out.println(objetoListaLivro.getNome());
                                            break;
                                        case 2:
                                            System.out.println("Digite o novo preço que substituirá o atual:");
                                            scanner.nextLine();
                                            objetoListaLivro.setPreco(scanner.nextDouble());//alterado dado do produto
                                            System.out.println(objetoListaLivro.getPreco());
                                            break;
                                        case 3:
                                            System.out.println("Digite o novo genero que substituirá o atual:");
                                            scanner.nextLine();
                                            objetoListaLivro.setGenero(scanner.nextLine());//alterado dado do produto
                                            System.out.println(objetoListaLivro.getGenero());
                                            break;
                                        case 4:
                                            System.out.println("Digite o novo escritor que substituirá o atual:");
                                            scanner.nextLine();
                                            objetoListaLivro.setEscritor(scanner.nextLine());//alterado dado do produto
                                            System.out.println(objetoListaLivro.getEscritor());
                                            break;
                                        case 5:
                                            System.out.println("Digite o novo editora que substituirá o atual:");
                                            scanner.nextLine();
                                            objetoListaLivro.setEditora(scanner.nextLine());//alterado dado do produto
                                            System.out.println(objetoListaLivro.getEditora());
                                            break;
                                        default:
                                            System.out.println("Operação Inválida!");
                                    }
                                    System.out.println("Dado alterado com sucesso");
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
