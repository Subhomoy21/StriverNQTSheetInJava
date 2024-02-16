package Number_Mathematics;

//We initialise a sum to 0.
//We can set a loop to iterate from 1 to n-1.
//In every iteration we check if n is divisible by i, if it is we add it to our sum.
//After the loop is over, we check whether the given number is equal to our sum,
// if it is then we the given number is a perfect number, otherwise not.
public class perfectNUmber {
    static String isPerfect(int n){ //
        int ori = n;
        int sum = 0;
        for (int i = 1; i < n ; i++) {
            if(n%i==0){
                sum = sum + i;
            }
        }
        if(sum == ori){
            return "The number is Perfect";
        }
        else{
            return "The number is Not-Perfect";
        }
    }
    public static void main(String[] args) {
        System.out.println(isPerfect(15));
    }
}
