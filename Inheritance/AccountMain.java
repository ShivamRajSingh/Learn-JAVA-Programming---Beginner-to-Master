class Account{
    private long accountNo;
    private long balance;
    private String name;
    private String address;
    private long phoneNo;
    private String dob;

    public Account(){

    }

    public Account(long accountNo, long balance, String name, String address, long phoneNo, String dob){
        this.accountNo = accountNo;
        this.address = address;
        this.balance = balance;
        this.dob = dob;
        this.name = name;
        this.phoneNo = phoneNo;
    }
    // setters
    public void setAddress(String address) {
        this.address = address;
    }
    public void setPhoneNo(long phoneNo) {
        this.phoneNo = phoneNo;
    }
    public void setBalance(long balance) {
        this.balance = balance;
    }

    // getters
    public long getAccountNo() {
        return accountNo;
    }
    public long getBalance() {
        return balance;
    }
    public String getAddress() {
        return address;
    }
    public String getDob() {
        return dob;
    }
    public String getName() {
        return name;
    }
    public long getPhoneNo() {
        return phoneNo;
    }

    // Methods
    public String toString(){
        return "\nAccount Holder : " + name + "\nAccount Number : " + accountNo + "\nBalance : " + balance;
    }


}
class SavingsAccount extends Account{
    public void deposit(long dep) {
        long balance = getBalance() + dep;
        setBalance(balance);
    }

    public void withdraw(long withd) {
        long balance = getBalance() - withd;
        setBalance(balance);
    }

}
class LoanAccount extends Account{
    public void payEMI(long amount){
        long balance = getBalance() - amount;
        setBalance(balance);
    }
    public void repayment(long amount){
        if(getBalance() == amount){
            setBalance(0);
        }
    }
}

public class AccountMain {
    public static void main(String[] args) {
        Account account = new Account(109256879, 75652, "Raghav", "Delhi", 9997365, "30-03-1993");
        System.out.println(account);
    }    
}
