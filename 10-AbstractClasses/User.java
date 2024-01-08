public class User {
    private String firstName;
    private String lastName;
    private String email;
    private String pnumber;
    
    public User(String firstName, String lastName, String email, String pnumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.pnumber = pnumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public String getPnumber() {
        return pnumber;
    }

    
}
