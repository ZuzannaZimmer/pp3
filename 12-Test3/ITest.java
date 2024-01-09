public class ITest {
    public static void main(String[] args) {

        System.out.println(Isogram.isogram("red sun")); // Output: true
        System.out.println(Isogram.isogram("blue water")); // Output: false
        System.out.println(Isogram.isogram("BLUE water")); // Output: true
        System.out.println(Isogram.isogram("my blue water")); // Output: false
    }
}
