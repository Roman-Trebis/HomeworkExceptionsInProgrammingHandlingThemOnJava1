package Exercise4;

import java.util.Arrays;

/* 
 * Задание 4.
 * 4. Реализуйте метод, принимающий в качестве аргументов двумерный массив. Метод должен проверить что длина строк и столбцов с одинаковым индексом одинакова, детализировать какие строки со столбцами не требуется. Как бы вы реализовали подобный метод?
 *
*/

public class Program {
    public static void main(String[] args) {
        int[][] arr = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        checkArrayLengths(arr);

        for (int[] row : arr) {
            System.out.println(Arrays.toString(row));
        }
    }

    public static void checkArrayLengths(int[][] arr) {
          for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i].length != arr[j].length) {
                    System.out.printf("Длина строки %d не совпадает с длиной столбца %d\n", i, j);
                }
            }
        }
    }
}