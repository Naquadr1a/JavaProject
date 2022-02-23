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
    public static void main(String[] args) throws IOException {
    try (PrintWriter writer = new PrintWriter(new FileWriter("file.csv", true))) {
        StringBuffer string = new StringBuffer();

        //Передаем данные в файл file.csv
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
        string.append("\n");

        string.append(4000);
        string.append(";");
        string.append(5000);
        string.append(";");
        string.append(6000);
        string.append(";");
        string.append(3000);
        string.append("\n");

        string.append(7000);
        string.append(";");
        string.append(8000);
        string.append(";");
        string.append(9000);
        string.append(";");
        string.append(1000);
        string.append(";");
        string.append("\n");

        string.append(7000);
        string.append(";");
        string.append(8000);
        string.append(";");
        string.append(9000);
        string.append(";");
        string.append(1000);
        string.append(";");
        string.append("\n");

        //Записываем данные в файле file.csv и уведомляем о выполнении
        writer.write(string.toString());
        System.out.println("Выполнено!");
    } catch (FileNotFoundException e) {
        e.printStackTrace();
    }

        //Создаем обьект класса Appdata, и запускаем метод для прочитки, и очистки файла
    AppData appdata = new AppData();
    appdata.readFile();
    appdata.save();
    }
}

class AppData {
    String[] header;
    int[][] data;

    void readFile(){
        //Читаем файл file.csv
        try (Scanner scanner = new Scanner(new File("file.csv"))) {
            List<List<String>> values = new ArrayList<>();
            while (scanner.hasNextLine()) {
                values.add(getRecords(scanner.nextLine()));
            }

            //ставим соответствующую длинну для массивов header и data
            header = new String[values.get(0).size()];
            data = new int[values.size()][values.get(0).size()];

            //Заполняем массивы header и data данными из ArrayList
            for (int i = 0; i < header.length; i++) {
                header[i] = values.get(0).get(i);
            }

            for (int i = 1; i < values.size(); i++) {
                for (int j = 0; j < values.get(0).size(); j++) {
                    data[i - 1][j] = Integer.parseInt(values.get(i).get(j));
                }
            }

            //Отображаем в консоль содержание массивов header и data
            System.out.println("Содержимое массива header: " + Arrays.toString(header));
            for (int i = 0; i < values.size() - 1; i++) {
                System.out.println("Содержимое массива data[" + i + "]: " + Arrays.toString(data[i]));
            }

//            System.out.println(values);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
        //Записываем полученные данные в ArrayList
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

    // Метод для очистки файла file.csv (не разобрался как сделать согласно заданию)
    void save() throws IOException {
        FileWriter clear = new FileWriter("file.csv", false);
        PrintWriter print = new PrintWriter(clear, false);
        print.flush();
        print.close();
        clear.close();
    }
}
