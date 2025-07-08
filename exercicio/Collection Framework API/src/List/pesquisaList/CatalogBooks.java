package List.pesquisaList;

import java.util.ArrayList;
import java.util.List;

public class CatalogBooks {
    private List<Livro> livroList;

    public CatalogBooks() {
        this.livroList = new ArrayList<>();
    }

    public void addBook(String title, String author, int yearPublication) {
        livroList.add(new Livro(title, author, yearPublication));
    }

    public List<Livro> searchByAuthor(String author){
        List<Livro> bookForAuthor = new ArrayList<>();
        if(!livroList.isEmpty()){
            for (Livro l : livroList){
                if (l.getAuthor().equalsIgnoreCase(author)){
                    bookForAuthor.add(l);
                }
            }
        }
        return bookForAuthor;
    }
}
