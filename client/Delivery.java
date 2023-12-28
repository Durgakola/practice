package client;

import model.OrderItem;
import service.DeliveryService;
import service.KicheanService;

public class Delivery {
    private String deliveryboyname;
    private DeliveryService deliveryService;
    private KicheanService kicheanService;

    private OrderItem orderItem;

    public KicheanService getKicheanService(){

        return kicheanService;
    }

    public void setKicheanService(KicheanService kicheanService){

        this.kicheanService=kicheanService;
    }
    public String getDeliveryboyname(){

        return deliveryboyname;
    }
    public void setDeliveryboyname(String deliveryboyname){

        this.deliveryboyname=deliveryboyname;
    }
    public DeliveryService getDeliveryService(){
        return deliveryService;
    }

    public void setDeliveryService(DeliveryService deliveryService){
        this.deliveryService=deliveryService;
    }
    public OrderItem getOrderItem(){
        return orderItem;
    }
    public void setOrderItem(OrderItem orderItem){
        this.orderItem=orderItem;
    }

    @Override
    public String toString(){
        return "Delivery [deliveryboyname=" + deliveryboyname + ",deliveryService=" + deliveryService +",kicheanService=" +
                kicheanService + ", orderItem=" + orderItem + "]";
    }
}
