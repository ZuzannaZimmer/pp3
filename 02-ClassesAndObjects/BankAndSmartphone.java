public class BankAndSmartphone {
    public static void main(String[] args) {
        Smartphone s = new Smartphone();
        s.cena = 1500.60;
        s.marka = "Samsung";
        s.model = "5A";
        s.rocznik = 2020;
        s.wlasciciel = "Adam Nowak";

        s.displayInfo();
        s.displayName();


        BankAccount b = new BankAccount();
        b.aktywne= false;
        b.imie = "Aneta";
        b.kwota = 74385.43;
        b.nazwisko = "Nowak";
        
        b.changeStatus();
        b.displayBank();
         
    }
}
