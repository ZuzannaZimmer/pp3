public class BookTest{
    public static void main(String[] args) {
        Writer author1 = new Writer("John", "Doe", "Fiction");
        Writer author2 = new Writer("Jane", "Smith", "Mystery");

        Book b1 = new Book("Ada Coś", "Krakow", "Narnia",2109, author1);
        Book b2 = new Book("Gosia marzec","Warszawa","Star Wars",2034,author2 );

        b1.display();
        b2.display();

        Ebook e1 = new Ebook("Maria Bąk","Krakow","Wiedzmin","Wiedzmin ebook",2023, author1);
        Ebook e2 = new Ebook("Maria Bąk","Krakow","Komputer", "ebookjakub",2012, author2);

        e1.display();
        e2.display();

        Audiobook a1 = new Audiobook("Maria Bąk","Krakow","audio1", 30, 20,2022,author1);
        Audiobook a2 = new Audiobook("Maria Bąk","Krakow","adio2", 40, 10,2011,author1);

        a1.display();
        a2.display();
    }
}

