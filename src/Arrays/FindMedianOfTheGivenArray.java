package Arrays;

import java.util.Arrays;

public class FindMedianOfTheGivenArray {
    static double median(int [] arr){
        int n = arr.length;
        Arrays.sort(arr);
        if(n%2==0){
            int mid1 = (n/2) - 1;
            int mid2 = n/2;
            return (double)(arr[mid1] + arr[mid2])/2;
        }
        else{
            return (double)arr[n/2];
        }
    }
    public static void main(String[] args) {
        int arr[]= {2, 5, 1, 7};
        System.out.println(median(arr));
    }
}
