
public class Bank {
    private String name;
    private String surname;
    private int balance;
    
//     +displayStatus(): int
// +displayOwner(): string
// +changeBalance(int): int
    public Bank(String name, String surname, int balance){
        this.name = name;
        this.surname = surname;
        this.balance = balance*100;
    }

    public String displayStatus(){
        return String.format("balans: %d", balance/100);
    }

    public String displayOwner(){
        return name+" "+surname;
    }

    public void deposit(int deposit){
        balance = balance + deposit*100;
    }

    public void withdraw(int withdraw){
        if (withdraw<=500){
            if (withdraw<(balance/100)){
                balance = balance - withdraw*100;
            } else { System.out.println("Brak środków na koncie");}
        } else { System.out.println("Za duża kwota");}

    }
}
