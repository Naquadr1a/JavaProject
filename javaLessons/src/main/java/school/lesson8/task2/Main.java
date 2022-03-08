package school.lesson8.task2;
/*
Написать простой класс Телефонный Справочник, который хранит в себе список фамилий
и телефонных номеров. В этот телефонный справочник с помощью метода add() можно добавлять
записи, а с помощью метода get() искать номер телефона по фамилии. Следует учесть, что под одной
фамилией может быть несколько телефонов (в случае однофамильцев), тогда при запросе такой фамилии
должны выводиться все телефоны.

Желательно не добавлять лишний функционал (дополнительные поля (имя, отчество, адрес),
взаимодействие с пользователем через консоль и т.д). Консоль использовать
только для вывода результатов проверки телефонного справочника.
 */

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws Exception {
        Phonebook phonebook = new Phonebook();
        phonebook.add(111111, "Жмышенко");
        phonebook.add(222222, "Соловьев");
        phonebook.add(333333, "Петренко");
        phonebook.add(444444, "Украинцев");
        phonebook.add(555555, "Жмышенко");
        phonebook.add(666666, "Невский");
        phonebook.add(777777, "Раев");
        phonebook.add(888888, "Жмышенко");
        phonebook.add(999999, "Овчаренко");

        phonebook.get("Жмышенко");
        phonebook.get("Раев");
    }
}

class Phonebook {
    Map<Integer, String> phonebook = new HashMap<>();

    void add (int number, String secondName) {
        phonebook.put(number, secondName);
    }

    void get (String secondName) throws Exception {
        if (phonebook.containsValue(secondName)) {
        Set<Map.Entry<Integer, String>> set = phonebook.entrySet();

        for (Map.Entry<Integer, String> temp : set) {
            if (temp.getValue().equals(secondName)) {
                System.out.println(temp.getValue() + " " + temp.getKey());
            }
            }

        } else {
            throw new Exception("В книге нет такой записи");
        }
    }
}
