package Number_Mathematics;
import java.util.Scanner;
public class printFirstNEvenNumbers {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        do {
            System.out.println("Enter the number that you want to enter");
            int n = sc.nextInt();
            for (int i = 1; i <=n ; i++) {
                System.out.print (2*i-2 + " ");
            }
            System.out.println();
        }
        while (true);
    }
}
