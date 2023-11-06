public class Clock2Test {
    public static void main(String[] args) {
        
    
    Clock2 clock = new Clock2();
    Clock2 clock2 = new Clock2();

    clock.setHour(12);
    clock.setMinute(30);
    clock2.setHour(23);
    clock2.setMinute(59);
    
    clock.addOneMinute();
    clock2.addOneMinute();

    System.out.println(clock.getHour()+" "+clock.getMinute());
    System.out.println(clock2.getHour()+" "+clock2.getMinute());
}
}
