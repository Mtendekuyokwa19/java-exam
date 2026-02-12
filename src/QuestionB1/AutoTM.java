package QuestionB1;

import java.util.Scanner;

public class AutoTM {
    Bank bank;
    double dailyLimit=200000;

    public AutoTM(Bank bank) {
        this.bank = bank;
    }
    public void start(){
        System.out.println("Welcome to"+bank.name);
    }
    public BankAccount login(){
        Scanner readAccountNumber=new Scanner(System.in);
        Scanner readPin=new Scanner(System.in);
        int pin=0;
        long accNum=0;
        System.out.println("Enter account number");
        accNum=readAccountNumber.nextLong();
        System.out.println("Enter pin ");
        pin=readPin.nextInt();
        return bank.authenticate(accNum,pin);
    }
    public void showMenu(BankAccount account){
        System.out.println("*************************");
        System.out.println("1.Check balance");
        System.out.println("2.withdraw");
        System.out.println("*************************");
    }
    public void processWithDraw(BankAccount account,double amount){
        bank.findAccount(account.accountNumber).withdraw(amount);
    }
}
