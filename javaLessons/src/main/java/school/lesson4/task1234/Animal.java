package school.lesson4.task1234;

class Animal {
    private String name;
    static int count;

    public Animal(String name) {
        this.name = name;
        //Счетчик созданных обьектов-животных
        count++;
    }

    public String getName() {
        return name;
    }

    // Метод бега для всех животных
    void run(int distance) {
        System.out.println(this.name + " пробежал " + distance + " метров.");
    }

    // метод плаванья для всех животных
    void swim(int distance) {
        System.out.println(this.name + " проплыл " + distance + " метров.");
    }
}
