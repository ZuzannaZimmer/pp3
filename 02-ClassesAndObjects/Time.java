public class Time {
    public static void main(String[] args) {
        int hours = 14;
        int minutes = 11;
        int mFromM = hours*60+minutes;
        int sFromM = mFromM*60;


        System.out.printf(" time: %d:%d\n minutes from midnight: %d\n seconds from midnight: %d", hours,minutes,mFromM,sFromM);
    }
}
