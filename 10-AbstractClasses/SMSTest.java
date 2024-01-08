public class SMSTest {
    public static void main(String[] args) {
        User user1 = new User("John", "Doe", "john.doe@example.com", "1234567890");
        User user2 = new User("Jane", "Smith", "jane.smith@example.com", "9876543210");

        // Create and send two SMS messages using User objects
        SMS sms1 = new SMS(user1, "Hello, how are you?");
        SMS sms2 = new SMS(user2, "Meeting at 2 PM");

        // Create and send two Email messages using User objects
        Email email1 = new Email("Meeting Tomorrow", "Don't forget the meeting at 10 AM.", user1);
        Email email2 = new Email("Project Update", "Here's the latest project update.", user2);

        // Display message details
        sms1.send();
        sms2.send();
        email1.send();
        email2.send();
    }
}
