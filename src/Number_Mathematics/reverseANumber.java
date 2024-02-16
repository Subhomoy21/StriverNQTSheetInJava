package Number_Mathematics;

public class reverseANumber {
    static int rev(int n){
        int temp = n;
        int reverse = 0;
        while(n!=0){
            int ld = n%10;
            reverse = reverse * 10 + ld;
            n = n/10;
        }
        return reverse;
    }
    public static void main(String[] args) {
        System.out.println(rev(548));
    }
}
