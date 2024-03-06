package String;

public class RemoveSpacesFromAString {
    static String removeSpaces(String s){
        String str = "";
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(ch != ' '){
                str = str + ch;
            }
            else{
                continue;
            }
        }
        return str;
    }
    public static void main(String[] args) {
        String s = "Take u forward";
        System.out.println(removeSpaces(s));
    }
}
