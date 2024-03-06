package String;

public class CheckIfTheGivenStringIsPalindromeOrNot {
    static boolean isPalindrome(String s){
        int n = s.length();
        int left = 0;
        int right = n-1;
        while(right >= left){
            if(s.charAt(right) != s.charAt(left)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    public static void main(String[] args) {
        String str = "ABCDCBA";
        System.out.println(isPalindrome(str));
    }
}
