package Arrays;
import java.util.Arrays;
public class RearrangeArrayInIncreasingDecreasingOrder {
    // naive solution
    static void rArrInIncDec(int[] arr){
        Arrays.sort(arr);
        for (int i = 0; i < (arr.length)/2; i++) {
            System.out.print(arr[i] + " ");
        }
        for (int i = arr.length - 1; i >= (arr.length)/2 ; i--) {
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args) {
        int [] arr = {5,4,7,8,1,2,3,9};
        rArrInIncDec(arr);
    }
}
