import java.util.Scanner;

public class Outer_Calculator {

    static class Inner_Calculator {
        public static int addition(int num1, int num2) {
            return num1 + num2;
        }

        public static int subtraction(int num1, int num2) {
            return num1 - num2;
        }

        public static int multiplication(int num1, int num2) {
            return num1 * num2;
        }

        public static int division(int num1, int num2) {
            return num1 / num2;
        }
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        String operator = sc.next();

        int result;

        switch(operator) {
            case "+":
                result = Inner_Calculator.addition(num1, num2);
                break;
            case "-":
                result = Inner_Calculator.subtraction(num1, num2);
                break;
            case "*":
                result = Inner_Calculator.multiplication(num1, num2);
                break;
            case "/":
                result = Inner_Calculator.division(num1, num2);
                break;
            default:
                System.out.println("invalid operator");
                return;
        }

        System.out.println(result);
    }
}
