package Adapter.example2;

public class AdapterClient {

    public static void main(String[] args) {
        WildDuck wildDuck = new WildDuck();
        wildDuck.fly();
        wildDuck.quack();

        WildTurkey turkey = new WildTurkey();
        Duck turkeyAdapter = new TurkeyAdapter(turkey);

        System.out.println("-----Turkey say");
        turkey.fly();
        turkey.gobble();


        System.out.println("--------Duck say");
        turkeyAdapter.fly();
        turkeyAdapter.quack();

    }
}
