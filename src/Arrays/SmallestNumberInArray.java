package Arrays;
//Find the smallest element in an array
public class SmallestNumberInArray {
    static int smallestNum(int[]arr){
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] < min){
                min = arr[i];
            }
        }
        return min;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,5,4,2};
        System.out.println(smallestNum(arr));
    }
}
