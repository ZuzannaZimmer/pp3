public class C3Test {
    public static void main(String[] args) {
        Person person3 = new Person("Ala", 13);
        Person person1 = new Person("John", 25);
        Person person2 = new Person("Jane", 30);

        Person[] familyMembers = { person1, person2, person3 };

        C3 f = new C3(familyMembers);
        System.out.println(f.adults());
    }
}
