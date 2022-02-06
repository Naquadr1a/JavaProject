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
        int num = 8;
        printArray(changeArray(array, num));
    }

    static int[] changeArray(int [] array, int num) {
        // Оптимизировал код - отрезал лишние прокручивания
        // потому-что если массив сдвинуть на свою длинну, получиться тот же массив
        num %= array.length;

        if (num > 0) {
            for (int i = 0; i < num; i++) {
                // Запоминаем первый элемент массива
                int temp = array[0];
                // Записываем последний элемент на первое место массива
                array[0] = array[array.length - 1];

                // Сдвиг элементов массива вправо на 1
                for (int j = 1; j < array.length - 1; j++) {
                    array[array.length - j] = array[array.length - j - 1];
                }

                // Записываем запомненный элемент во вторую ячейку
                array[1] = temp;
            }
        } else if (num < 0) {
            for (int i = 0; i < Math.abs(num); i++) {
                // Запоминаем последний элемент
                int temp = array[array.length - 1];
                // Записываем значение первого элемента в последний
                array[array.length - 1] = array[0];

                // Сдвиг элементов массива влево на 1
                for (int j = 1; j < array.length - 1; j++) {
                    array[j - 1] = array[j];
                }

                // Записываем запомненный элемент во предпоследнюю ячейку
                array[array.length - 2] = temp;
            }
        }

        // Возвращаем сдвинутый массив
        // если переданный индес сдвига равен 0, то мы вернем первоначальный массив, и это будет верно
        return array;
    }
        static void printArray(int[] array) {
            for (int i = 0; i < array.length; i++) {
                System.out.print(array[i] + " ");
            }
        }
}