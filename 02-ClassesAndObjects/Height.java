public class Height{

public static void main(String[] args) {
    double height = 175;
    double feet = (height/30.48);
    double inches = (height/ 2.54);

    System.out.println("I am "+(height)+"cm tall, i.e. "+Math.round(feet)+
    " feet and "+Math.round(inches)+" inches");
}

}