package ATMmachine;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Account {

    private int customerNumber;
    private int pinNumber;
    private double checkingBalance = 0;
    private double savingBalance = 0;

    Scanner input = new Scanner(System.in);
    DecimalFormat moneyFormat = new DecimalFormat(" '$' ###, ##0.00");

    // Set customer number
    public int setCustomerNumber(int customerNumber) {
        this.customerNumber = customerNumber;
        return customerNumber;
    }

    // Get customer number
    public int getCustomerNumber() {
        return customerNumber;
    }

    // Set PIN
    public int setPinNumber(int pinNumber) {
        this.pinNumber = pinNumber;
        return pinNumber;
    }

    // Get PIN
    public int getPinNumber() {
        return pinNumber;
    }

    // Get checking account balance
    public double getCheckingBalance() {
        return checkingBalance;
    }

    // Get saving account balance
    public double getSavingBalance() {
        return savingBalance;
    }

    // Calculate checking account withdrawal
    public double calcCheckingWithdraw(double amount) {
        checkingBalance = (checkingBalance - amount);
        return checkingBalance;
    }

    // Calculate saving account withdrawal
    public double calcSavingBalance(double amount) {
        checkingBalance = (checkingBalance - amount);
        return savingBalance;
    }

    // Calculate checking account deposit
    public double calcCheckingDeposit(double amount) {
        checkingBalance = (checkingBalance + amount);
        return checkingBalance;
    }

    // Calculate saving account deposit
    public double calcSavingDeposit(double amount) {
        savingBalance = (savingBalance + amount);
        return savingBalance;
    }


    // Customer checking account withdraw input
    public void getCheckingWithdrawInput() {
        System.out.println("Checking account balance: " + moneyFormat.format(checkingBalance));
        System.out.println("Amount You want to withdraw from checking account: ");
        double amount = input.nextDouble();

        if ((checkingBalance - amount) >= 0) {
            calcCheckingWithdraw(amount);
            System.out.println("New checking account balance: " + moneyFormat.format(checkingBalance));
        } else {
            System.out.println("Balance cannot be negative." + "\n");
        }
    }


    // Customer saving account withdraw input
    public void getSavingWithdrawInput() {
        System.out.println("Saving account balance: " + moneyFormat.format(savingBalance));
        System.out.println("Amount You want to withdraw from saving account: ");
        double amount = input.nextDouble();

        if((savingBalance - amount) >= 0) {
            calcSavingBalance(amount);
            System.out.println("New saving account balance: " + savingBalance + "\n");
        } else {
            System.out.println("Balance cannot be negative." + "\n");
        }
    }


    // Customer checking account deposit input
    public void getCheckingDepositInput() {
        System.out.println("Checking account balance: " + moneyFormat.format(checkingBalance));
        System.out.println("Amount You want to deposit from checking account: ");
        double amount = input.nextDouble();

        if((checkingBalance + amount) >= 0) {
            calcCheckingDeposit(amount);
            System.out.println("New checking account balance: " + moneyFormat.format(checkingBalance));
        } else {
            System.out.println("Balance cannot be negative." + '\n');
        }
    }


    // Customer saving account deposit input
    public void getSavingDepositInput() {
        System.out.println("Saving account balance: " + moneyFormat.format(savingBalance));
        System.out.println("Amount You want to deposit from saving account: ");
        double amount = input.nextDouble();

        if((savingBalance + amount) >= 0) {
            calcSavingDeposit(amount);
            System.out.println("New saving account balance: " + moneyFormat.format(savingBalance));
        } else {
            System.out.println("Balance cannot be negative." + "\n");
        }
    }
}
