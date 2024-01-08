public class SMS extends Message{
    private User user;

    public SMS( User user, String text) {
        super(text);
        this.user = user;
    }

    public User getUser() {
        return user;
    }

    public void setNumber(User user) {
        this.user = user;
    }

    @Override
    public void send() {
        System.out.println("Sending SMS to " + user.getPnumber() + ":");
        System.out.println("Message: " + getText());
        System.out.println("Number of characters: " + charNumber());
        System.out.println("SMS sent successfully!\n");
    }
    
    
    

}
