package projetoLivraria;

public class Produto {

    private String nome;
    private int id;
    private Double preco;

    public Produto (String nome, int id, Double preco) {
        this.nome = nome;
        this.id = id;
        this.preco = preco;
    }
    public Produto () {
        super();
    }

    public String getNome () {

        return nome;
    }

    public void setNome (String nome) {
        this.nome = nome;
    }

    public int getId() {

        return id;
    }

    public void setId(int id) {

        this.id = id;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }
}
