package school.lesson1;

public class HomeWorkApp {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
    }

    public static void printThreeWords() {
        System.out.println(" ");
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    public static void checkSumSign() {
        System.out.println(" ");
        int a = 9, b = -3;;
        int c = a + b;
        if (c >= 0) {
            System.out.println("Сума положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }

    public static void printColor() {
        System.out.println(" ");
        int value = 101;
        if (value <= 0) {
            System.out.println("Красный");
        } else if (value > 100) {
            System.out.println("Зеленый");
        } else {
            System.out.println("Желтый");
        }
    }
    public static void compareNumbers() {
        System.out.println(" ");
        int a = 6, b = 4;
        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }
}

