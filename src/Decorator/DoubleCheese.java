package Decorator;

public class DoubleCheese extends PizzaDecorator {

    public DoubleCheese(Item pizza) {
        super(pizza);
    }

    @Override
    public void prepare() {
        super.prepare();
        System.out.println( " + Double Cheese");
    }
}
