package Arrays;

import java.util.Arrays;

public class SecondLargestAndSecondSmallest {
    // naive solution which is not working for the duplicate numbers in array
    //Approach:
    //Sort the array in ascending order
    //The element present at the second index is the second smallest element
    //The element present at the second index from the end is the second largest element
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
    //Approach:
    //Find the smallest and largest element in the array in a single traversal
//    After this, we once again traverse the array and find an element that is just greater than the smallest element we just found.
//    Similarly, we would find the largest element which is just smaller than the largest element we just found
//    Indeed, this is our second smallest and second largest element.
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

    //Solution 3(Best Solution)
    //Intuition:
    //In the previous solution, even though we were able to bring down the time complexity to O(N), we still needed to do two traversals to find our answer. Can we do this in a single traversal by using smart comparisons on the go?
    //
    //Approach:
    //We would require four variables: small,second_small, large, and second_large. Variable small and second_small are initialized to INT_MAX while large and second_large are initialized to INT_MIN.
    //
    //Second Smallest Algo:
    //
    //If the current element is smaller than ‘small’, then we update second_small and small variables
    //Else if the current element is smaller than ‘second_small’ then we update the variable ‘second_small’
    //Once we traverse the entire array, we would find the second smallest element in the variable second_small.
    //Here’s a quick demonstration of the same.
    //Second Largest Algo:
    //
    //If the current element is larger than ‘large’ then update second_large and large variables
    //Else if the current element is larger than ‘second_large’ then we update the variable second_large.
    //Once we traverse the entire array, we would find the second largest element in the variable second_large.
    //Here’s a quick demonstration of the same.

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
