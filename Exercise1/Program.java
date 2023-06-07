package Exercise1;

import java.util.Arrays;

/* 
 * Задание 1.
 * 1. Реализуйте метод, принимающий в качестве аргументов два целочисленных массива, и возвращающий новый массив, каждый элемент которого равен разности элементов двух входящих массивов в той же ячейке. Если длины массивов не равны, необходимо как-то оповестить пользователя.
 *
*/

public class Program {
    public static void main(String[] args) {
        int[] arr1 = { 2, 5, 9 };
        int[] arr2 = { 4, 3, 1 };

        try {
            int[] result = calculateDifference(arr1, arr2);
            System.out.println(Arrays.toString(result));
        }
        catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    public static int[] calculateDifference(int[] arr1, int[] arr2) {
        if (arr1.length != arr2.length) {
            throw new IllegalArgumentException("Длины массивов не совпадают");
        }

        int[] result = new int[arr1.length];

        for (int i = 0; i < arr1.length; i++) {
            result[i] = arr1[i] - arr2[i];
        }
        
        return result;
    }
}