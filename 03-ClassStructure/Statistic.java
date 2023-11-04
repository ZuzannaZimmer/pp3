public class Statistic {
    
    static int numberOfItem(int a,int b){
        int sum=0;
        for( int i = a; i<b; i++){
            sum++;
        }
        return sum;    
    }
    static int sumOfNumbers(int a, int b){
        int sum=0;
        for ( int i=a; i<=b;i++){
            sum=sum+i;
        }
        return sum;
    }
    static double arithmetic(double a, double b){
        double sum1=0;
        for (double i=a; i<b;i++){
            sum1++;
        }       
        double sum2=0;
        for ( double i=a; i<=b;i++){
            sum2=sum2+i;
        }
        return sum2/sum1 ;
    }
    

}

