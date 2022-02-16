package school.lesson5.task2;

/*
Задача:
    1 Даны классы Fruit, Apple extends Fruit, Orange extends Fruit;
    2 Класс Box, в который можно складывать фрукты. Коробки условно сортируются по типу фрукта,
поэтому в одну коробку нельзя сложить и яблоки, и апельсины;
    3 Для хранения фруктов внутри коробки можно использовать ArrayList;
    4 Сделать метод getWeight(), который высчитывает вес коробки, зная вес одного фрукта и их
количество: вес яблока – 1.0f, апельсина – 1.5f (единицы измерения не важны);
    5 Внутри класса Box сделать метод compare(), который позволяет сравнить текущую коробку
с той, которую подадут в compare() в качестве параметра. true – если их массы равны,
false в противоположном случае. Можно сравнивать коробки с яблоками и апельсинами;
    6 Написать метод, который позволяет пересыпать фрукты из текущей коробки в другую.
Помним про сортировку фруктов: нельзя яблоки высыпать в коробку с апельсинами. Соответственно,
в текущей коробке фруктов не остается, а в другую перекидываются объекты, которые были в первой;
    7 Не забываем про метод добавления фрукта в коробку.
*/

public class Main {
    public static void main(String[] args) {
        Box<Apple> appleBox1 = new Box<>();
        Box<Apple> appleBox2 = new Box<>();
        Box<Apple> appleBox3 = new Box<>();
        Box<Orange> orangeBox1 = new Box<>();
        Box<Orange> orangeBox2 = new Box<>();

        System.out.println("Изначальный вес коробок");
        System.out.println("appleBox1 " + appleBox1.getWeight());
        System.out.println("appleBox2 " + appleBox2.getWeight());
        System.out.println("appleBox3 " + appleBox3.getWeight());
        System.out.println("orangeBox1 " + orangeBox1.getWeight());
        System.out.println("orangeBox2 " + orangeBox2.getWeight());

        System.out.println("______________________");
        System.out.println("Добвавляем в коробки фрукты");
        appleBox1.addFruit(new Apple(), 15);
        orangeBox1.addFruit(new Orange(), 22);
        appleBox2.addFruit(new Apple(), 15);

        System.out.println("В коробке appleBox1 находятся: " + appleBox1.getFruit().get(0).getClass().getSimpleName());
        System.out.println("В коробке appleBox2 находятся: " + appleBox2.getFruit().get(0).getClass().getSimpleName());
        System.out.println("В коробке orangeBox1 находятся: " + orangeBox1.getFruit().get(0).getClass().getSimpleName());
        System.out.println("Вес коробки appleBox1: " + appleBox1.getWeight());
        System.out.println("Вес коробки appleBox2: " + appleBox2.getWeight());
        System.out.println("Вес коробки orangeBox1: " + orangeBox1.getWeight());

        System.out.println("_____________________________");
        System.out.println("Сравниваем вес коробок");
        System.out.println("appleBox1 and appleBox2: " + appleBox1.compare(appleBox2));
        System.out.println("appleBox1 and orangeBox1: " + appleBox1.compare(orangeBox1));

        //Пересыпаем фрукты из ящика в ящик
        System.out.println("______________________________");
        System.out.println("Пересыпаем Apple из appleBox1 в appleBox3");
        appleBox1.sprinkle(appleBox3);
        System.out.println("Вес коробки appleBox1: " + appleBox1.getWeight());
        System.out.println("Вес коробки appleBox3: " + appleBox3.getWeight());
//        System.out.println("В коробке appleBox1 находятся: " + appleBox1.getFruit().get(0).getClass().getSimpleName());
        System.out.println("В коробке appleBox3 находятся: " + appleBox3.getFruit().get(0).getClass().getSimpleName());

        System.out.println("_____________________");
        orangeBox1.sprinkle(orangeBox2);
        System.out.println("Пересыпаем Orange из orangeBox1 в orangeBox2");
        System.out.println("Вес коробки orangeBox1: " + orangeBox1.getWeight());
        System.out.println("Вес коробки orangeBox2: " + orangeBox2.getWeight());
//        System.out.println("В коробке appleBox1 находятся: " + orangeBox1.getFruit().get(0).getClass().getSimpleName());
        System.out.println("В коробке orangeBox2 находятся: " + orangeBox2.getFruit().get(0).getClass().getSimpleName());

    }
}