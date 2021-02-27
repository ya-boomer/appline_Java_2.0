import java.util.Scanner;

/**
 * @param x - first number
 * @param y - second number
 * @param z - arithmetic operation
 */
public class The_Calc {
    public static void main(String[] args) {
        //enter 2 number and arithmetic operation
        Scanner scanner = new Scanner(System.in);
        System.out.print("введите число x: ");
        double x = scanner.nextDouble();
        System.out.print("введите число y: ");
        double y = scanner.nextDouble();
        System.out.print("введите арифметическое действие: ");
        String z = scanner.next();
        //calc
        switch (z) {
            case "+":
                System.out.print(x + y);
                break;
            case "-":
                System.out.print(x - y);
                break;
            case "*":
                System.out.print(x * y);
                break;
            case "/":
                System.out.print(x / y);
                break;
            //incorrect arithmetic operation
            default:
                System.out.print("действие невозможно, введите одну из доступных операций: +, -, *, /");
                break;
        }

    }
}

