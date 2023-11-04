public class Counter {
    private static int i = 0;

    public int value(){
        return i;
    }
    public void increase(){
        i++;
    }
    public void decrease(){
        i--;
    }
    public void increase(int n){
        i=i+n;
    }
    public void decrease(int n){
        i=i-n;
    }
}
