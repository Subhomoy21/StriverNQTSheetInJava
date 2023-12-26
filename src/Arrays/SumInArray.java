package Arrays;
//Calculate Sum of the Elements of the Array
public class SumInArray {
    static int sum(int[]arr){
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        return sum;
    }
    public static void main(String[] args) {
        int[]arr = {1,2,1,2,1,2};
        System.out.println(sum(arr));
    }
}
