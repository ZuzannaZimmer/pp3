import java.util.*;

public class Library {
    
    public static void main(String[] args) {
        Book b1 = new Book("Narnia", "Adam Nowak");
        Ebook e1 = new Ebook("Wiedzmin", "Andrzej Sapkowski", "Wiedzmin ebook");
        Audiobook a1 = new Audiobook("audio1", "Marcin Banan", 30, 20);

        ArrayList<Book> books = new ArrayList<Book>();

        books.add(b1);
        books.add(e1);
        books.add(a1);

        for (int i = 0; i < books.size(); i++) {
            Book s;
            s=books.get(i);
            s.display();

        for (Book j: books)
            j.display();
    }
    
}}


