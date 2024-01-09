public class LogicTest {
    public static void main(String[] args) {
        boolean[] arr1 = { true, false, false };
        boolean[] arr2 = { true, false, true, false };
        boolean[] arr3 = { true, false, true, true, false, true, false, true, false };
        Logic l1 = new Logic(arr1);
        Logic l2 = new Logic(arr2);
        Logic l3 = new Logic(arr3);

        System.out.println(l1.opposite());
        System.out.println(l2.opposite());
        System.out.println(l3.opposite());
    }
}
