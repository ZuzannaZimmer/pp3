public class Book{
    protected String title;
    protected String author;

    public Book(String title, String author){
        this.title = title;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void display(){
        System.out.printf("\n\nTytuł książki: %s\nautor: %s",title,author);
    }
}