public class C6Test {
    public static void main(String[] args) {
        C6 p = new C6(4, 150);

        for (int x : p.spec()) {
            System.out.println(x);
        }
    }
}
