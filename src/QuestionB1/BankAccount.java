package QuestionB1;

import java.util.ArrayList;

public class BankAccount {
    long accountNumber;
    int pin;
    double balance;
double dailyWithDrawnAmount=0;
double withdrawlimit=200000;
ArrayList<Double> todaysWithdraws=new ArrayList<>();

    public double getDailyWithDrawnAmount() {

        for (Double todaysWithdraw : todaysWithdraws) {
           dailyWithDrawnAmount+=todaysWithdraw;
        }
        return  dailyWithDrawnAmount;
    }

    public BankAccount(long accountNumber, int pin, double balance) {
        this.accountNumber = accountNumber;
        this.pin = pin;
        this.balance = balance;
    }
    public boolean validatePin(int pin){
        return pin==this.pin;
    }

    public double getBalance() {
        return balance;
    }
    public void resetDailyWithdraw(){
        todaysWithdraws=new ArrayList<>();
    }
    public boolean withdraw(double amount){
        if (!hasExceededWithDrawLimit()&&(balance-amount)>withdrawlimit){
           balance-=amount;
            System.out.println("WithDraw suceesfull");
            todaysWithdraws.add(amount);
            return true;
        }
        else {

            System.out.println("You have Exceded withdraw limit or your are about to over withdraw");

            return true;
        }


    }
    boolean hasExceededWithDrawLimit(){
        double total=0;
        for (Double todaysWithdraw : todaysWithdraws) {
            total+=todaysWithdraw;
        };
        if (total==withdrawlimit){
            return true;
        }
        return false;
    }
}
