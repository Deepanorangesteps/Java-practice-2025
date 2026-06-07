package functions;

public class Practice {
    public static void main(String[] args) {
   // prime(9);
        boolean isArm =arm(153);
        System.out.println(isArm);
    }

    static void prime(int n){
        int c= 2;
        while(c*c <=n){
            if(n%c == 0){
                System.out.println("not prime");
            }
            c++;
        }
        if(c*c > n){
            System.out.println("prime");
        }
    }
    static boolean arm(int n){
        int origin = n;
        int sum = 0;
        while (n>0){
            int rem = n%10;
            sum = sum + rem*rem*rem;
            n = n/10;
        }
        return origin==sum;
    }
}
