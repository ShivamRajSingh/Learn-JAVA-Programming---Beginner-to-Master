package Interfaces;

interface IMember{
    public void callback();
}
class Store{
    private IMember mem[] = new IMember[100];
    private int count = 0;

    public void register(IMember m ){
        mem[count++] = m;
    }

    public void inviteToSale(){
        for(int i =0; i < count; i++){
            mem[i].callback();
        }
    }

}
class Customer implements IMember{
    private String name;
    Customer(){
        name = "XYZ";
    }
    Customer(String name){
        this.name = name;
    }
    public void callback(){
        System.out.println("OK, " + name + " will visit!" );
    }
}
public class StudentChallenge {
    public static void main(String[] args) {
        Store s = new Store();
        Customer c1 = new Customer("Raganathswamy");
        Customer c2 = new Customer("Jagannathswamy");
        
        s.register(c1);
        s.register(c2);
       
        s.inviteToSale();
    }
}
