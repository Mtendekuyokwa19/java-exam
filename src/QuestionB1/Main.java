package QuestionB1;

public class Main {
    public static void main(String[] args) {
        Bank standardBank=new Bank("Standard");
        standardBank.addAccount(new BankAccount(100000,123,100000));
        standardBank.addAccount(new BankAccount(200000,123,200000));
        standardBank.addAccount(new BankAccount(300000,123,600000));
        standardBank.addAccount(new BankAccount(500000,123,800000));
        standardBank.addAccount(new BankAccount(600000,123,700000));
        standardBank.addAccount(new BankAccount(800000,123,900000));
        AutoTM autoTM=new AutoTM(standardBank);
        autoTM.start();
        autoTM.showMenu(autoTM.login());

        autoTM.start();

    }
}
