package diaryApp;

import org.jetbrains.annotations.NotNull;

import javax.swing.*;

import static account.BankApp.exitApp;

public class Main {
    private static final Diary diary = new Diary("Sammy", "Password", 1234);

    public static void main(String[] args) {
        mainMenu();
    }

    private static void createEntry(){
        int pin = Integer.parseInt(input("Enter your pin: "));
        String title = input("Enter the title");
        String body = input("Enter the body of the entry: ");
        try {
            diary.createEntry(pin, title, body);
            print("Entry created successfully");
        } catch (Exception ex){
            print(ex.getMessage());
        } finally {
            mainMenu();
        }
    }

    private static void mainMenu() {
        String takeInput = input("""
                Diary Menu
                1. Create Entry
                2. Find Entry
                3. Delete Entry
                4. Lock Diary
                5. Unlock Diary
                """);
        checkOption(takeInput);
    }

    private static void checkOption(@NotNull String takeInput) {
        switch(takeInput){
            case "1" ->  createEntry();
            case "2" -> findEntry();
            case "3" -> DeleteEntry();
            case "4" -> lockDiary();
            case "5" -> unlockDiary();
            case "6" -> exitApp();
        }
    }

    private static void unlockDiary() {
        String pin = input("Enter your pin: ");
        diary.unlockDiary(Integer.parseInt(pin));
        mainMenu();
    }

    private static void lockDiary() {
        String pin = input("Enter your pin: ");
        diary.lockDiary(Integer.parseInt(pin));
        mainMenu();
    }

    private static void DeleteEntry() {
        String id = input("Enter your id: ");
        String pin = input("Enter your pin: ");
        try {
            diary.deleteEntry(Integer.parseInt(id), Integer.parseInt(pin));
        } catch (Exception e){
            print(e.getMessage());
        } finally {
            mainMenu();
        }
    }

    private static void findEntry() {
        String id = input("Enter your id: ");
        String pin = input("Enter your pin: ");
        try {
            diary.findEntry(Integer.parseInt(id), Integer.parseInt(pin));
        } catch (Exception e){
            print(e.getMessage());
        } finally {
            mainMenu();
        }
    }

    private static String input(String display) {
        return JOptionPane.showInputDialog(null, display);
    }
    private static void print(String display) {
        JOptionPane.showMessageDialog(null, display);
    }

}
