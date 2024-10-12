package access;

public class BankAccount {
    private int balance;

    public BankAccount() {
        this.balance = 0;
    }

    public void deposit(int amount) {
        if(isAnountValid(amount)) {
            balance += amount;
        } else {
            System.out.println("유효하지 않은 금액 입니다.");
        }
    }

    private boolean isAnountValid(int amount){
        return amount > 0;
    }

    public void withdraw(int amount) {
        if(isAnountValid(amount) && balance >= amount) {
            balance -= amount;
        } else {
            System.out.println("유효하지 않은 금액이거나 잔액 부족입니다.");
        }
    }

    public int getBalance(){
        return balance;
    }
}
