public class Smartphone {
    String marka;
    String model;
    int rocznik;
    String wlasciciel;
    double cena;
    
    void displayName(){
        System.out.println(marka);
    }
     void displayInfo(){
        System.out.println(marka+rocznik+wlasciciel+cena+model);
     }

}
