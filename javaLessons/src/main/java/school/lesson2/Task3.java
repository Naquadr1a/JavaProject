package school.lesson2;

/*
Написать метод, которому в качестве параметра передается целое число.
Метод должен вернуть true, если число отрицательное, и вернуть false
если положительное. Замечание: ноль считаем положительным числом.
 */

public class Task3 {
    public static void main(String[] args) {
        int a = -2;
        wee(a);
        System.out.println(wee(a));
    }
    static boolean wee(int x) {
        if (x < 0) {
            return true;
        } else {
            return false;
        }


    }
}

