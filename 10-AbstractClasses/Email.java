public class Email extends Message{
    private String subject;
    private User recipient;
    
    
    public Email(String subject, String content, User recipient) {
    
        super(content);
        this.subject = subject;
        this.recipient = recipient;
    }

    
    public String getSubject() {
        return subject;
    }

    
    public void setSubject(String subject) {
        this.subject = subject;
    }

    
    public User getRecipient() {
        return recipient;
    }

    
    public void setRecipient(User recipient) {
        this.recipient = recipient;
    }

    @Override
    public void send() {
        System.out.println("Sending Email to " + recipient.getEmail() + " (" + recipient.getFirstName() + " " + recipient.getLastName() + "):");
        System.out.println("Subject: " + subject);
        System.out.println("Message: " + getText());
        System.out.println("Number of characters: " + charNumber());
        System.out.println("Email sent successfully!\n");
    }
    
}
