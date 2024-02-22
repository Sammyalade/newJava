package account;

import java.util.Scanner;

public class BankApp {
    private Bank newBank;

    public void mainMethod(){
        Scanner collector = new Scanner(System.in);
        int userInput = 0;
        while(userInput !=3){
            System.out.println("""
            WELCOME TO GUARANTY TRUST BANK PLC
             WE HOPE TO SERVE YOU WELL TODAY
                1. Existing User
                2. New User
                3. Exit app
                """);
            userInput = collector.nextInt();
            switch (userInput){
                int userMenuInput = 0;
                while(userMenuInput != 8){
                    System.out.println("""
                    1. Deposit
                    2. Withdraw
                    3. Transfer
                    4. CheckBalance
                    5. Remove Account
                    6. Find Account
                    7. Go back to main Menu
                    8. Exit app
                    """);
                    userMenuInput = collector.nextInt();
                    if (userMenuInput == 7) break;
                    switch (userMenuInput){
                        case 1:
                            System.out.println("Enter amount: ");
                            int amount = collector.nextInt();
                            System.out.println("Enter Account Number: ");
                            int accountNumber = collector.nextInt();
                            newBank.deposit(amount, accountNumber);
                            System.out.println("Deposit Successful>>>>>>>>");
                            break;
                        case 2:

                    }
                }
                    int userChoice = 0;
                    while (userChoice != 1){
                        newBank.deposit();
                    }
            }
        }
    }
}
