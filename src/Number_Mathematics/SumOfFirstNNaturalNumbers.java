package Number_Mathematics;

public class SumOfFirstNNaturalNumbers {
    // naive solution
    static int sum1(int n){
        int sum = 0;
        for (int i = 1; i <= n ; i++) {
            sum = sum + i;
        }
        return sum;
    }
    // optimal solution
    static int sum2(int n){
        int sum = (n * (n+1))/2;
        return sum;
    }
    public static void main(String[] args) {
        System.out.println(sum1(5));
        System.out.println(sum2(5));
    }
}
