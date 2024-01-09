public class Person {
    private String fname;
    private String lname;

    public Person(String fname, String lname) {
        this.fname = fname;
        this.lname = lname;
    }

    @Override
    public String toString() {
        String s = "";
        s = s + fname.charAt(0) + lname.charAt(0);
        s = s.toUpperCase();
        return s;

    }

}