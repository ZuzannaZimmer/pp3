public class Bank {
    public static void main(String[] args) {
        double buy = 4.5940;
        double sell = 4.6250;
        double spread = sell-buy;

        System.out.printf("Bank buys EUR: %.4f \nBank sells EUR: %.4f \nSpread: %.4f", buy, sell, spread);
    }
}
