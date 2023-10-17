public class Student {
    String name;
    int age;
    int idCard;
    boolean idCardValid;
    int semester;
    double grade;

    void sayHello(){
        System.out.println("Hello from "+name);
}

    void displayName(){
        System.out.println(name);

    }

    void displayAge(){
        System.out.println(age);

    }

    void displayInfo(){
        System.out.println(name+semester+grade);
    
    }

    void changeStatus(){
        //idCardValid = idCardValid ? false : true;
        idCardValid = !idCardValid;
    }
}
