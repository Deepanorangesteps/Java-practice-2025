package linearsearch;

public class SearchInString {
    public static void main(String[] args) {
    String name = "Micheal";
        System.out.println(search2(name,'s'));
    }
    static boolean search(String str,char target){
        if(str.length()==0){
            return false;
        }
        for (int i=0; i<str.length();i++){
            if(target == str.charAt(i)){
                return true;
            }
        }
        return false;
    }

    static boolean search2(String str,char target){
        if(str.length() == 0){
            return false;
        }
        for (char c:
             str.toCharArray()) {
            if (target == c){
                return true;
            }
        }
        return false;
    }
}
