package ATMmachine;

import java.text.DecimalFormat;
import java.util.*;

public class OptionalMenu extends Account {

    Scanner menuInput = new Scanner(System.in);

    DecimalFormat moneyFormat = new DecimalFormat(" '$' ###, ##0.00 ");

    HashMap<Integer, Integer> data = new HashMap<>();

    int selection;

    // Validate login information, customer number and PIN
    public void getLogin() {
        int x = 1;

        do {
            try {

                data.put(17012002, 1920);
                data.put(12081979, 4243);
                data.put(24032002, 2223);

                System.out.println("Welcome to the ATM Project!");

                System.out.println("Enter your customer number: ");
                setCustomerNumber(menuInput.nextInt());

                System.out.println("Enter your PIN number: ");
                setPinNumber(menuInput.nextInt());

            } catch (Exception e) {

                System.out.println("\n" + "Invalid character. Only numbers." + "\n");
               x = 2;
            }

            for (Map.Entry<Integer, Integer> entry : data.entrySet()) {
                if (entry.getKey() == getCustomerNumber() && entry.getValue() == getPinNumber()) {
                    getAccountType();
                }
            }
            System.out.println("\n" + "Wrong Customer number or PIN number." + "\n");
        } while (x == 1);
    }

    // Display account type menu with selection
    public void getAccountType() {
        System.out.println("Select the account you want you access: ");
        System.out.println("Type 1 - Checking account");
        System.out.println("Type 2 - Saving account");
        System.out.println("Type 3 - Exit");
        System.out.println("Choice: ");

        selection = menuInput.nextInt();

        switch (selection) {
            case 1:
                getChecking();
                break;
            case 2:
                getSaving();
                break;
            case 3:
                System.out.println("Thank You for using this ATM. Have a nice day!");
                break;
            default:
                System.out.println("\n" + "Invalid choice." + "\n");
                getAccountType();
        }
    }

    // Display checking account menu with selection
    public void getChecking() {
        System.out.println("Checking account: ");
        System.out.println("Type 1 - Check balance");
        System.out.println("Type 2 - Withdraw funds");
        System.out.println("Type 3 - Deposit funds");
        System.out.println("Type 4 - Exit");
        System.out.println("Choice: ");

        selection = menuInput.nextInt();

        switch (selection) {
            case 1:
                System.out.println("Checking account balance: " + moneyFormat.format(getCheckingBalance()));
                getAccountType();
                break;
            case 2:
                getCheckingWithdrawInput();
                getAccountType();
                break;
            case 3:
                getCheckingDepositInput();
                getAccountType();
                break;
            case 4:
                System.out.println("Thank You for using this ATM. Have a nice day!");
                break;
            default:
                System.out.println("\n" + "Invalid choice." + "\n");
                getChecking();
        }
    }

    // Display saving account menu with selection
    public void getSaving() {
        System.out.println("Saving account: ");
        System.out.println("Type 1 - Check balance");
        System.out.println("Type 2 - Withdraw funds");
        System.out.println("Type 3 - Deposit funds");
        System.out.println("Type 4 - Exit");
        System.out.println("Choice: ");

        selection = menuInput.nextInt();

        switch (selection) {
            case 1:
                System.out.println("Saving account balance: " + moneyFormat.format(getSavingBalance()));
                getAccountType();
                break;
            case 2:
                getSavingWithdrawInput();
                getAccountType();
                break;
            case 3:
                getSavingDepositInput();
                getAccountType();
                break;
            case 4:
                System.out.println("Thank You for using this ATM. Have a nice day!");
                break;
            default:
                System.out.println("\n" + "Invalid choice." + "\n");
                getSaving();
        }
    }
    }
