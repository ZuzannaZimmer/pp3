public class BookTest{
    public static void main(String[] args) {
        Book b1 = new Book("Narnia", "Adam Nowak");
        Book b2 = new Book("Star Wars", "Marta Kowalska");

        b1.display();
        b2.display();

        Ebook e1 = new Ebook("Wiedzmin", "Andrzej Sapkowski", "Wiedzmin ebook");
        Ebook e2 = new Ebook("Komputer", "Jakb Otto", "ebookjakub");

        e1.display();
        e2.display();

        Audiobook a1 = new Audiobook("audio1", "Marcin Banan", 30, 20);
        Audiobook a2 = new Audiobook("adio2", "Gosia Nowak", 40, 10);

        a1.display();
        a2.display();
    }
}

