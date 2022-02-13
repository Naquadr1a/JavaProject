package school.lesson4.task5;

public class Plate {
    private int food;

    public Plate(int food) {
        this.food = food;
    }

    public boolean decreaseFood(int amount) {
        if(amount < food) {
            food -= amount;
            return true;
        } else {
            return false;
        }
            }

    public void info() {
        System.out.println("Еды осталось: " + food);
    }

    public void addFood(int add) {
        food += add;
    }
}


