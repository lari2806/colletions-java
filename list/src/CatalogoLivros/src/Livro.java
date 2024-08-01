package CatalogoLivros.src;

public class Livro {
    private String titulo;
    private String autor;
    private int anoPublicaçao;

    public Livro(String titulo,  String autor, int anoPublicaçao){
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicaçao = anoPublicaçao;
    }
    public String getTitulo(){
        return titulo;
    }
    public String getAutor(){
        return autor;
    }
    public int getAnoPublicaçao(){
        return  anoPublicaçao;
    }
    @Override
    public String toString() {
      return "Livro{" +
          "titulo = '" + titulo + '\'' +
          ", autor = '" + autor + '\'' +
          ", anoPublicacao = " + anoPublicaçao + '}';
    }

}
