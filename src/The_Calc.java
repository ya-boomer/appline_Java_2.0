import java.util.Scanner;

/**
 * @param a      - operation number
 * @param i      - array element number
 * @param j      - the number of the maximum element of the array
 * @param max    - maximum length element of the array
 * @param x      - first number
 * @param y      - second number
 * @param z      - arithmetic operation
 * @param result - result of calculations
 */
public class The_Calc {
    public static void main(String[] args) {
        System.out.print("введите что Вы хотите сделать:\n 1 - посчитать в калькуляторе\n 2 - найти максимальный элемент массива ");
        Scanner scanner = new Scanner(System.in);
        // read operation number
        byte a = scanner.nextByte();
        if (a == 1) {
            Calculate();
        } else if (a == 2) {
            // read length of array
            System.out.println("Введите количество элементов массива");
            int lengthArray = scanner.nextInt();
            maxArrayElement(lengthArray);
        } else System.out.println("Введено некорректное значение");
    }

    public static Object Calculate() {
        //enter 2 number and arithmetic operation
        System.out.print("введите число x: ");
        Scanner scanner = new Scanner(System.in);
        double x = scanner.nextDouble();
        System.out.print("введите число y: ");
        double y = scanner.nextDouble();
        System.out.print("введите арифметическое действие: ");
        String z = scanner.next();
        double result;
        //calc
        switch (z) {
            case "+":
                result = x + y;
                return String.valueOf(System.out.printf("%.4f", result));
            case "-":
                result = x - y;
                return String.valueOf(System.out.printf("%.4f", result));
            case "*":
                result = x * y;
                return String.valueOf(System.out.printf("%.4f", result));
            case "/":
                result = x / y;
                return String.valueOf(System.out.printf("%.4f", result));
            //incorrect arithmetic operation
            default:

                return String.valueOf(System.out.printf("действие невозможно, введите одну из доступных операций: +, -, *, /"));
        }

    }

    public static String maxArrayElement(int lengthArray) {
        int max, j = 0;
        String[] myArray = new String[lengthArray];
        for (int i = 0; i < lengthArray; i++) {
            // write elements of array
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите элемент массива");
            myArray[i] = scanner.nextLine();
        }
        for (int i = 0; i < lengthArray; i++) {
            max = myArray[0].length();
            // find max length of elements array
            if (myArray[i].length() > max)
                max = myArray[i].length();
            // remember the number of the maximum array element
            j = i;

        }
        return String.valueOf(System.out.printf("Максимальный элемент массива %s%n", myArray[j]));
    }
}

