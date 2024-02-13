package NumberSystem;

public class factorialOfANumber {
    // iterative
    static int factorialIterative(int n){
        int ans = 1;
        for (int i = 1; i <=n ; i++) {
            ans = ans * i;
        }
        return ans;
    }
    // recursive
    static int factorialRecursive(int n){
        if(n==0 || n==1){
            return n;
        }
        return n * factorialRecursive(n-1);
    }
    public static void main(String[] args) {
        System.out.println(factorialIterative(5));
        System.out.println(factorialRecursive(5));
    }
}
