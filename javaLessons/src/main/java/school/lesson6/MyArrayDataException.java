package school.lesson6;

public class MyArrayDataException extends Exception {
    public MyArrayDataException(int i, int j) {
        super("Ошибка в array[" + i + "][" + j + "]");
    }
}
