public class Main {
    public static void main(String[] args) {

        int[] arr = {11,22,33,44,63,66};
        for (int i:arr) {
            if (divide(i)){
                System.out.println("this num ends with "+i);
                break;
            }
        }
        System.out.println("Hello world!");
    }
    static boolean divide(int num){
      String numS = String.valueOf(num);
      char[] numAr = numS.toCharArray();
      if(numAr[numAr.length-1]=='6'){
          return true;
      }
      return false;
    }
}