public class BankAccount {
    String imie;
    String nazwisko;
    boolean aktywne;
    double kwota;


    void changeStatus(){
        aktywne = !aktywne;
        System.out.println(aktywne);
    }
    void displayBank(){
        System.out.println(imie+nazwisko+kwota);
    }
}
