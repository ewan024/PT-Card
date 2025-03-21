package pTCard;

import java.util.Scanner;

public class Card {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CheckIn check = new CheckIn(0.0, false);

        System.out.println("How much balance would you like?: ");

        double balance = check.setBalance(sc.nextDouble());

        System.out.println("Balance: $" + balance + "\r\n");

        while (!check.canCheckedIn()) {
            System.out.println("You have invalid balance... Do you wish to add more?: ");

            boolean wantAdd = sc.nextBoolean();

            if (!wantAdd) {
                System.out.println("Okay, bye bye :)");
                return;
            }
            else {
                System.out.println("What amount?: ");
                balance += check.setBalance(sc.nextDouble());

                System.out.println("Current balance: " + balance);
            }
        }

        System.out.println("Did you wish to check in?: ");

        boolean ask = check.askCheckIn(sc.nextBoolean());

        System.out.println("Are you checked in?: " + check.askCheckIn(ask));

        if (ask) {
            balance -= 5.20;
        }
        System.out.println("Current balance: " + balance);

        sc.close();
    }
}
