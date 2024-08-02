package CatalogoLivros.src;

import java.util.ArrayList;
import java.util.List;
public class CatalogoLivros {
    private List<Livro> livroList;

    public CatalogoLivros(){
        this.livroList = new ArrayList<>();
    }
    public void adicionarLivro(String titulo, String autor, int anoPublicaçao) {
        livroList.add(new Livro(titulo, autor, anoPublicaçao));
    }
    
    public List<Livro> pesquisarAutor(String autor){
        List<Livro> livrosPorAutor = new ArrayList<>();
        if (!livroList.isEmpty()){
            for (Livro l : livroList) {
                if(l.getAutor().equalsIgnoreCase(autor)){
                    livrosPorAutor.add(l);
                }
             }
         }
       return livrosPorAutor;
        }
    public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal) {
      List<Livro> livrosPorIntervaloAnos = new ArrayList<>();
      if (!livroList.isEmpty()) {
        for (Livro l : livroList) {
          if (l.getAnoPublicaçao() >= anoInicial && l.getAnoPublicaçao() <= anoFinal) {
            livrosPorIntervaloAnos.add(l);
          }
        }
      }
      return livrosPorIntervaloAnos;
    }
    public Livro pesquisarPorTitulo(String titulo) {
      Livro livroPorTitulo = null;
      if (!livroList.isEmpty()) {
        for (Livro l : livroList) {
          if (l.getTitulo().equalsIgnoreCase(titulo)) {
            livroPorTitulo = l;
            break;
          }
        }
      }
      return livroPorTitulo;
    }
    public static void main(String[] args) {
      CatalogoLivros catalogoLivros = new CatalogoLivros();
      catalogoLivros.adicionarLivro("O poder do hábito", "Charles", 2020);
      System.out.println(catalogoLivros.pesquisarAutor("Charles"));
      System.out.println(catalogoLivros.pesquisarPorTitulo("O poder do hábito"));
    }
}

