package Decorator;

public class DeepFried extends PizzaDecorator {

    public DeepFried(Item pizza) {
        super(pizza);
    }

    @Override
    public void prepare() {
        super.prepare();
        System.out.println(" + Deep Fried");
    }
}
