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
        List<Livro> bookAuthor = new ArrayList<>();
        if(!livroList.isEmpty()){
            for (Livro l : livroList){
                if (l.getAuthor().equalsIgnoreCase(author)){
                    bookAuthor.add(l);
                }
            }
        }
        return bookAuthor;
    }
    public List<Livro> searchByYearRange(int startyear, int endyear){
        List<Livro> bookYear = new ArrayList<>();
        if(!livroList.isEmpty()) {
            for (Livro l : livroList) {
                if (l.getYearPublication() > startyear && l.getYearPublication() < endyear){
                    bookYear.add(l);
                }
            }
        }
        return bookYear;
    }

    public Livro searchByTitle(String title){
        Livro bookTitle = null;
        for (Livro l : livroList){
            if (l.getTitle().equalsIgnoreCase(title)){
                bookTitle = l;
                break;
            }
        }
        return bookTitle;
    }
}
