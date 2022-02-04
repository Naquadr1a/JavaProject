package school.lesson2;

/*
Написать метод, принимающий на вход два целых числа и проверяющий,
что их сумма лежит в пределах от 10 до 20 (включительно),
если да – вернуть true, в противном случае – false.
*/

public class Task1 {
    public static void main(String[] args) {
        int z = 3, x = 18;
        wee(z, x);
        System.out.println(wee(z,x));

    }

    static boolean wee(int z, int x) {
        int c = z + x;
        if (c >= 10 && c <=20) {
            return true;
        } else {
            return false;
        }
    }
}

