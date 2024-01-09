public class C7Test {
    public static void main(String[] args) {
        String[] c = { "Warszawa", "Sopot", "Kielce", "Szczecin" };
        C7 p = new C7(c);

        System.out.println(p.filter('S').cities());

    }
}
