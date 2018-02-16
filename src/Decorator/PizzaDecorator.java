package Decorator;

abstract class PizzaDecorator implements Item{
    private Item pizza;

    public PizzaDecorator(Item pizza) {
        this.pizza = pizza;
    }

    @Override
    public void prepare() {
        pizza.prepare();
    }
}
