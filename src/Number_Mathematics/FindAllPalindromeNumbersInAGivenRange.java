package Number_Mathematics;

import java.util.Scanner;

public class FindAllPalindromeNumbersInAGivenRange {
    static boolean isPalindrome(int n){
        boolean check = false;
        int rev = 0;
        int temp = n;
        while(n>0){
            int ld = n%10;
            rev = rev*10 + ld;
            n = n/10;
        }
        if(rev == temp){
            check = true;
            return check;
        }
        return check;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("The number from the minimum range");
            int min = sc.nextInt();
            System.out.println("The number from the maximum range");
            int max = sc.nextInt();
            for (int i = min; i <=max ; i++) {
                if(isPalindrome(i)){
                    System.out.print(i + " ");
                }
            }
            System.out.println();
        }
        while (true);
    }
}
