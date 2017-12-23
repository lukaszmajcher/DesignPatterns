package singleton;

public class Main {
    public static void main(String[] args) {
        Singleton obj1 = Singleton.getInstance();
        obj1.printObj();
        Singleton obj2 = Singleton.getInstance();
        obj2.printObj();
    }
}
