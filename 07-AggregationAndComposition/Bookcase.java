import java.util.ArrayList;

public class Bookcase {
    public static void main(String[] args) {

        Writer w = new Writer("Adam", "Maslo", 2);
        Book b = new Book("Narnia", "fantasy", 300);
        b.addAuthor(w);
        Writer w2 = new Writer("Konrad", "Dąb", 2);
        Book b2 = new Book("Gra o tron", "fantasy", 600);
        b2.addAuthor(w2);

        b.addChapter("rozdział1", 40, 2);
        b.addChapter("rozdział2", 30, 42);

        ArrayList<Book> books = new ArrayList<>();
        books.add(b);
        books.add(b2);

        for (Book i : books) {
            System.out.println(i.toString());
        }

        books.remove(b);

        for (Book i : books) {
            System.out.println(i.toString());
        }

    }

}
