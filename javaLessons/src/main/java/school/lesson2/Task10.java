package school.lesson2;
/*
Написать метод, которому на вход подается одномерный массив
и число n (может быть положительным, или отрицательным),
при этом метод должен сместить все элементы массива на n позиций.
Элементы смещаются циклично. Для усложнения задачи нельзя пользоваться
вспомогательными массивами. Примеры: [ 1, 2, 3 ] при n = 1
(на один вправо) -> [ 3, 1, 2 ]; [ 3, 5, 6, 1] при n = -2
(на два влево) -> [ 6, 1, 3, 5 ]. При каком n в какую
сторону сдвиг можете выбирать сами.
 */

public class Task10 {
    public static void main(String[] args) {
        int array[] = {1, 2, 3, 4, 5, 6, 7};
        int number = 2;
        changeArray(array, number);
        printArray(changeArray(array, number));
    }

    static int[] changeArray(int [] array, int number) {

        return array;
    }

        static void printArray(int[] array) {
            for (int i = 0; i < array.length; i++) {
                System.out.print(array[i] + " ");
            }
        }
}
