
public class Book extends Publisher{
    protected String title;
    protected int year;
    protected Writer author;
    


    public Book(String name, String city, String title, int year, Writer author) {
        super(name, city);
        this.title = title;
        this.year = year;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void display(){
        System.out.printf("\n\nTytuł książki: %s\nautor: %s %s %s\nwydawca: %s %s\nrok wydania: %d",title,author.getNameW(), author.getSurnameW(), author.getGenre(), name, city,year);
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}