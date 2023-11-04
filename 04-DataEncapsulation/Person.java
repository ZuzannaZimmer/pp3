public class Person {
    private String name;
    private int age;

    public Person(String name, int age){
        setName(name);
        setAge(age);
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public int getAge(){
        return this.age;
    }
    public boolean isAdult(){
        return (getAge()>=18);
    }
    public String toString(){
        return getName()+","+getAge();
    }
}
