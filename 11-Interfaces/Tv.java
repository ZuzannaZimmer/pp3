import java.util.ArrayList;

public class Tv implements CanOnOff, CanChangeChannel, CanChangeVolume {
    boolean status;
    int channel=1;
    int volume=1;
    ArrayList<String> channels = ("k1", "k2", "k3", "k4", "k5", "k6", "k7", "k8", "k9", "k10")

    @Override
    public void off() {
        status = false;
        
    }

    @Override
    public void on() {
        status = true;
        channel = 1;
        volume = 1;
        
    }

    public void status(){
        if (status == true){
            System.out.println("włączony");
        } else {
            System.out.println("wyłączony");
        }
        if (status == true){
            System.out.println("kanal " + channel);
            System.out.println("poziom głośności: "+ volume);
        }
    
    }

    @Override
    public void channelDown() {
        if(status == true){
            if(channel >1 && channel <=10){
                channel--;
            }
        }   
        
    }

    @Override
    public void channelUp() {
        if(status == true){
            if(channel >=1 && channel <10){
                    channel++;
                    }

        }
        
        
    }

    @Override
    public void setChannel(int channelNo) {
        if(status == true){
            if (channelNo >=1 && channelNo <=100){
            channel = channelNo;
            }
        }
    }

    @Override
    public void volumeDown() {
        if(status == true){
            if(volume >1 && volume <=10){
                volume--;
            }
        }
    }

    @Override
    public void volumeUp() {
        if(status == true){
            if(volume>=1 && volume <10){
                volume++;
            }
        }
        
    }
    
    

}
