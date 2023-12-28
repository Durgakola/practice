public class PhonePay2 extends BankAccount2 {
    protected int a=30;
     protected int b=40;

    public static void main(String[] args){
        BankAccount2 phonepay = new BankAccount2();
        System.out.println(phonepay.a);
        System.out.println(phonepay.b);
        PhonePay2 p=new PhonePay2();
        System.out.println(p.a);
        System.out.println(p.b);

        Object obj=new PhonePay2();
        System.out.println(((PhonePay2)obj).a);







    }
}
