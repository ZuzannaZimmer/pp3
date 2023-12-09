public class Audiobook extends Book{
    private int minutes;
    private int seconds;


    public Audiobook(String name, String city, String title, int minutes, int seconds, int year, Writer author) {
        super(name, city, title, year, author);
        this.minutes = minutes;
        this.seconds = seconds;
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    public int getSeconds() {
        return seconds;
    }

    public void setSeconds(int seconds) {
        this.seconds = seconds;
    }

    public void display(){
        System.out.printf("\n\nTytuł książki: %s\nAutor: %s %s %s\nCzas trwania: %s minut %s sekund\nwydawca: %s %s\nrok wydania: %d",title,author.getNameW(), author.getSurnameW(), author.getGenre(),minutes,seconds,name,city,year);
    }
}
