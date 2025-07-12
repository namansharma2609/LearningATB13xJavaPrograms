package ex_21_Encapsulation;

public class Lab190_Bank {

    public static void main(String[] args) {

        ICICI aman = new ICICI("Aman",1000);

        long bal = aman.getBalance();
        System.out.println(bal);

        String account_name = aman.getName();
        System.out.println(account_name);

        aman.setBalance(200,true);
        long bal2 = aman.getBalance();
        System.out.println(bal2);

    }

}

class ICICI{
    private String name;
    private long balance;

    ICICI(String name, long balance){
        this.name = name;
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public long getBalance(){
        return balance;
    }

    public void setBalance(long balance, boolean isCashier){
        if(isCashier){
            this.balance = balance;
        }
        else {
            System.out.println("Cannot set Balance");
        }
    }
}
