package account;

import javax.swing.*;

public class BankApp {
    private static final Bank newBank = new Bank("TrustBank");

    public static void main(String[] args) {
        startUpApp();
    }

    private static void startUpApp() {
        String mainMenu = """
                Welcome to Trust Bank
                1. Create Account
                2. Deposit
                3. Withdraw
                4. Transfer
                5. Check Balance
                6. Close Account
                7. Exit App
                """;
        switchCase(input(mainMenu));
    }

    private static String input(String display) {
        return JOptionPane.showInputDialog(null, display);
    }

    private static void switchCase(String input) {
        switch (input){
            case "1" -> createAccount();
            case "2" -> Deposit();
            case "3" -> Withdraw();
            case "4" -> Transfer();
            case "5" -> checkBalance();
            case "6" -> closeAccount();
            case "7" -> exitApp();
        }
    }

    private static void exitApp() {
        System.exit(0);
    }

    private static void closeAccount() {
        String accountNumber = input("Enter Account Number: ");
        String pin = input("Enter pin");
        try {
            newBank.remove(Integer.parseInt(accountNumber), pin);
            print("Account successfully closed");
        } catch (Exception ex){
            print("Incorrect account number or pin");
        } finally {
            startUpApp();
        }
    }

    private static void checkBalance() {
        String accountNumber = input("Enter your Account Number: ");
        String pin = input("Enter Pin: ");
        try {
            print("Your Balance is " + newBank.checkBalance(Integer.parseInt(accountNumber), pin));
        } catch (Exception ex){
            print("Enter a correct pin and try again");
        } finally {
            startUpApp();
        }
    }

    private static void Transfer() {
        String amount = input("Enter amount to deposit: ");
        String sender = input("Enter your Account Number: ");
        String receiver = input("Enter your Account Number: ");
        String pin = input("Enter Pin: ");
        try {
            newBank.transfer(Integer.parseInt(sender), Integer.parseInt(receiver), Integer.parseInt(amount), pin);
            print("Transfer successful");
        } catch(Exception ex){
            print("Please enter the right set of information and pin and try again");
        } finally {
            startUpApp();
        }

    }

    private static void Withdraw() {
        String amount = input("Enter amount to deposit: ");
        String accountNumber = input("Enter your Account Number: ");
        String pin = input("Enter Pin: ");
        try {
            newBank.withdraw(Integer.parseInt(amount), Integer.parseInt(accountNumber), pin);
            print("Withdrawal success");
        }  catch (Exception ex){
            print("Please try again");
        } finally {
            startUpApp();
        }
    }

    private static void Deposit() {
        String amount = input("Enter amount to deposit: ");
        String accountNumber = input("Enter your Account Number: ");
        try {
            newBank.deposit(Integer.parseInt(accountNumber), Integer.parseInt(amount));
            print("Deposit successful");
        } catch (Exception ex){
            print("Enter a sensible amount and a correct account number");
        } finally {
            startUpApp();
        }

    }

    private static void createAccount() {
        String firstName = input("Enter First Name: ");
        String lastName = input("Enter Last Name: ");
        String pin = input("Set pin: ");
        newBank.register(firstName, lastName, pin);
        print("Account successfully registered");
        startUpApp();
    }

    private static void print(String display) {
        JOptionPane.showMessageDialog(null, display);
    }


}
