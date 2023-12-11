import java.util.*;

public class C4 {
    private Product product;
    private ArrayList<Product> a = new ArrayList<Product>();

    public void add(Product product) {
        this.product = product;
        a.add(product);
    }

    @Override
    public String toString() {
        String s = "";

        for (Product p : a) {
            s += p.getName() + " ";
        }

        return s;
    }

    public int total() {
        int sum = 0;
        for (Product p : a) {
            sum += p.getQuantity();
        }
        return sum;
    }

}
