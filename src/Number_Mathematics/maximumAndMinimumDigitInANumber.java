package Number_Mathematics;

public class maximumAndMinimumDigitInANumber {
    static int[] maxMin(int n){
        int ans [] = new int[2];
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        while (n!=0){
            int ld = n%10;
            largest = Math.max(largest,ld);
            smallest = Math.min(smallest,ld);
            n = n/10;
        }
        ans[0] = largest;
        ans[1] = smallest;
        return ans;
    }
    // using void
    static private void MinMax(int n)
    {
        int d;
        int mini = Integer.MAX_VALUE;
        int maxi = Integer.MIN_VALUE;
        while (n != 0)
        {
            d = n % 10;
            mini = Math.min(mini,d);
            maxi = Math.max(maxi,d);
            n = n / 10;
        }

        System.out.println("The minimum number is: "+mini);
        System.out.print("The maximum number is: "+maxi);
    }
    public static void main(String[] args) {
        int ans[] = maxMin(5469);
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
        }
        System.out.println();
        MinMax(5469);
    }
}
