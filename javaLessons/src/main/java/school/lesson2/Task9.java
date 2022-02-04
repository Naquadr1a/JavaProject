package school.lesson2;
/*
 * Написать метод, принимающий на вход два аргумента:
len и initialValue, и возвращающий одномерный массив
типа int длиной len, каждая ячейка которого равна initialValue;
 */
public class Task9 {
    public static void main(String[] args) {
        int len = 6;
        int initialValue = 16;
        createArray(len, initialValue);
        printArray(createArray(len, initialValue));
        }

    static int[] createArray(int len, int initialValue) {
        int array[] = new int[len];
        for (int i = 0; i < array.length; i++) {
            array[i] = initialValue;
        }
       return array;
    }

    static void printArray(int [] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}

