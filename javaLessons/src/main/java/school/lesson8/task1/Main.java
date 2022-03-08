package school.lesson8.task1;

import java.util.*;
/*
Создать массив с набором слов (10-20 слов, должны встречаться повторяющиеся).
Найти и вывести список уникальных слов, из которых состоит массив (дубликаты не считаем).
Посчитать, сколько раз встречается каждое слово.
 */

public class Main {
    public static void main(String[] args) {
        List <String> fruit = new ArrayList<>();
        fruit.add("apple");
        fruit.add("orange");
        fruit.add("fig");
        fruit.add("lime");
        fruit.add("fig");
        fruit.add("mango");
        fruit.add("cherry");
        fruit.add("fig");
        fruit.add("pear");
        fruit.add("papaya");
        fruit.add("pear");
        fruit.add("apple");
        System.out.println("Начальный список: " + Arrays.toString(fruit.toArray()));

        System.out.println("\nРезультаты:");
        Map<String, Integer> count = new HashMap<>();

        for (String string : fruit) {
            count.put(string, count.getOrDefault(string, 0) + 1);
        }

        for (Map.Entry<String, Integer> stringIntegerEntry : count.entrySet()) {
            System.out.println(stringIntegerEntry);
        }

        System.out.println("\nУникальные слова: ");
        Set<String> unique = new HashSet<>(fruit);

        for (String s : unique) {
            System.out.println(s);
        }
    }
}
