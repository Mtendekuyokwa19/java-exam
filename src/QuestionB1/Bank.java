package QuestionB1;

import java.util.ArrayList;

public class Bank {
    String name;
    ArrayList<BankAccount> bankAccounts;

    public Bank(String name) {
        this.name = name;
        this.bankAccounts=new ArrayList<>();
    }
    void addAccount(BankAccount account){
        bankAccounts.add(account);
    }
    BankAccount findAccount(long accountNumber){
        for (BankAccount bankAccount : bankAccounts) {
           if (bankAccount.accountNumber==accountNumber){
               return bankAccount;
           }
        }
        return null;
    }
    BankAccount authenticate(long accountNumber,int pin){
        for (BankAccount bankAccount : bankAccounts) {
           if (bankAccount.accountNumber==accountNumber && pin==bankAccount.pin){
               return bankAccount;
           }

        }
        return null;
    }
    Double getTotalWithDrawsForDay(){
        double total=0;
        for (BankAccount bankAccount : bankAccounts) {
           total+=bankAccount.getDailyWithDrawnAmount();
        }
        return total;
    }

}
