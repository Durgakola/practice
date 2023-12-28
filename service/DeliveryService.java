package service;

public class DeliveryService {
    private String typOfService;

    public String getTypOfService(){

        return typOfService;
    }

    public void setTypOfService(String typOfService){

        this.typOfService=typOfService;
    }

    @Override
    public String toString(){

        return "DeliveryService [typOfService=" + typOfService +"]";
    }
}
