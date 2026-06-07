package strings;

public class Palindrome {
    public static void main(String[] args) {
String input = "abccba";
String input2 = "abckba";
        System.out.println(isPalindrome(input2 ));
    }
    static boolean isPalindrome(String str){
        if(str == null || str.length()==0){
            return true;
        }
        for (int i = 0; i <= str.length()/2; i++) {
            char start = str.charAt(i);
            char end = str.charAt(str.length()-1-i);
            if(start !=end){
                return false;
            }
            continue;
        }
        return true;
    }
}
