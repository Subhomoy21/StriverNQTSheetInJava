package Arrays;

public class equilibriumIndexInArray {
     // naive solution (O(n)^2)
    static int findEqui(int [] arr){
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            int lSum = 0;
            for (int j = 0; j < i; j++) {
                lSum = lSum + arr[j];
            }
            int rSum = 0;
            for (int j = i+1; j <n ; j++) {
                rSum = rSum + arr[j];
            }
            if(rSum == lSum){
                return i;
            }
        }
        return -1;
    }
    // optimize solution!
     static int findEquilibriumIdx(int nums[], int n) {
        int totalSum = 0;
        for (int i = 0; i < n; i++) {
            totalSum += nums[i];
        }
        int leftSum = 0, rightSum = totalSum;
        for (int i = 0; i < n; i++) {
            rightSum -= nums[i];
            if (leftSum == rightSum) {
                return i;
            }
            leftSum += nums[i];
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {2, 3, -1, 8, 4};
        System.out.println(findEqui(arr));
        System.out.println(findEquilibriumIdx(arr,arr.length));
    }
}
