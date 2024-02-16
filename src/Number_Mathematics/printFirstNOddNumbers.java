package Number_Mathematics;

public class printFirstNOddNumbers {
    static void print(int n){
        for (int i = 1; i <=n ; i++) {
            System.out.print(2*i-1 + " ");
        }
    }
    // dry run suppose n = 5
    // i=1 print 2-1 = (1)
    // i=2 print 4-1 = (3)
    // i=3 print 6-1 = (5)
    // i=4 print 8-1 = (7)
    // i=5 print 10-1 = (9)
    // so ans -> 1,3,5,7,9.
    public static void main(String[] args) {
        print(5);
    }
}
