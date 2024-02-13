package NumberSystem;

public class sumOfGPseries {
    static double sum(int a , double ratio , int n){
        double result = (a * ( Math.pow(ratio, n) - 1) )/ (ratio - 1);
        return result;
    }
     static double SumOfGP(double a, double r, int n) {
        double sum = 0.0;
        for (int i = 0; i < n; i++) {
            sum += a;
            a = a * r;
        }
        return sum;
    }
    public static void main(String[] args) {
        System.out.println(sum(2,2,4));
        System.out.println(SumOfGP(2.0,2.0,4));
    }
}
