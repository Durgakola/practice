public class PhonePay extends BankAccount {
    private int password = 1234;
    private String username = "naidu";
    public boolean login(int password, String username) {
      //if (this.password == password && this.username == username) {
           // return true;
        //} else {
        //    return false;
      //  }
        return this.password==password && this.username==username;
    }
    public static void main(String[] args){
        PhonePay p=new PhonePay();
        boolean login=p.login(1234,"naidu");
        if(login){
            p.Transfer(2000,987345);
        }
    }
}


