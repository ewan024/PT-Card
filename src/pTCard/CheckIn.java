package pTCard;

import java.util.Scanner;

public class CheckIn {

    Scanner sc = new Scanner(System.in);

    private double balance;
    private boolean checkedIn;

    public CheckIn(double balance, boolean checkedIn) {
        this.balance = balance;
        this.checkedIn = checkedIn;
    }

    public boolean canCheckedIn() {
        if (balance < 5.20) {
            return false;
        }
        else {
            return true;
        }
    }

    public double getBalance() {
        return balance;
    }

    public boolean askCheckIn(boolean checkedIn) {
        this.checkedIn = checkedIn;

        return checkedIn;
    }

    public double setBalance(double balance) {
        this.balance += balance;

        return balance;
    }
}
