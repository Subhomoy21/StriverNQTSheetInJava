package NumberSystem;

import java.util.Scanner;

public class posNegNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n<0){
            System.out.println("negative number");
        }
        else{
            System.out.println("positive number");
        }
    }
}
