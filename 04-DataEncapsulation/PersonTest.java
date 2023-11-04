public class PersonTest {
    public static void main(String[] args) {
        
    Person p = new Person("Alicja", 12);
    Person e = new Person("Adam", 20);

        System.out.println(p.isAdult());
        System.out.println(e.isAdult());
        System.out.println(p.toString());
        System.out.println(e.toString());

   } 
}
