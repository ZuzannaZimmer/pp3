public class BookTest {
    public static void main(String[] args) {
        Book b = new Book("Zwiadowcy");

        b.setPages(3);
        System.out.println(b.getPages());
        b.setPages(-4);
        System.out.println(b.getPages());
    }


}
