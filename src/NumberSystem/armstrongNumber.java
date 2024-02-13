package NumberSystem;

public class armstrongNumber {
    static boolean isArmstrong(int n){
        int count = 0;
        while(n>0){
            n=n/10;
            count++;
        }
        int ori = n;
        int sum = 0;
         while(n!=0){
             int lastDigit = n%10;
             sum = sum + (int)Math.pow(lastDigit,count); // computer thori pata  limit woh toh samjh raha hai ki bahut barra number hai isliye type cast!
             n=n/10;
         }
         if(ori == sum){
             return true;
         }
         return false;
    }
    public static void main(String[] args) {
        if(isArmstrong(153)){
            System.out.println("jaaa na laure armstrong hu mein:");
        }
        else{
            System.out.println("Sorry bhai mein nhi hu armstrong");
        }
    }
}
