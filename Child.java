public class Child extends Super{
     int age=24;

    public void transfer() {
        System.out.println("child money is transfered successfully");
    }
    public static void main(String[] args){
        Super superref=new Child();
        ((Child)superref).transfer();
       //System.out.println((Child)superref).age);
        System.out.println(superref.hashCode());


    }
}
