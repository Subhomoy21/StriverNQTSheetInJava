package Arrays;
// Reverse a given Array
public class ReverseAnArray {
    static void Array(int[]arr){
        System.out.println("The Reverse Array is:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    static void reverseArray(int[]arr){
        int start = 0;
        int end = arr.length-1;
        while(end>start){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        Array(arr);
    }
    public static void main(String[] args) {
        int[]arr = {4,5,6,8,6,9,6,5};
         reverseArray(arr);
    }
}
