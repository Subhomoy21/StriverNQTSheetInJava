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
    static void secLargestSmallest2(int [] arr){
        int small = Integer.MAX_VALUE;
        int secSmall = Integer.MAX_VALUE;
        int large = Integer.MIN_VALUE;
        int secLarge = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            small = Math.min(small,arr[i]);
            large = Math.max(large,arr[i]);
        }
        for (int i = 0; i < arr.length; i++) {
          if(arr[i] > secLarge && arr[i] != large){
              secLarge = arr[i];
          }
          if(arr[i] < secSmall && arr[i] != small){
              secSmall = arr[i];
          }
        }
        System.out.println("The secondSmallest number is " + secSmall);
        System.out.println("The secondLargest number is " + secLarge);
    }
    // optimal solution
    static int secLargest(int [] arr){
        int large = Integer.MIN_VALUE;
        int secLarge = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > large){
                secLarge = large;
                large = arr[i];
            }
            else if(arr[i] > secLarge && arr[i] != large){
                secLarge = arr[i];
            }
        }
        return secLarge;
    }
    static int secSmallest(int []arr){
        int small = Integer.MAX_VALUE;
        int secSmall = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]<small){
                secSmall = small;
                small = arr[i];
            }
            else if(arr[i]<secSmall && arr[i] != small){
                secSmall = arr[i];
            }
        }
        return secSmall;
    }
    public static void main(String[] args) {
        int [] arr = {1,2,3,6,8};
        secLargestSmallest(arr);
        secLargestSmallest2(arr);
        System.out.println(secLargest(arr));
        System.out.println(secSmallest(arr));
    }
}
