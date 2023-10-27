public class PersonTest {
    public static void main(String[] args) {
        
        Person p1 = new Person("Zuzia", 50, 160);
        Person p2 = new Person("Damian", 80, 180);
        Person p3 = new Person("Grzegorz");
        p3.setWeightAndHeight(100, 190);

        p1.displayRecord();
        p2.displayRecord();
        p3.displayRecord();
    }
}
