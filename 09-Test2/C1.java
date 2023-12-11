import java.util.*;

public class C1 {
    private int[] arr = new int[5];

    public C1(int[] arr) {
        this.arr = arr;
    }

    public boolean different() {

        ArrayList<Integer> arrr = new ArrayList<Integer>();
        for (int i = 0; i < 5; i++) {
            arrr.add(arr[i]);
        }

        for (int j = 0; j < 5; j++) {
            int a = arrr.get(j);
            arrr.remove(j);
            if (arrr.contains(a)) {
                return false;
            }
            arrr.add(j, a);

        }
        return true;
    }

}
