package school.lesson5.task1;

/*
Написать метод, который меняет два элемента массива местами (массив может быть любого ссылочного типа);
 */

import java.util.Arrays;

import static school.lesson5.task1.SwapElements.swapArray;

public class Main <T> {
    public static void main(String[] args) {
        Object[] array = new Object[]{"привет", 2.05f, "hello", 4, '+', "hi", 7, 8};
        int index1 = 0, index2 = 3;
        System.out.println(Arrays.toString(swapArray(array, index1, index2)));
    }
}
