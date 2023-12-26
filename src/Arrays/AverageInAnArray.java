package Arrays;
// Average of all the elements in the array
public class AverageInAnArray {
    static double averageInArray(int[]arr){
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        return sum/arr.length;
    }
    public static void main(String[] args) {
        int[]arr = {1,2,4,6,6};
        System.out.println(averageInArray(arr));
    }
}
