public class PhonePay1 extends BankAccount1{
    public PhonePay1(String accountNum,int passWord){
        super(accountNum,passWord);
    }
    public boolean login(){
      return this.bankAccountNum.equalsIgnoreCase(inputAccountNum) && this.bankPassword==inputPassword;
    }
    public static void main(String[] args){
        PhonePay1 p=new PhonePay1("a234567890",123234);
        boolean log=p.login();
        if(log){
            p.transfer();
        }
    }

}
