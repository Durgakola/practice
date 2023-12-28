package Main;

import client.Delivery;
import model.OrderItem;
import service.Biryani;
import service.DeliveryService;
import service.KicheanService;

public class Main {

    public static void main(String []args){
        KicheanService kicheanService=new KicheanService();
        kicheanService.setNameOfOil("Freedom");
        kicheanService.setTypeOfRice("Basmathi Rice");

        DeliveryService deliveryService=new DeliveryService();
        deliveryService.setTypOfService("Online");

        Biryani biryani=new Biryani();
        biryani.setType("Chicken Biryani");

        OrderItem orderItem=new OrderItem();
        orderItem.setBiryani(biryani);

        Delivery delivery=new Delivery();
        delivery.setDeliveryService(deliveryService);
        delivery.setOrderItem(orderItem);
        delivery.setKicheanService(kicheanService);
        delivery.setDeliveryboyname("ramana");

        System.out.println(delivery);
    }
}
