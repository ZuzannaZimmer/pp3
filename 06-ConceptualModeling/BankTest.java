public class BankTest {
    public static void main(String[] args) {
        Bank b = new Bank("Amelia", "Guzik", 200);

        b.deposit(500);
        System.out.println(b.displayStatus());
        b.deposit(200);
        System.out.println(b.displayStatus());
        b.withdraw(400);
        System.out.println(b.displayStatus());

    }
}
