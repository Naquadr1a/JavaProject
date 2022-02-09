package school.lesson3;
/*
1.         Создать класс "Сотрудник" с полями: ФИО, должность, email, телефон, зарплата, возраст.
2.         Конструктор класса должен заполнять эти поля при создании объекта.
3.         Внутри класса «Сотрудник» написать метод, который выводит информацию об объекте в консоль.
4.         Создать массив из 5 сотрудников.
Пример:
Вначале объявляем массив объектов:         person[] persArray = new Person[5];
Потом для каждой ячейки массива задаем объект
    persArray[0] = new Person("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 30);
    persArray[1] = new Person(...);
5.         С помощью цикла вывести информацию только о сотрудниках старше 40 лет.
 */
public class Worker {
    private String FIO;         // Поля класса: ФИО, должность, email, телефон, зарплата, возраст
    private String post;
    private String email;
    private String phoneNumber;
    private int pay;
    private int age;

    public Worker(String FIO, String post, String email, String phoneNumber, int pay, int age) {
        this.FIO = FIO;
        this.post = post;                  // Конструктор
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.pay = pay;
        this.age = age;
    }

    public static void main(String[] args) {
        Worker[] workArr = new Worker[5];
        workArr[0] = new Worker("Вячеслав Украинцев", "Учитель украинского языка", "123456@gmail.com", "+380123456789", 12000, 54);
        workArr[1] = new Worker("Семен Островский", "Учитель математики", "osrovsky15@ukr.net", "+380123456123", 13000, 29);
        workArr[2] = new Worker("Иван Черноземов", "Учитель физ-культуры", "ivandark@gmail.com", "+380123456456", 14000, 39);
        workArr[3] = new Worker("Наталия Лис", "Учитель английского языка", "lis_lis@ukr.net", "+380123456321", 10000, 42);
        workArr[4] = new Worker("Ирина Захарова", "Учитель биологии", "380123456654@ukr.net", "+380123456654", 11000, 39);

        for (Worker worker : workArr) {           // Выбираем работников старше 40 лет
            if (worker.age > 40) {
                printInformation(worker);
            }
        }
    }
    // Принт в консоли информации о обьекте/работнике
    private static void printInformation(Worker worker) {
        System.out.println("ФИО: " + worker.FIO + "\nДолжность: " + worker.post + "\nemail: " + worker.email + "\nТелефон: "
                + worker.phoneNumber + "\nЗарплата: " + worker.pay + "\nВозраст: " + worker.age + "\n");
        }
}