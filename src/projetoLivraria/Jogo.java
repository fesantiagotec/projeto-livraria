package projetoLivraria;

public class Jogo extends Produto {
    //distribuidora, gêneros e estúdio.
    private String distribuidora;
    private String genero;
    private String estudio;

    public Jogo(String nome, int id, Double preco, String distribuidora, String genero, String estudio) {
        super(nome, id, preco);
        this.distribuidora = distribuidora;
        this.genero = genero;
        this.estudio = estudio;
    }

    public Jogo() {

    }

    public String getDistribuidora () {
        return distribuidora;
    }

    public void setDistribuidora (String distribuidora) {
        this.distribuidora = distribuidora;
    }

    public String getGenero () {
        return genero;
    }

    public void setGenero (String genero) {
        this.genero = genero;
    }

    public String getEstudio () {
        return estudio;
    }

    public void setEstudio (String estudio) {
        this.estudio = estudio;
    }

}
