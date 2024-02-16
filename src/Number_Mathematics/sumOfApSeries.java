package Number_Mathematics;

public class sumOfApSeries {
    // naive
    // using the loops
    static double sum(double a,double d,int n){
        double sum = 0.0;
        for (int i = 1;i<=n;i++){
            sum = sum + a;
            a = a + d;
        }
        return sum;
    }
    // another
     static double sum2(double a, double d, int n) {
        double sum=0.0;
        for(int i=0;i<n;i++) {
            sum+=(a+(i*d));
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sum(1.5,3,5));
        System.out.println(sum2(1.5,3,5));
    }
}
