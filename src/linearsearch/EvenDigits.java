package linearsearch;

public class EvenDigits {
    public static void main(String[] args) {
        int []arr = {1200,354,2,6,7896};
      //  System.out.println(findCountEvenDigits(arr));
        System.out.println(digits2(13));
    }
    static int findCountEvenDigits(int[]arr){
        int count = 0;
        for (int i=0; i<arr.length;i++){
            int num = arr[i];
            int digitCount = digitCount(num);
            if(digitCount%2 == 0 ){
                count++;
            }
        }
        return count;
    }
    static int digits2(int num){
        if(num<0){
            num = num *-1;
        }
        return (int) (Math.log10(num)+1);
    }
    static int digitCount(int num){
        int count =0;
        if(num <0){
            num = num * -1;
        }
        if(num ==0){
            return 1;
        }
        while (num >0){
            //num = num%10;
            count++;
            num /=10;
        }
        return count;
    }
}
