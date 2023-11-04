import java.time.Year;

public class DrivingLicense {
    private String name;
    private String surname;
    private String adress;
    private int code;
    private int number;
    private int year;
    private String category;

    // public DrivingLicense(String name, String surname, String adress, int code, int number, int year, String category) {
    //     this.name = name;
    //     this.surname =surname;
    //     this.adress=adress;
    //     this.code=code;
    //     this.number=number;
    //     this.year=year;
    //     this.category=category;
    // }

    public void setName(String name){
        // String nameup =name.substring(0, 1).toUpperCase();
        // String namelo = name.substring(1).toLowerCase();
        // this.name=nameup.concat(namelo);
        this.name = name.substring(0, 1).toUpperCase() + name.substring(1).toLowerCase();
    }
    public String getName(){
        return this.name;
    }

    public void setSurname(String surname){
        this.surname=surname;
    }
    public String getSurname(){
        return this.surname;
    }

    public void setAdress(String adress){
        this.adress=adress;
    }
    public String getAdress(){
        return this.adress;
    }

    public void setCode(int code){
        this.code=code;
    }
    public int getCode(){
        return this.code;
    }

    public void setNumber(int number){
        this.number=number;
    }
    public int getNumber(){
        return this.number;
    }
    
    public void setYear(int year){

        Year currentYear = Year.now();
        int yearValue = currentYear.getValue();
        if (year>=1980 && year <= yearValue){
           this.year=year;
        } else {
            this.year = 0000;
        }
        
    }
    public int getYear(){
        return this.year;
    }

    public void setCategory(String category){
        this.category=category;
    }
    public String getCategory(){
        return this.category;
    }

    // public String display() {
    //     return String.format("Imię i nazwisko kierowcy: %s %s, adres zamieszkania i kod pocztowy: %s %d, numer prawa jazdy: %d, rok wydania: %d, kategoria: %s ", name, surname, adress, code, number, year, category);
    // }
    public String display() {
        return String.format("Imię i nazwisko kierowcy: %s %s, adres zamieszkania i kod pocztowy: %s %d, numer prawa jazdy: %d, rok wydania: %d, kategoria: %s ", name, surname, adress, code, number, year, category);
    }

    public String toString(){
         return "Driving License Information:" +
        "\nName: " + getName() +
        "\nSurname: " + getSurname() +
        "\nAddress: " + getAdress() +
        "\nCode: " + getCode() +
        "\nNumber: " + getNumber() +
        "\nYear: " + getYear() +
        "\nCategory: " + getCategory();
    }
}

