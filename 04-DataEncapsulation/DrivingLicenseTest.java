public class DrivingLicenseTest {
    public static void main(String[] args) {
        // DrivingLicense dl = new DrivingLicense("Adam","Nowak","os. Krakowiaków 12", 34958, 85739839, 2023, "B");
        DrivingLicense dl = new DrivingLicense();
        dl.setName("adAm");
        dl.setSurname("Nowak");
        dl.setAdress("osiedle Krakowiaków");
        dl.setCode(23456);
        dl.setNumber(375932);
        dl.setYear(2023);
        dl.setCategory("B");
        System.out.println(dl.display());
        System.out.println(dl.toString());
        
    }
}
