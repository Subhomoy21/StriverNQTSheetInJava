package NumberSystem;

import java.util.Scanner;

public class oddOrEven {
    public static void main(String[] args) {
        Scanner s  = new Scanner(System.in);
        do {
            int n = s.nextInt();
            if(n%2==0){
                System.out.println("The number is even.");
            }
            else if (n%2!=0){
                System.out.println("The number is odd.");
            }
            else{
                System.out.println("Can't discover");
            }
        }
        while (true);

    }
}
