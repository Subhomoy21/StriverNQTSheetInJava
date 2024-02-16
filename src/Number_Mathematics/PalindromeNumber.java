package Number_Mathematics;
//Check if a number is Palindrome or Not
public class PalindromeNumber {
    static boolean IsPalindrome(int n){
        boolean check = false;
        int num = n;
        int rev = 0;
        while(n>0){
            //extracting the last digit
            int ld = n%10;
            //Appending last digit
            rev = rev*10 + ld;
            //  Shrinking X by discarding the last digit
            n = n/10;
        }
        if(rev == num){
            check = true;
            return check;
        }
        return check;
    }
    public static void main(String[] args) {
        System.out.println(IsPalindrome(00000000000));
    }
}
