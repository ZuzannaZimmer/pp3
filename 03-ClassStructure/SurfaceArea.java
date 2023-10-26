public class SurfaceArea {
    static float rectangle(float a, float b){
        return a*b;
    }

    static double circle(int radius){
        
        return Math.PI*Math.pow(radius,2);
    }

    static double triangle(double a, double b){

        return (a*b)/2;
    }
}
