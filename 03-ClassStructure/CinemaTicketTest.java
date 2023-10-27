public class CinemaTicketTest {
    public static void main(String[] args) {
        // CinemaTicket kino = new CinemaTicket();
        // kino.filmTitle = "Ratatuj";
        // kino.price = 15;
        // kino.row = 3;
        // kino.seat = 32;
        // System.out.println(kino.toString());
        CinemaTicket ticket1 = new CinemaTicket("Gladiator", 2, 5);
        CinemaTicket ticket2 = new CinemaTicket("Gladiator", 7, 10);

        System.out.println(ticket1.toString());
        System.out.println(ticket2.toString());
    }
    
}
