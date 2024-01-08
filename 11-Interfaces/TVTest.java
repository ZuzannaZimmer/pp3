public class TVTest {
    public static void main(String[] args) {
       Tv t = new Tv();
       t.off();
    //    t.status();
       t.on();
    //    t.status(); 
       t.setChannel(20);
    //    t.status();
       t.channelDown();
        // t.status();
        t.channelUp();
        // t.status();
        t.volumeDown();
        t.status();
        t.volumeUp();
        t.status();


       
    }
}
