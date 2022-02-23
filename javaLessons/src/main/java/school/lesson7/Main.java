package school.lesson7;
/*
1. Реализовать сохранение данных в csv файл;
2. Реализовать загрузку данных из csv файла. Файл читается целиком.
---------------------------------------
Структура csv файла:
Строка заголовок с набором столбцов
Набор строк с целочисленными значениями
* Разделитель между столбцами - символ точка с запятой (;)
-----------------------------------
Пример:
Value 1;Value 2;Value 3
100;200;123
300;400;500
-----------------------------------
Для хранения данных использовать класс вида:
public class AppData {
  private String[] header;
  private int[][] data;
 // ...
}
------------------------------------
Если выполняется save(AppData data), то старые данные в файле полностью перезаписываются.
 */

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    try (PrintWriter writer = new PrintWriter("file.csv")) {
        StringBuffer string = new StringBuffer();

        //Создаем и передаем данные в файл file.csv
        string.append("Value1");
        string.append(";");
        string.append("Value2");
        string.append(";");
        string.append("Value3");
        string.append(";");
        string.append("Value4");
        string.append(";");
        string.append("\n");

        string.append(1000);
        string.append(";");
        string.append(2000);
        string.append(";");
        string.append(3000);
        string.append(";");
        string.append(3000);
        string.append(";");
        string.append("\n");

        string.append(4000);
        string.append(";");
        string.append(5000);
        string.append(";");
        string.append(6000);
        string.append(";");
        string.append(3000);
        string.append(";");
        string.append("\n");

        string.append(4000);
        string.append(";");
        string.append(5000);
        string.append(";");
        string.append(6000);
        string.append(";");
        string.append(3000);
        string.append(";");
        string.append("\n");

        //Записываем данные в файле file.csv и уведомляем о выполнении
        writer.write(string.toString());
        System.out.println("Выполнено!");
    } catch (FileNotFoundException e) {
        e.printStackTrace();
    }

    //Создаем обьект класса Appdata, и запускаем метод для прочитки файла
    AppData appdata = new AppData();
    appdata.readFile();
    }
}

class AppData {
    String[] header;
    int[][] data;

    void readFile(){
        //Переносим значения из файла в ArrayList
        try (Scanner scanner = new Scanner(new File("file.csv"))) {
            List<List<String>> values = new ArrayList<>();
            while (scanner.hasNextLine()) {
                values.add(getRecords(scanner.nextLine()));
                header = new String[values.get(0).size()];
                data = new int[values.size()][values.get(0).size()];
            }

            for (int i = 0; i < header.length; i++) {
                header[i] = values.get(0).get(i);
//                data[0][i] = Integer.parseInt(values.get(1).get(i));
//                data[1][i] = Integer.parseInt(values.get(1).get(i));
            }

            for (int i = 0; i < data.length; i++) {
                for (int j = 1; j < data[i].length; j++) {
                    data[j][i] = Integer.parseInt(values.get(j).get(i));
                }
            }

            //Отображаем в консоль содержание массивов header и data
            System.out.println("header: " + Arrays.toString(header));
            for (int i = 1; i < data.length; i++) {
                System.out.println("data[" + i + "]: " + Arrays.toString(data[i]));

            }
            System.out.println(values);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

        List<String> getRecords(String line) {
            List<String> values = new ArrayList<>();
            try (Scanner scan = new Scanner(line)) {
                scan.useDelimiter(";");
                while (scan.hasNext()) {
                    values.add(scan.next());
                }
            }
            return values;
    }
}