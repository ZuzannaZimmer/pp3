public class Degrees {

    static double celsiusToKelvin(double c){
        return c+273.15;
    }
    static double celsiusToFahrenheit(double c){
        return c*(9/5)+32;
    }
    static double kelvinTocelsius(double k){
        return k-273.15;
    }
    static double fahrenheitTocelsius(double f){
        return (f-32)/(9/5);
    }
}
