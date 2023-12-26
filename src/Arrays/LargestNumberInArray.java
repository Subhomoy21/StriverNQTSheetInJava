package Arrays;

public class LargestNumberInArray {
    static int large(int[]arr){
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>max){
                max = arr[i];
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int [] arr = {5,6,9,8,5,6,45};
        System.out.println(large(arr));
    }
}
