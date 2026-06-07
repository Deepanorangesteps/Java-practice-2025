package conditionsAndLoops;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter the operator ");
                int ans = 0;
        while (true) {
            char operator = sc.next().trim().charAt(0);

            if(operator == '+' || operator == '-' || operator == '*'
                    || operator == '/' || operator == '%'){

                System.out.println("enter two numbers");
                int num1 = sc.nextInt();
                int num2 = sc.nextInt();
                if(operator == '+'){
                    ans = num1 + num2;
                }
                if(operator == '-'){
                    ans = num1 - num2;
                }
                if (operator == '*'){
                    ans = num1 * num2;
                }
                if (operator == '/'){
                    ans = num1/num2;
                }

                if (operator == '%'){
                    ans = num1 % num2;
                }


        }else if (operator == 'x'  || operator == 'X'){
                break;
            }else {
                System.out.println("Invalid operator");
            }
            System.out.println(ans);
        }

    }
}
