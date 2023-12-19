public class Tv implements CanOnOff, CanChangeChannel {
    boolean status;
    int channel=1;

    @Override
    public void off() {
        status = false;
        
    }

    @Override
    public void on() {
        status = true;
        channel = 1;
        
    }

    public void status(){
        if (status == true){
            System.out.println("włączony");
        } else {
            System.out.println("wyłączony");
        }
        if (status == true){
            System.out.println("kanal " + channel);
        }
    
    }

    @Override
    public void channelDown() {
        if(status == true){
            if(channel >1 && channel <=100){
                channel--;
            }
        }   
        
    }

    @Override
    public void channelUp() {
        if(status == true){
            if(channel >=1 && channel <100){
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

    

}
