package school.lesson2;

/*
Написать метод, который определяет, является ли год високосным,
и возвращает boolean (високосный - true, не високосный - false).
Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.
 */

public class Task4_2 {
    public static void main(String[] args) {
        int year = 1700;
        wee(year);
        System.out.println(wee(year));
    }

    static boolean wee(int year) {
        if (year % 400 == 0 || ((year % 100 != 0) && (year % 4 == 0))) {
            return true;
        } else {
            return false;
        }
    }
}