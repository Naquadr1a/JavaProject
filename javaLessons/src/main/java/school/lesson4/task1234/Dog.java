package school.lesson4.task1234;

class Dog extends Animal {
    static int count;

    public Dog(String name) {
        super(name);
        //Счетчик созданных обьектов-собак
        count++;
    }

    //Переопределение метода бега для собак
    @Override
    void run(int distance) {
        if(distance <= 200 && distance > 0) {
            System.out.println(this.getName() + " пробежал " + distance + " метров.");
        } else {
            System.out.println(this.getName() + " не может пробежать столько.");
        }
    }

    //Переопределение метода плаванья для собак
    @Override
    void swim(int distance) {
        if (distance <= 10 && distance > 0) {
            System.out.println(this.getName() + " проплыл " + distance + " метров.");
        } else {
            System.out.println(this.getName() + " не может проплыть столько.");
        }
    }
}
