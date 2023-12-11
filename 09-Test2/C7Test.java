public class C7Test {
    public static void main(String[] args) {
        String[] ar = { "Warszawa", "Sopot", "Kielce", "Szczecin" };
        C7 p = new C7(ar);

        System.out.println(p.filter('S').cities());
    }
}
