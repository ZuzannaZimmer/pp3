import java.util.ArrayList;
import java.util.List;

public class Book {
    private int pagenum;
    private Writer writer;
    private String genre;
    private String title;
    private List<Chapter> chapters;

    public Book(String title, String genre, int pagenum) {
        this.pagenum = pagenum;
        this.genre = genre;
        this.title = title;
        this.chapters = new ArrayList<>();
    }

    public void addAuthor(Writer writer) {
        this.writer = writer;
    }

    public void addChapter(String chTitle, int numPages, int numFirstPage) {
        Chapter chapter = new Chapter(chTitle, numPages, numFirstPage);
        chapters.add(chapter);
    }

    public void setPagenum(int pagenum) {
        this.pagenum = pagenum;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        String s = "Tytuł książki: " + title + "\n";

        if (writer != null) {
            s += "Autor książki: " + writer.getName() + " " + writer.getSurname() + "\n";
        } else {
            s += "Brak informacji o autorze\n";
        }

        s += "Liczba stron: " + pagenum + "\n";
        s += "Gatunek: " + genre + "\n";
        if (!chapters.isEmpty()) {
            s += "Rozdziały:\n";
            for (Chapter chapter : chapters) {
                s += "- " + chapter.getchTitle() + ", liczba stron: " + chapter.getnumPages()
                        + ", numer pierwszej strony: " + chapter.getnumFirstPage() + "\n";
            }
        } else {
            s += "Brak informacji o rozdziałach";
        }
        return s;
    }

}
