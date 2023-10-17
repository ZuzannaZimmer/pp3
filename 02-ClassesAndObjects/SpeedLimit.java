public class SpeedLimit {
    public static void main(String[] args) {

        int autoSpeed = 170;

        
        if (autoSpeed < 40 || autoSpeed > 140){
            System.out.println("Vehicle speed: " +autoSpeed+ "\nSpeed is valid: False");

        } else {System.out.println("Vehicle speed: " +autoSpeed+ "\nSpeed is valid: True");


        }
    }
}
