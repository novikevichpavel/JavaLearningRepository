package Lesson5;

public class Human {

    String name;
    Car3 car;
    BankAccount userAccount;

    void showInfo(){
        System.out.println("Humans name is " + name + ". " + name + " has " + car.color + " car. " + name + " has " + userAccount.balance + " on his bank account.");
    }

}

class HumanTest{

    public static void main(String[] args) {

        Human human = new Human();
        human.name = "Pavel";
        human.car = new Car3("Black", "v8");
        human.userAccount = new BankAccount(245, 1000);
        human.showInfo();

    }

}

class Car3{

    Car3(String carsColor, String carsEngine){
        color = carsColor;
        engine = carsEngine;
    }

    String color;
    String engine;
}

class BankAccount{

    BankAccount(int accountId, double accountBalance) {
        id = accountId;
        balance = accountBalance;
    }

    int id;
    double balance;
}