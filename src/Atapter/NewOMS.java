package Atapter;

import java.util.ArrayList;
import java.util.List;

public class NewOMS {

    /* The new OMS accepts input in JSON format */

    List cart = new ArrayList();
    List payments = new ArrayList();

    public void addItem(Item itemJson){
        cart.add(itemJson);
        System.out.println(itemJson.getName() + " " + itemJson.getPrice());
    }

    public void makePayment(Payment paymentJson){
        payments.add(paymentJson);
        paymentJson.pay();
    }
}
