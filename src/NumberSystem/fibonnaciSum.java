package NumberSystem;

public class fibonnaciSum {
    static long fibSum(long N){
        //code here
        if(N==0){
            return 0;
        }
        if(N==1){
            return 1;
        }
        long mod = 1000000007;
        long sum = 1; // a=0 b = 1 sum = 0+1 = 1
        long a = 0;
        long b = 1;
        for(long i = 2 ; i<=N ;i++){
            long c = a%mod + b%mod;
            sum = (sum + c)%mod;
            a = b;
            b = c;
        }
        return sum % mod;
    }
    public static void main(String[] args) {
        System.out.println(fibSum(5));
    }
}
