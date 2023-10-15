import java.net.SocketPermission;

public class Time {
    public static void main(String[] args) {

        int hour = 17;
        double minute = 10;
        int second =20;
        double wholeDay = 24.00;
        double dminute = minute;
        double currentHour = hour + dminute / 60;
        System.out.println("The current time is "+hour+":"+minute+":"+second);
        System.out.println("Number of seconds since midnight: "+ (hour*3600+minute*60+second));
        System.out.println("Number of seconds remaining in the day: "+((24-17)*3600-(minute*60)-second));
        System.out.println(currentHour*100/wholeDay+"%");

    }
}
