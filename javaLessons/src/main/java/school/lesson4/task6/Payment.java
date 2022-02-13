package school.lesson4.task6;
/*
6.    Создать класс Payment с внутренним классом, с помощью объектов которого
можно сформировать покупку из нескольких товаров.
 */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

class Payment {
    private String shopName;
    private int sum;
    private Item[] itemList;

    //Создали Map который хранит цены товаров (хотя можно сделать поддержку получения цены в констукторе)
    public static Map<String, Integer> priceList = new HashMap<>() {{
       put("Відьмак. Книга 1.", 200);
       put("Відьмак. Книга 2.", 220);
       put("Відьмак. Книга 3.", 210);
       put("Відьмак. Книга 4.", 220);
       put("Відьмак. Книга 5.", 230);
       put("Відьмак. Книга 6.", 240);
       put("Відьмак. Книга 7.", 250);
       put("Відьмак. Книга 8.", 180);
    }};

    public Payment(String... arguments) {
        this.shopName = "Book club";
        //Используем arrayList чтобы динамически добавить нужное количество элементов
        ArrayList<Item> tempItemList = new ArrayList<>();

        for (int i = 0; i < arguments.length; i+=2) {
            tempItemList.add(new Item(arguments[i], arguments[i+1]));
        }

        // Превращаем arrayList в array, чтобы получать элементы по индексу
        this.itemList = new Item[tempItemList.size()];
        this.itemList = tempItemList.toArray(this.itemList);

        for (Item item : this.itemList) {
            this.sum += item.price * item.amount;
        }
    }
    //Вывод в консоль чека о покупке
    public void printPayment() {
        System.out.println("Shop name: " + this.shopName);
        System.out.println("| Name              | Amount | Price |");

        for (Item item : this.itemList) {
            System.out.println("| " + item.name + " |      " + item.amount + " | " + item.price + "   |");
        }

        System.out.println("Вместе: " + this.sum);
    }

    //Внутренний класс
    static class Item {
        String name;
        int price;
        int amount;

        public Item(String name, String amount) {
            this.name = name;
            this.price = priceList.get(name);
            this.amount = Integer.parseInt(amount);
        }
    }
}