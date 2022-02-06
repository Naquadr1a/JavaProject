package school.lesson2;

/*
Написать метод, которому в качестве параметра передается целое число,
метод должен напечатать в консоль, положительное ли число передали
или отрицательное. Замечание: ноль считаем положительным числом.
 */

public class Task2 {
    public static void main(String[] args) {
        int x = -1;
        num(x);
    }
    static void num(int x) {
        if (x >= 0) {
            System.out.println("Передано положительное число");
        } else {
            System.out.println("Передано отрицательное число");
        }
    }
}
