public class Triangle extends Shape{
    private double h;
    private double a;
    private double b;
    private double c;

    public Triangle(double h, double a, double b, double c){
        this.h=h;
        this.a=a;
        this.b=b;
        this.c=c;
    }

    @Override
    public double area() {
        double b;
        b= (a*h)/2;
        return b;
    }

    @Override
    public double perimeter() {
        
        return a+b+c;
    }
    
}
