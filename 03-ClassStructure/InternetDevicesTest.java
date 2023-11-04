public class InternetDevicesTest {
    public static void main(String[] args) {
       
        
    // Istnieje wiele urządzeń, które mogą korzystać z Internetu: komputer osobisty, laptop, tablet, smartfon, radio internetowe czy telewizor. Zdefiniuj klasę InternetDevice w celu opisania takich urządzeń. Klasa powinna zawierać atrybuty: name (nazwa urządzenia), connected (czy urządzenie jest podłączone do Internetu) oraz connectedDevices (liczba podłączonych urządzeń - pole statyczne). Dodaj konstruktor InternetDevice(name) i metody do manipulowania urządzeniami: connect(), disconnect(), isConnected(), displayStatus(), displayConnections() (metoda statyczna). Następnie napisz program, który tworzy pięć różnych urządzeń internetowych, z których trzy są podłączone do Internetu. Wyświetla stan każdego urządzenia i informacje o liczbie urządzeń podłączonych do Internetu.

      InternetDevice laptop = new InternetDevice("laptop");
      InternetDevice klawiatura = new InternetDevice("klawiatura");
      InternetDevice lodowka = new InternetDevice("lodowka");
      InternetDevice telewizor = new InternetDevice("telewizor");
      InternetDevice odkurzacz = new InternetDevice("odkurzacz");

        laptop.connect();
        telewizor.connect();
        lodowka.connect();

        laptop.displayStatus();
        klawiatura.displayStatus();
        lodowka.displayStatus();
        telewizor.displayStatus();
        odkurzacz.displayStatus();

        InternetDevice.displayConnections();

    }  
}
