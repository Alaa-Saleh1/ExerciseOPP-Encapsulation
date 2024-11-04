package Main;

public class Account {

    private String id;
    private String name;
    private int balance;


    Account(){
    }
    Account(String id,String name){
        this.id=id;
        this.name=name;
    }
    Account(String id, String name,int balance){
        this.id=id;
        this.name=name;
        this.balance=balance;
    }
    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public String getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public int getBalance() {
        return this.balance;
    }

    public int credit(int amount){
       return this.balance +=amount;
    }


    public int debit(int amount){
        if (amount <= this.balance){
            this.balance-=amount;
            return amount;
        }else {
            return 0;
        }

    }

    public int transferTo(Account receive_account, int amount ){
        if (debit(amount)>0){
            receive_account.credit(amount);
            return 1;
        }else
            return -1;
    }


    public String toString(){
        return "Account ID : "+getId()+"\nAccount Name : "+getName()+"\nAcount Balance : "+getBalance();
    }




}
