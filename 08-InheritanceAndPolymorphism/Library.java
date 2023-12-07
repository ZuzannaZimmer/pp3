import java.util.*;

public class Library {
    
    public static void main(String[] args) {
        Writer author1 = new Writer("John", "Doe", "Fiction");
        Writer author2 = new Writer("Jane", "Smith", "Mystery");
        Book b1 = new Book("Ada Coś", "Krakow", "Narnia",2109, author1);
        Ebook e1 = new Ebook("Maria Bąk","Krakow","Wiedzmin","Wiedzmin ebook",2023, author1);
        Audiobook a1 = new Audiobook("Maria Bąk","Krakow","audio1", 30, 20,2022,author2);

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


