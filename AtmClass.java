public class AtmClass {
    public Person getGenaratePin(Person p) {
        if (p.getPassword()==123) {
            return p;
        } else {
            return null;
        }
    }
    public static void main(String[]args){
        Person obj=new Person("Rama",123);
        Person obj1=new Person("suma",12345);

        AtmClass atm=new AtmClass();
        Person p1validpassword=atm.getGenaratePin(obj);
        Person p2validpassword=atm.getGenaratePin(obj1);

        if(p1validpassword!=null){
            System.out.println(p1validpassword.getPassword());
        }
        if(p2validpassword!=null){
            System.out.println(p2validpassword.getPassword());
        }
    }
}
