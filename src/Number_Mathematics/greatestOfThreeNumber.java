package Number_Mathematics;

import java.util.Scanner;

public class greatestOfThreeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b  = sc.nextInt();
        int c = sc.nextInt();
        int res = Math.max(a,b);
        int res1 = Math.max(res,c);
        System.out.println(res1);
        if(a>b && a>c){
            System.out.println("A is greatest");
        }
        else if (b>a && b>c){
            System.out.println("B is greatest");
        }
        else{
            System.out.println("C");
        }
    }
}
