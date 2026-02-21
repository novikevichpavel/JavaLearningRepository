package Homeworks;

public class BankAccount {

    BankAccount(String customerName, int customerId, double customerBalance){
        name = customerName;
        id = customerId;
        balance = customerBalance;
    }

    String name;
    int id;
    double balance;

    double riseSum (double upSum){
        balance = balance + upSum;
        return balance;
    }

    double downSum (double downSum){
        balance = balance - downSum;
        return balance;
    }

    void showInfo(){

        System.out.println("User " + name + " has id: " + id + " and " + balance + " on his bank account");

    }

}

class BankAccountTets {

    public static void main(String[] args) {

        BankAccount myAccount = new BankAccount("Pavel", 27, 470);
        myAccount.riseSum(230);
        myAccount.showInfo();

        myAccount.downSum(230);
        myAccount.showInfo();


    }

}



