package List.pesquisaList;

public class Livro {
    private String title;
    private String author;
    private int yearPublication;

    public Livro(String title, String author, int yearPublication) {
        this.title = title;
        this.author = author;
        this.yearPublication = yearPublication;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getYearPublication() {
        return yearPublication;
    }
}
