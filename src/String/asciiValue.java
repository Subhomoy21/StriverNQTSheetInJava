package String;

public class asciiValue {
    static int asciiValue(char ch){
        int as = (int) ch;
        return as;
    }
    public static void main(String[] args) {
        char ch = 'e';
        System.out.println("The value for " + ch + " is :" + asciiValue(ch));
    }
}
