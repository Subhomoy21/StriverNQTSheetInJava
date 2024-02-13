package NumberSystem;

public class PrimeNumbersInAGivenRange {
    static boolean isPrimeOrNot(int n){
        if(n==0 || n==1) return false;
        if(n==2 || n==3) return true;
        if(n%2==0 || n%3==0) return false;
        for (int i = 5; i * i <= n ; i=i+6) {
            if(n%i==0 || n%(i+2)==0){
                return false;
            }
        }
        return true;
    }
    static void primeInRange(int a,int b){
        for (int i = a; i <=b ; i++) {
            if(isPrimeOrNot(i)){
                System.out.println("The number " + i + " is prime");
            }
            else{
                System.out.println("The number " + i + " is not-prime");
            }
        }
    }
    public static void main(String[] args) {
        primeInRange(2,10);
    }
}
