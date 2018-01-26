package Adapter.example1;

public class AdapterClient {

    public static void main(String[] args) {

        // Create on order and add items
//        LegacyOMS oms = new LegacyOMS();

        OMSAdapter oms = new OMSAdapter();

        oms.addItem(new Item("Italian Pizza", 11.99));
        oms.addItem(new Item("Wine", 5.99));
        oms.addItem(new Item("Bear", 2.99));
        oms.addItem(new Item("Almond", 1.99));

        //Create payment
        System.out.println("-----------------------------------");
        oms.makePayment(new Payment("CASH", 20.00));
        oms.makePayment(new Payment("CREDIT", 10.00));
        oms.makePayment(new Payment("DEBIT", 10.00));
        System.out.println("-----------------------------------");
    }
}
