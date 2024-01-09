import java.util.Arrays;

public class PTeste {
    public static void main(String[] args) {
        Product[] arr = { new Product("milk", 5), new Product("cheese", 2), new Product("ham", 9) };
        System.out.println(arr[0].getPrice());
        System.out.println(arr[1].getPrice());
        System.out.println(arr[2].getPrice());
        Arrays.sort(arr);
        System.out.println(arr[0].getPrice());
        System.out.println(arr[1].getPrice());
        System.out.println(arr[2].getPrice());

    }
}
