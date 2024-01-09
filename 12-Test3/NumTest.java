public class NumTest {
    public static void main(String[] args) {
        int[] arr1 = { 6, 7, 6, 1, 4 };
        int[] arr2 = { 2, 5, 2, 8, 4 };

        Numbers n1 = new Numbers(arr1);
        Numbers n2 = new Numbers(arr2);

        System.out.println(n1.ok());
        System.out.println(n2.ok());
    }
}
