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
    static double cuboid(double a, double b, double c){

        return (a*b*2+a*c*2+b*c*2);
    }
    static double sphere(int radius){

        return 4*Math.PI*Math.pow(radius,2);
    }
    static double cone(int radius, int l){

        return Math.PI*Math.pow(radius,2)+Math.PI*l*radius;
    }
}
