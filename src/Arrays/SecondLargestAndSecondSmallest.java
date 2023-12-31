package Arrays;

import java.util.Arrays;

public class SecondLargestAndSecondSmallest {
    // naive solution which is not working for the duplicate numbers in array
    static void secLargestSmallest(int []arr){
        int n = arr.length;
        if(n==0 || n==1){
            System.out.println(-1); ;
        }
        Arrays.sort(arr); // sort ho jane se order wise arrange hojayega na
        int sec_Smallest = arr[1];
        int sec_Largest = arr[n-2];
        System.out.println(sec_Largest);
        System.out.println(sec_Smallest);
    }
    // better solution
    public static void main(String[] args) {
        int [] arr = {1,2,3,6,8};
        secLargestSmallest(arr);
    }
}
