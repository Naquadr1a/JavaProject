package school.lesson4.task7;

import java.util.*;

public class Park {
        private String parkName;
        private Attraction[] attractionsList;

        public Park(String... arguments) {
            this.parkName = "Парк 50-летия";
            //Используем arrayList чтобы динамически добавить нужное количество элементов
            ArrayList<Attraction> tempAttractionList = new ArrayList<>();

            for (int i = 0; i < arguments.length; i+=3) {
                tempAttractionList.add(new Attraction(arguments[i], arguments[i+1], arguments[i+2]));
            }
            // Превращаем arrayList в array, чтобы получать элементы по индексу
            this.attractionsList = new Attraction[tempAttractionList.size()];
            this.attractionsList = tempAttractionList.toArray(this.attractionsList);
        }

        //Вывод в консоль информации о атракционах
        public void printAfisha() {
            System.out.println("Park name: " + this.parkName);
            System.out.println("| Name              | Time         | Price |");

            for (Attraction attraction : this.attractionsList) {
                System.out.println("| " + attraction.name + "            |" + attraction.time + " | " + attraction.price + "   |");
            }
        }

        // Внутренний клас
        static class Attraction {
            String name;
            String time;
            int price;

            public Attraction(String name, String time, String price) {
                this.name = name;
                this.time = time;
                this.price = Integer.parseInt(price);
            }
        }
    }