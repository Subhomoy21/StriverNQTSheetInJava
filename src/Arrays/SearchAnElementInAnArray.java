package Arrays;

public class SearchAnElementInAnArray {
    static boolean linearSearch(int[]arr, int k){ //O(n)
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == k){
                return true;
            }
        }
        return false;
    }
    static int binarySearch(int[]arr,int k){
        int low = 0;
        int high = arr.length-1;
        while(high>=low){
            int mid = low + (high - low)/2;
            if(arr[mid] == k){
                return mid;
            }
            else if(k>arr[mid]){
                low = mid + 1;
            }
            else{
                high  = mid -1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,9,4,8,6,6};
        System.out.println(linearSearch(arr,4));
        System.out.println(binarySearch(arr,6));
    }
}
