public class StudentTest {    
    public static void main(String[] args) {
        
        // object creation
        Student s = new Student();
        
        // object manipulation
        s.name = "Peter";
        s.age = 21;
        System.out.println(s.name + " " + s.age);

        Student s2 = new Student();

        s2.name = "Daria";
        s2.age = 23;
        System.out.println(s2.name + " " + s2.age);

        Student s3 = new Student();

        s3.name = "Kamila";
        s3.age = 25;
        System.out.println(s3.name + " " + s3.age);

    }
}
