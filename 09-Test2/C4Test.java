public class C4Test {
    public static void main(String[] args) {
        C4 c1 = new C4();
        Product p1 = new Product("Arbuz", 2);
        Product p2 = new Product("Melon", 3);
        Product p3 = new Product("Ananas", 1);

        c1.add(p1);
        c1.add(p2);
        c1.add(p3);

        System.out.println(c1.toString());
        System.out.println(c1.total());
    }
}
