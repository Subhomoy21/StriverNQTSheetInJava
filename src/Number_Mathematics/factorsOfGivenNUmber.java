package Number_Mathematics;

public class factorsOfGivenNUmber {
    static void foGn(int n){
        // naive
        for (int i = 1; i <=n ; i++) {
            if(n%i==0){
                System.out.print(i + " ");
            }
        }
    }
    static void factors(int n) {
        // optimised
        for (int i = 1; i*i <=n ; i++) {
            if(n%i == 0){
                System.out.print(i + " ");
                if(i!=n/i){
                    System.out.print(n/i + " ");
                }
            }
        }

    }
    public static void main(String[] args) {
        foGn(6);
        System.out.println();
        factors(6);
    }
}
