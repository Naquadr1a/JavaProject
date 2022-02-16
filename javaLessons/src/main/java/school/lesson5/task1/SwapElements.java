package school.lesson5.task1;

public class SwapElements {
    static public Object[] swapArray(Object[] array, int index1, int index2) {
        Object temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
        return array;
        }
    }

