import java.util.ArrayList;

public class Tv implements CanOnOff, CanChangeChannel, CanChangeVolume {
    boolean status;
    int channel = 1;
    int volume = 1;
    ArrayList<String> channels = new ArrayList<String>();
    String[] ch = { "k1", "k2", "k3", "k4", "k5", "k6", "k7", "k8", "k9", "k10" };

    public Tv() {
        for (int i = 0; i < ch.length; i++) {
            channels.add(ch[i]);
        }
    }

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

    public void status() {
        if (status == true) {
            System.out.println("włączony");
        } else {
            System.out.println("wyłączony");
        }
        if (status == true) {
            System.out.println("kanal " + channel + " " + channels.get(channel - 1));
            System.out.println("poziom głośności: " + volume);
        }

    }

    @Override
    public void channelDown() {
        if (status == true) {
            if (channel > 1 && channel <= 10) {
                channel--;
            }
        }

    }

    @Override
    public void channelUp() {
        if (status == true) {
            if (channel >= 1 && channel < 10) {
                channel++;
            }

        }

    }

    @Override
    public void setChannel(int channelNo) {
        if (status == true) {
            if (channelNo >= 1 && channelNo <= 100) {
                channel = channelNo;
            }
        }
    }

    @Override
    public void volumeDown() {
        if (status == true) {
            if (volume > 1 && volume <= 10) {
                volume--;
            }
        }
    }

    @Override
    public void volumeUp() {
        if (status == true) {
            if (volume >= 1 && volume < 10) {
                volume++;
            }
        }

    }

    @Override
    public void channelList() {
        String s = "";
        for (int j = 0; j < 10; j++) {
            s = s + String.format("%d %s", j + 1, channels.get(j) + '\n');
        }
        System.out.println(s);
    }

}
