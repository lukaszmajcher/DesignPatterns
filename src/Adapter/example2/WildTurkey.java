package Adapter.example2;

public class WildTurkey implements Turkey{

    @Override
    public void fly() {
        System.out.println("I'm flying! But only short distance");
    }

    @Override
    public void gobble() {
        System.out.println("Gul!, Gul!, Gul!");
    }
}
