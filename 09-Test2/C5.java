public class C5 extends Counter {

    public C5(int c) {
        super(c);
    }

    public void addN(int n) {

        for (int i = 0; i < n; i++) {
            add1();
        }

    }

    public int dis() {
        return getCounter();
    }
}
