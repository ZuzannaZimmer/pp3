public class ProductTest {
    public static void main(String[] args) {
        Product chleb = new Product();
        chleb.setName("chleb");
        chleb.setVegan(true);
        System.out.println(chleb.toString());
    }
}
