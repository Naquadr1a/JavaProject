package school.lesson2;
/*
Создать квадратный двумерный целочисленный массив
(количество строк и столбцов одинаковое), и с помощью
цикла(-ов) заполнить его диагональные элементы единицами
(можно только одну из диагоналей, если обе сложно). Определить
элементы одной из диагоналей можно по следующему принципу: индексы
таких элементов равны, то есть [0][0], [1][1], [2][2], …, [n][n];
 */

public class Task8 {
    public static void main(String[] args) {
        int a = 5;
        int array[][] = new int[a][a];
        for (int i = 0; i < array.length; i++) {
            int j = array.length - i - 1;
            array[i][i] = 1;
            array[i][j] = 1;
        }

        for (int i = 0; i < array.length; i++) {
            System.out.print("\n");
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
        }
    }
}
