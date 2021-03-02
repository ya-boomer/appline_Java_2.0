// Массив размерностью 20, заполняется случайными целыми числами от -10 до 10. Найти максимальный отрицательный и минимальный положительный элементы массива. Поменять их местами.

import java.util.Random;

public class mas4_1 {
    public static void main(String[] args) {
        int[] myArrayInt = new int[20];
        Random random = new Random();
        System.out.println("Первоначальный массив:");
        // Filling the array
        for (int i = 0; i < 20; i++) {
            myArrayInt[i] = random.nextInt(21) - 10;
            System.out.print(myArrayInt[i] + " ");
        }
        int maxNegative = -10;
        int minPositive = 10;
        int x = 0;
        int y = 0;
        int temp = 0;
        for (int i = 0; i < 20; i++) {
            //find the maximum negative element and remember its position
            if ((myArrayInt[i] > maxNegative) && (myArrayInt[i] < 0)) {
                maxNegative = myArrayInt[i];
                x = i;
            }
            //find the minimal positive element and remember its position
            if ((myArrayInt[i] < minPositive) && (myArrayInt[i] > 0)) {
                minPositive = myArrayInt[i];
                y = i;
            }

        }
        //swap the elements of the array
        temp = myArrayInt[x];
        myArrayInt[x] = myArrayInt[y];
        myArrayInt[y] = temp;
        System.out.println("\nмаксимальный отрицательный элемент = " + maxNegative + " минимальный положительный элемент = " + minPositive);
        System.out.println("Массив после замены:");
        for (int i = 0; i < 20; i++) {
            System.out.print(myArrayInt[i] + " ");
        }
    }
}
