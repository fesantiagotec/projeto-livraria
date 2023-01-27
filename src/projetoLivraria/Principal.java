package projetoLivraria;

import projetoLivraria.BancoDeDados.CaixaEmpresa;
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

        CaixaEmpresa caixaDaEmpresa = new CaixaEmpresa();
        caixaDaEmpresa.setDinheiroEmCaixaDaEmpresa(1000.00);

        do {
            exibirMenuPrincipal();
            opcaoMenu = scanner.nextInt();

            switch (opcaoMenu) {
                case 1: //Menu 1 - Cadastrar produto
                    exibirMenuCategorias();
                    opcaoCategoria = scanner.nextInt();

                    switch (opcaoCategoria) {
                        case 1:
                            AlbumDeMusicaHelper.cadastrarAlbumDeMusica(scanner);
                            break;
                        case 2:
                            BrinquedoHelper.cadastrarBrinquedo(scanner);
                            break;
                        case 3:
                            FilmeHelper.cadastrarFilme(scanner);
                            break;
                        case 4:
                            JogoHelper.cadastrarJogo(scanner);
                            break;
                        case 5:
                            LivroHelper.cadastrarLivro(scanner);
                            break;
                        default:
                            System.out.println("Operação Inválida!");
                    }

                    retornarMenuPrincipal (scanner, opcaoMenu);
                    break;
                case 2: //Menu 2 - Alterar produto cadastrado

                    exibirMenuCategorias();
                    opcaoCategoria = scanner.nextInt();

                    Integer idProdutoAlterar;

                    switch (opcaoCategoria) {
                        case 1:

                            //Imprimindo a lista atual antes da alteração
                            System.out.println("Lista de Albuns de Música disponíveis em estoque");

                            AlbumDeMusicaHelper.imprimirListaAlbumDeMusica();

                            System.out.println("Digite o ID do Álbum de Músicas que deseja alterar dados:");
                            scanner.nextLine();
                            idProdutoAlterar = scanner.nextInt();

                            for (AlbumDeMusica objetoListaAlbumDeMusica: listaAlbunsDeMusica) {
                                if (idProdutoAlterar.equals(objetoListaAlbumDeMusica.getId())) {
                                    AlbumDeMusicaHelper.exibirMenuAtributosAlbumDeMusica();

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
                            AlbumDeMusicaHelper.imprimirListaAlbumDeMusica();

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
                                    BrinquedoHelper.exibirMenuAtributosBrinquedo();
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
                                    FilmeHelper.exibirMenuAtributosFilme();
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
                                    JogoHelper.exibirMenuAtributosJogo();
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
                                    LivroHelper.exibirMenuAtributosLivro();
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
                    retornarMenuPrincipal (scanner, opcaoMenu);
                    break;
                case 3: // Menu 3 - Remover produto cadastrado
                    exibirMenuCategorias();
                    opcaoCategoria = scanner.nextInt();

                    Integer idProdutoRemover;

                    switch (opcaoCategoria) {
                        case 1:

                            //Imprimindo a lista atual antes da remoção (o que há no estoque)
                            System.out.println("Lista de Albuns de Música disponíveis em estoque");
                            AlbumDeMusicaHelper.imprimirListaAlbumDeMusica();

                            System.out.println("Digite o ID do Álbum de Músicas que deseja remover:");
                            scanner.nextLine();
                            idProdutoRemover = scanner.nextInt();

                            AlbumDeMusicaHelper.removerMusica(idProdutoRemover);

                            //Reimprimir só para conferir que foi retirado
                            System.out.println("Reimpressão de Lista de Álbum de Música em estoque");
                            AlbumDeMusicaHelper.imprimirListaAlbumDeMusica();

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

                            System.out.println("Digite o ID do Brinquedo que deseja remover:");
                            scanner.nextLine();
                            idProdutoRemover = scanner.nextInt();

                            for (Brinquedo objetoListaBrinquedo: listaBrinquedos) {
                                if (idProdutoRemover.equals(objetoListaBrinquedo.getId())) {
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

                            System.out.println("Digite o ID do Filme que deseja remover:");
                            scanner.nextLine();
                            idProdutoRemover = scanner.nextInt();

                            for (Filme objetoListaFilme: listaFilmes) {
                                if (idProdutoRemover.equals(objetoListaFilme.getId())) {
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

                            System.out.println("Digite o ID do Jogo que deseja remover:");
                            scanner.nextLine();
                            idProdutoRemover = scanner.nextInt();

                            for (Jogo objetoListaJogo: listaJogos) {
                                if (idProdutoRemover.equals(objetoListaJogo.getId())) {
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

                            System.out.println("Digite o ID do Livro que deseja remover:");
                            scanner.nextLine();
                            idProdutoRemover = scanner.nextInt();

                            for (Livro objetoListaLivro: listaLivros) {
                                if (idProdutoRemover.equals(objetoListaLivro.getId())) {
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
                    retornarMenuPrincipal (scanner, opcaoMenu);
                    break;
                case 4: // Menu 4 - Visualizar produtos cadastrados
                    exibirMenuCategorias();
                    opcaoCategoria = scanner.nextInt();

                    switch (opcaoCategoria) {
                        case 1:
                            System.out.println("----------> Lista de Albuns de Música <----------");
                            AlbumDeMusicaHelper.imprimirListaAlbumDeMusica();
                            break;
                        case 2:
                            System.out.println("----------> Lista de Brinquedos <----------");
                            for (Brinquedo objetoListaBrinquedo : listaBrinquedos) {
                                System.out.println("Id: " + objetoListaBrinquedo.getId());
                                System.out.println("Nome: " + objetoListaBrinquedo.getNome());
                                System.out.println("Preço: " + objetoListaBrinquedo.getPreco());
                                System.out.println("Tipo: " + objetoListaBrinquedo.getTipo());
                                System.out.println();
                            }
                            break;
                        case 3:
                            System.out.println("----------> Lista de Filmes <----------");
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
                            System.out.println("----------> Lista de Jogos <----------");

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
                            System.out.println("----------> Lista de Livros <----------");
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
                    retornarMenuPrincipal (scanner, opcaoMenu);
                    break;
                case 5: // Menu 5 - Visualizar o quantitativo de produtos em estoque (por categoria)
                    exibirMenuCategorias();
                    opcaoCategoria = scanner.nextInt();

                    switch (opcaoCategoria) {
                        case 1:
                            int quantitativoItensAlbumDeMusica;
                            quantitativoItensAlbumDeMusica = listaAlbunsDeMusica.size();
                            System.out.println("O quantitativo de produtos do categoria Albuns de Música é " + quantitativoItensAlbumDeMusica);
                            break;
                        case 2:
                            int quantitativoItensBrinquedo = listaBrinquedos.size();
                            System.out.println("O quantitativo de produtos da categoria Brinquedo é " + quantitativoItensBrinquedo);
                            break;
                        case 3:
                            int quantitativoItensFilme = listaFilmes.size();
                            System.out.println("O quantitativo de produtos da categoria Filme é " + quantitativoItensFilme);
                            break;
                        case 4:
                            int quantitativoItensJogo = listaJogos.size();
                            System.out.println("O quantitativo de produtos da categoria Jogo é " + quantitativoItensJogo);
                            break;
                        case 5:
                            int quantitativoItensLivro = listaLivros.size();
                            System.out.println("O quantitativo de produtos da categoria Livro é " + quantitativoItensLivro);
                            break;
                        default:
                            System.out.println("Operação Inválida!");
                    }
                    retornarMenuPrincipal (scanner, opcaoMenu);
                    break;
                case 6: // Menu 6 - Visualizar listagem completa de produtos em estoque (geral)
                    System.out.println("-----> Lista completa de produtos em estoque (geral) <-----");

                    AlbumDeMusicaHelper.imprimirListaAlbumDeMusica();

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
                    retornarMenuPrincipal (scanner, opcaoMenu);
                    break;
                case 7: // Menu 7 - Visualizar listagem de produtos em estoque (por categoria)
                    System.out.println("-----> Lista completa de produtos em estoque (por categoria) <-----");

                    System.out.println("-----> Lista de Albuns de Música <-----");
                    AlbumDeMusicaHelper.imprimirListaAlbumDeMusica();

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
                    retornarMenuPrincipal (scanner, opcaoMenu);
                    break;
                case 8: // Menu 8 - Realizar compra
                    exibirMenuCategorias();
                    opcaoCategoria = scanner.nextInt();

                    Integer idProdutoCompra;

                    switch (opcaoCategoria) {
                        case 1:
                            System.out.println("Lista de Albuns de Música disponíveis em estoque");
                            AlbumDeMusicaHelper.imprimirListaAlbumDeMusica();

                            System.out.println("Digite o ID do Álbum de Músicas que deseja comprar:");
                            scanner.nextLine();
                            idProdutoCompra = scanner.nextInt();

                            for (AlbumDeMusica objetoListaAlbumDeMusica: listaAlbunsDeMusica) {
                                if (idProdutoCompra.equals(objetoListaAlbumDeMusica.getId())) {
                                    listaAlbunsDeMusica.remove(objetoListaAlbumDeMusica);//retirado do estoque
                                    caixaDaEmpresa.setDinheiroEmCaixaDaEmpresa(caixaDaEmpresa.getDinheiroEmCaixaDaEmpresa() + objetoListaAlbumDeMusica.getPreco()); //valor pago adicionado ao caixa da empresa
                                }
                            }

                            System.out.println("Compra realizada com sucesso!");
                            System.out.println("Dinheiro em caixa atualizado " + caixaDaEmpresa.getDinheiroEmCaixaDaEmpresa());
                            System.out.println("Reimpressão de Lista de Álbum de Música em estoque");
                            AlbumDeMusicaHelper.imprimirListaAlbumDeMusica();
                            
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
                            System.out.println("Digite o ID do brinquedo que deseja comprar:");
                            scanner.nextLine();
                            idProdutoCompra = scanner.nextInt();

                            for (Brinquedo objetoListaBrinquedo: listaBrinquedos) {
                                if (idProdutoCompra.equals(objetoListaBrinquedo.getId())) {
                                    listaBrinquedos.remove(objetoListaBrinquedo);//retirado do estoque
                                    caixaDaEmpresa.setDinheiroEmCaixaDaEmpresa(caixaDaEmpresa.getDinheiroEmCaixaDaEmpresa() + objetoListaBrinquedo.getPreco());//valor pago adicionado ao caixa da empresa
                                }
                            }

                            System.out.println("Compra realizada com sucesso!");
                            System.out.println("Dinheiro em caixa atualizado " + caixaDaEmpresa.getDinheiroEmCaixaDaEmpresa());
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
                            System.out.println("Digite o ID do filme que deseja comprar:");
                            scanner.nextLine();
                            idProdutoCompra = scanner.nextInt();

                            for (Filme objetoListaFilme: listaFilmes) {
                                if (idProdutoCompra.equals(objetoListaFilme.getId())) {
                                    listaFilmes.remove(objetoListaFilme);//retirado do estoque
                                    caixaDaEmpresa.setDinheiroEmCaixaDaEmpresa(caixaDaEmpresa.getDinheiroEmCaixaDaEmpresa() + objetoListaFilme.getPreco());//valor pago adicionado ao caixa da empresa
                                }
                            }

                            System.out.println("Compra realizada com sucesso!");
                            System.out.println("Dinheiro em caixa atualizado " + caixaDaEmpresa.getDinheiroEmCaixaDaEmpresa());
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

                            System.out.println("Digite o ID do jogo que deseja comprar:");
                            scanner.nextLine();
                            idProdutoCompra = scanner.nextInt();

                            for (Jogo objetoListaJogo: listaJogos) {
                                if (idProdutoCompra.equals(objetoListaJogo.getId())) {
                                    listaJogos.remove(objetoListaJogo);//retirado do estoque
                                    caixaDaEmpresa.setDinheiroEmCaixaDaEmpresa(caixaDaEmpresa.getDinheiroEmCaixaDaEmpresa() + objetoListaJogo.getPreco());//valor pago adicionado ao caixa da empresa
                                }
                            }

                            System.out.println("Compra realizada com sucesso!");
                            System.out.println("Dinheiro em caixa atualizado " + caixaDaEmpresa.getDinheiroEmCaixaDaEmpresa());
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

                            System.out.println("Digite o ID do livro que deseja comprar:");
                            scanner.nextLine();
                            idProdutoCompra = scanner.nextInt();

                            for (Livro objetoListaLivro: listaLivros) {
                                if (idProdutoCompra.equals(objetoListaLivro.getId())) {
                                    listaLivros.remove(objetoListaLivro);//retirado do estoque
                                    caixaDaEmpresa.setDinheiroEmCaixaDaEmpresa(caixaDaEmpresa.getDinheiroEmCaixaDaEmpresa() + objetoListaLivro.getPreco());//valor pago adicionado ao caixa da empresa
                                }
                            }

                            System.out.println("Compra realizada com sucesso!");
                            System.out.println("Dinheiro em caixa atualizado " + caixaDaEmpresa.getDinheiroEmCaixaDaEmpresa());
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
                    retornarMenuPrincipal (scanner, opcaoMenu);
                    break;
                case 9: // Menu 9 - Valor em caixa (dinheiro)
                    System.out.println("Dinheiro em caixa atualizado é R$ " + caixaDaEmpresa.getDinheiroEmCaixaDaEmpresa());
                    retornarMenuPrincipal (scanner, opcaoMenu);
                    break;
                case 10: // Menu 10 - Sair
                    opcaoMenu = 10;
                    break;
                default:
                    System.out.println("Operação Inválida");
            }

        } while (opcaoMenu != 10);

        System.out.println("Bye bye. Até a próxima!");

    }

    public static void exibirMenuPrincipal() {
        System.out.println();
        System.out.println("Bem vindos a Livraria - Good Vibes");
        System.out.println("Escolha um item do menu: ");
        System.out.println("1 - Cadastrar produto");
        System.out.println("2 - Alterar produto cadastrado");
        System.out.println("3 - Remover produto cadastrado");
        System.out.println("4 - Visualizar produtos cadastrados");
        System.out.println("5 - Visualizar o quantitativo de produtos em estoque (por categoria)");
        System.out.println("6 - Visualizar listagem completa de produtos em estoque (geral)");
        System.out.println("7 - Visualizar listagem de produtos em estoque (por categoria)");
        System.out.println("8 - Realizar compra");
        System.out.println("9 - Valor em caixa (dinheiro)");
        System.out.println("10 - Sair");

        System.out.println("Digite a opção:");

    }

    public static void exibirMenuCategorias() {
        System.out.println("Trabalhamos com várias categorias de produtos!");
        System.out.println("Qual categoria de produto deseja escolher?");
        System.out.println("1 - Albuns De Musica");
        System.out.println("2 - Brinquedos");
        System.out.println("3 - Filme");
        System.out.println("4 - Jogo");
        System.out.println("5 - Livro");
        System.out.println("Digite a opção:");
    }

    public static void retornarMenuPrincipal (Scanner scanner, Integer opcaoMenu) {
        System.out.println("Deseja retornar ao menu principal? (S/N)");
        String respostaRetornarMenu = scanner.nextLine();

        if (respostaRetornarMenu.equalsIgnoreCase("N")) {
            opcaoMenu = 10;
        }
    }
}
