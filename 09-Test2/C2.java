import java.util.*;

public class C2 {

    static int sum1 = 0;
    static int sum2 = 0;

    public static boolean arr(int[] arr1, int[] arr2) {

        ArrayList<Integer> a1 = new ArrayList<Integer>();
        ArrayList<Integer> a2 = new ArrayList<Integer>();

        for (int i = 0; i < arr1.length; i++) {
            a1.add(arr1[i]);
        }
        for (int j = 0; j < arr2.length; j++) {
            a2.add(arr2[j]);
        }

        for (int k : a1) {
            if (k >= 10 && k < 100) {
                sum1 = sum1 + 1;
            }
        }
        for (int l : a2) {
            if (l >= 10 && l < 100) {
                sum2 = sum2 + 1;
            }
        }
        if (sum1 == sum2) {
            return true;
        } else {
            return false;
        }

    }

}
