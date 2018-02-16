package Adapter.example2;

public class WildDuck implements Duck {

    @Override
    public void fly() {
        System.out.println("I'm flying");
    }

    @Override
    public void quack() {
        System.out.println("Kwa!, Kwa!");
    }
}
