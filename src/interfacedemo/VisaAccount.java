package interfacedemo;

public class VisaAccount implements Account{
    private double balance;
    private float interestRates;
    VisaAccount(){
        balance = 0;
        interestRates = 50;
    }
    @Override
    public void withdraw(double amount) {
        if(amount<=balance){
            balance -= amount;
        }else {
            System.out.println("Insufficient balance !!!!");
        }
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
    }

    @Override
    public double checkBalance() {
        return balance;
    }

    @Override
    public double calculateInterest() {
        return (balance * (interestRates/100));
    }
}
