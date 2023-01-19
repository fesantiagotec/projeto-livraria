package projetoLivraria;

public class AlbumDeMusica extends Produto {
    //músicos/bandas, gêneros e selos
    private String musicosBanda;
    private String genero;
    private String selo;

    public AlbumDeMusica(String nome, int id, Double preco, String musicosBanda, String genero, String selo) {
        super(nome, id, preco);
        this.musicosBanda = musicosBanda;
        this.genero = genero;
        this.selo = selo;
    }

    public AlbumDeMusica () {
        super();
    }

    public String getMusicosBanda() {
        return musicosBanda;
    }

    public void setMusicosBanda(String musicosBanda) {
        this.musicosBanda = musicosBanda;
    }

    public String getGenero () {
        return genero;
    }

    public void setGenero (String genero) {
        this.genero = genero;
    }

    public String getSelo() {
        return selo;
    }

    public void setSelo (String selo) {
        this.selo = selo;
    }

}
