package school.lesson4.task7;

import java.util.Scanner;

/*
7. Создать класс Park с внутренним классом, с помощью объектов
которого можно хранить информацию об аттракционах, времени их работы и стоимости.
 */

public class Main {
    public static void main(String[] args) {
        Park somePark = new Park("Вулкан", "11:00 - 16:00", "300", "Карусель", "10:00 - 15:00", "130");
        somePark.printAfisha();
    }
}
