public class Book {
    private int pagenum;
    private Writer writer;
    private String genre;
    private String title;

    public Book(String title, String genre, int pagenum){
        this.pagenum = pagenum;
        this.genre = genre;
        this.title = title;
    }
    public void addAuthor(Writer writer){
        this.writer = writer;
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
        String s = "Tytuł ksiązki: "+ title;
        s+="Autor ksiązki: "+ writer.getName() +" " + writer.getSurname();
        return s;
    }
    
    



    
}
