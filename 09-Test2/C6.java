public class C6 extends Vehicle {

    private int maxSpeed;

    public C6(int s, int maxSpeed) {
        super(s);
        this.maxSpeed = maxSpeed;
    }

    public int[] spec() {
        int[] a = { getSeats(), maxSpeed };
        return a;
    }
}
