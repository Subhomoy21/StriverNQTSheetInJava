package Number_Mathematics;

public class PowerOfANumber {
    //Approach:
    //Take a variable ans to store final answer.Initially let the value of ans be 1.
    // Multiply ans with n for k times.
    //Print ans.
    static int pow(int n , int k){
        int p = 1;
        for (int i = 1; i <=k ; i++) {
            p = p * n;
        }
        return p;
    }
    // other(binary exponential) -> visit selfplaced dsa github and go to iterative power(bit magics)

    public static void main(String[] args) {
        System.out.println(pow(2,3));
    }
}
