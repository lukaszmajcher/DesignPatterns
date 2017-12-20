package FactoryMethod;

public class Car implements Vehicle {
    @Override
    public void design() {
        System.out.println("Designning car");
    }

    @Override
    public void manufacture() {
        System.out.println("Manufacturing Car");
    }
}
