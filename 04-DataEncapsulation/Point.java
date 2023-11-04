public class Point {
    int x ;
    int y ;

    public Point(int x, int y){
        this.x=x;
        this.y=y;
    }
    public boolean isX(){
        return x==0;
    }
    public boolean isY(){
        return y==0;
    }
    public String toString(){
        return "P("+Integer.toString(x)+","+Integer.toString(y)+")";
    }
}
