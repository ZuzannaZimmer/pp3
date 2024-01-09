public class PizzaTest {
    public static void main(String[] args) {
        Pizza p1 = new Pizza("margerita", 20);
        Pizza p2 = new Pizza("farmerska", 60);

        p1.setPrice(30);
        p2.setPrice(14);

        System.out.println(p1.delivery());
        System.out.println(p2.delivery());
        System.out.println(p2.delivery(2));
        System.out.println(p1.discount());
        System.out.println(p2.discount());
    }

}
