package Decorator;

public class Spicy extends PizzaDecorator {

    public Spicy(Item inner) {
        super(inner);
    }

    @Override
    public void prepare() {
        super.prepare();
        System.out.println(" + Spycy");
    }
}
