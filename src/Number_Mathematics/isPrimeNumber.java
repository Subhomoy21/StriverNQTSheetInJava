package Number_Mathematics;

import java.util.Scanner;

public class isPrimeNumber {
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
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        do {
            int n = sc.nextInt();
            System.out.println(isPrimeOrNot(n));
        }
        while(true);

    }
}
