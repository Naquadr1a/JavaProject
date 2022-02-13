package school.lesson4.task5;

public class Cat {
    private String name;
    private int appetite;
    private boolean saturation;

    public Cat(String name, int appetite, boolean saturation) {
        this.name = name;
        this.appetite = appetite;
        this.saturation = false;
    }

    public void eat(Plate plate) {
        saturation = plate.decreaseFood(appetite);
    }
    public void catInfo() {
        if(saturation == true) {
            System.out.println(this.name + " наелся.");
        } else {
            System.out.println(this.name + " голоден.");
        }
    }
}
