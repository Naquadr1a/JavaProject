package school.lesson2;

/*
Написать метод, которому в качестве аргументов передается строка
и число, метод должен отпечатать в консоль указанную строку,
указанное количество раз;
*/

public class Task4_1 {
    public static void main(String[] args) {
        String phrase = "White";
        int number = 3;
        str(phrase, number);
    }
    static void str(String phrase, int number) {
        for (int i = 1; i <= number; i++) {
            System.out.println(phrase);
        }
    }
}
