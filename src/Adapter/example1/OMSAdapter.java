package Adapter.example1;

public class OMSAdapter {

    private NewOMS newOMS;

    public OMSAdapter(){
        newOMS = new NewOMS();
    }

    public void addItem(Item item){
        convertXmlToJson(item);
        newOMS.addItem(item);
    }

    public void makePayment(Payment payment){
        convertXmlToJson(payment);
        newOMS.makePayment(payment);
    }

    private void convertXmlToJson(Object o){
        System.out.println("Converted from XML to JSON");
    }
}
