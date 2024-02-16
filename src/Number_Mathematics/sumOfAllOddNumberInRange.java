package Number_Mathematics;
import java.util.*;
public class sumOfAllOddNumberInRange {

    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the lower range:");
      int x = sc.nextInt();
        System.out.println("Enter the upper range:");
      int y = sc.nextInt();
      int sum = 0;
        for (int i = x; i <=y ; i++) {
            if(i%2!=0){
                sum = sum + i;
            }
        }
        System.out.println(sum);
    }
}
