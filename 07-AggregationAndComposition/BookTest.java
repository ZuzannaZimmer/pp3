public class BookTest {
    public static void main(String[] args) {
        Writer w = new Writer("Adam", "Maslo", 2);
        Book b = new Book("Narnia", "fantasy", 300);
        b.addAuthor(w);
        System.out.println(b.toString());
    }
    
}
