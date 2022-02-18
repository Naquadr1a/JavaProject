package school.lesson6;

import static school.lesson6.Method.method;

/*
    1.  Напишите метод, на вход которого подается двумерный строковый
массив размером 4х4. При подаче массива другого размера необходимо бросить исключение MyArraySizeException.
    2.  Далее метод должен пройтись по всем элементам массива, преобразовать в int
и просуммировать. Если в каком-то элементе массива преобразование не удалось (например, в ячейке
лежит символ или текст вместо числа), должно быть брошено исключение MyArrayDataException с детализацией,
в какой именно ячейке лежат неверные данные.
    3.  В методе main() вызвать полученный метод, обработать возможные исключения
MyArraySizeException и MyArrayDataException и вывести результат расчета.
 */
public class Main {
    public static void main(String[] args) throws MyArraySizeException, MyArrayDataException {
        String[][] array = {
                {"1", "2", "3", "4"},
                {"5", "6", "7", "8"},
                {"9", "10", "11", "12"},
                {"13", "14", "15", "16"}
        };
        System.out.println("Сумма элементов всех массивов: " + method(array));
    }
}
