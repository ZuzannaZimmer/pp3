public class CinemaTicket {
    static String cinemaName = "Morning Star Cinema";
    String filmTitle;
    int row;
    int seat;
    int price;


    public String toString() {

     return cinemaName +" "+ filmTitle +" row "+ row + " seat "+ seat + " price " + price;
    }

    public CinemaTicket(String filmTitle, int row, int seat){
        this.filmTitle = filmTitle;
        this.seat = seat;
        this.row = row;
        this.price = (row<=2) ? 10 : 25;

    }

}


