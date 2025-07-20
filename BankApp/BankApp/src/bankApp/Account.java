package bankApp;

public class Account {
    private int balance;
    private String correctPin;


    public int getBalance() {
        return balance;
    }
    public String getCorrectPin() {
        return correctPin;
    }

    public void deposit(int amount) {
        if (amount < 0) return;
  balance = balance + amount;
    }


    public void withdraw(int amount, String pin) {
        if (amount < 0) return;
        if(!pin.equals("correctPin") && amount > balance ) {
            return;
        }
        else if(pin.equals("correctPin") && amount < balance){
            balance = balance - amount;
        }

    }

}


