package conditionsAndLoops;

public class CountNum {
    public static void main(String[] args) {
       countNo(12344);
//reverseNumber(3456 );
    }

    static void countNo(int n){
        // just find a number count
        int count =0;
        while (n >0){
            while(n>0){
                int rem = n%10;
                if(rem == 5){
                    count++;
                }
                n = n/10;
            }
            System.out.println(count);
        }
    }

    // Reverse a number
    static void reverseNumber(int n){
      int ans =0;
      while (n >0 ){
          int rem = n %10;
          n /= 10;
          ans = ans * 10 + rem;
      }
        System.out.println("Reversed number" +ans);
    }
}
