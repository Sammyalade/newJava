package account;

import javax.swing.*;

public class BankApp {
    private final Bank newBank = new Bank("TrustBank");

    public static void main(String[] args) {
        startUpApp();
    }

    private static void startUpApp() {
        String mainMenu = """
                1. Create Account
                2. Deposit
                3. Withdraw
                4. Transfer
                5. Check Balance
                6. Close Account
                7. Exit App
                """;
        switchCase();
    }

    private static void switchCase() {
        switch (inputChoice()){
            case '1' -> createAccount();
            case '2' -> Deposit();
            case '3' -> Withdraw();
            case '4' -> Transfer();
            case '5' -> checkBalance();
            case '6' -> closeAccount();
            case '7' -> exitApp();
        }
    }

    private static String inputChoice(String prompt) {
        return JOptionPane.showInputDialog(prompt);
    }


}
