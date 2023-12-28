public class BankAccount1 {
    protected  String inputAccountNum;
    protected int inputPassword;

    protected String bankAccountNum="a234567890";
    protected int bankPassword=123234;
    public BankAccount1(String inputAccountNum,int inputPassword){
        this.inputAccountNum=inputAccountNum;
        this.inputPassword=inputPassword;
    }
    public void transfer(){

        System.out.println("money successfully transfered");
    }
}
