package school.lesson4.task1234;

class Cat extends Animal {
    static int count;

    public Cat(String name) {
        super(name);
        //Счетчик созданных обьектов-котов
        count++;
    }

    //Переопределение метода бега для котов
    @Override
    void run(int distance) {
        if(distance <= 200 && distance > 0) {
            System.out.println(this.getName() + " пробежал " + distance + " метров.");
        } else {
            System.out.println(this.getName() + " не может пробежать столько.");
        }
    }

    //Переопределение метода плаванья для котов
    @Override
    void swim(int distance) {                           //Переопределение метода плаванья для котов
        System.out.println(this.getName() + " не умеет плавать.");
    }
}
