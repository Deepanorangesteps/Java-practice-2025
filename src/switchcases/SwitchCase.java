package switchcases;

import java.util.Scanner;

public class SwitchCase {

    // for the more information refer the java fundamentals project in switchcase package
    public static void main(String[] args) {
       // Scanner sc = new Scanner(System.in);
       // int day = sc.nextInt();
        //minimalSwitch(day);
nestedSwitch(1,"IT");

    }

    // in my company we are using the helpDAO this nested switch for the fast fetching
    static void latestSwitch(int day){
        switch (day){
            case 1 -> System.out.println("Monday");
            case  2 -> System.out.println("Tuesday");
            case  3 -> System.out.println("Wednesday");
            case  4 -> System.out.println("Thursday");
            case  5 -> System.out.println("Friday");
            case  6 -> System.out.println("Saturday");
            case  7 -> System.out.println("Sunday");
        }
    }
    static  void minimalSwitch(int day){
        switch (day){
            case 1,2,3,4,5 -> System.out.println("weekday");
            case 6,7 -> System.out.println("weekend");
        }
    }

    static void nestedSwitch(int rollNo,String department){
        switch (rollNo) {
            case 1 -> {
                switch (department) {
                    case "IT":
                        System.out.println("It department");
                        break;
                    case "CS":
                        System.out.println("cs department");
                        break;
                }
            }
            case 2 -> {
                switch (department) {
                    case "Mechanical" -> System.out.println("mechanical departemnt");
                    case "Civil" -> System.out.println("civil department");
                }
            }
        }
    }
}
