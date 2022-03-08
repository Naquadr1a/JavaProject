package school.lesson6;

public class MyArraySizeException extends Exception {
    public MyArraySizeException() {
        super("Неподходящий размер передаваемого массива");
    }
}
