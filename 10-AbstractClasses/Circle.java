import java.lang.Math;

public class Circle extends Shape {
    private double r;

    public Circle(double r){
        this.r=r;
    }

    @Override
    public double area() {
        double d;
        d= (r*r)*Math.PI;
        return d;
    }

    @Override
    public double perimeter() {
        double d;
        d=2*Math.PI*r;
        return d;
    }

    
}
