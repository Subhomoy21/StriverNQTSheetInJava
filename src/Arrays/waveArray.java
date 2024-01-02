package Arrays;
//Given a sorted array arr[] of distinct integers. Sort the array into a wave-like array(In Place).
//In other words, arrange the elements into a sequence such that arr[1] >= arr[2] <= arr[3] >= arr[4] <= arr[5].....
//If there are multiple solutions, find the lexicographically smallest one.
//Note:The given array is sorted in ascending order, and you don't need to return anything to make
// changes in the original array itself.
//Example 1:
//Input:
//n = 5
//arr[] = {1,2,3,4,5}
//Output: 2 1 4 3 5
//Explanation: Array elements after sorting it in wave form are 2 1 4 3 5.
public class waveArray {
   static void waveArray(int [] arr){
       int i = 1;
       int n = arr.length;
       while(i<n){
           // swap arr[i] and arr[i-1]
           int temp = arr[i];
           arr[i] = arr[i-1];
           arr[i-1] = temp;
           i = i+2;
       }
     //  System.out.println(arr + " ");
   }
    public static void main(String[] args) {
            int [] arr = {2,4,7,8,9,10};
            waveArray(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
