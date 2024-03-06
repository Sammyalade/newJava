package diaryApp;

import org.jetbrains.annotations.NotNull;

import javax.swing.*;

import static account.BankApp.exitApp;

public class DiariesMain {

        private static final Diaries myDiaries = new Diaries();
        public static void main(String[] args) {
            mainMenu();
        }

    private static void mainMenu() {
        String takeInput = input("""
                Diaries  Menu
                1. Create Diary
                2. Create Entry in Diary
                3. Find Diary
                4. Find Entry in Diary
                5. Delete Diary
                6. Delete Entry in Diary
                7. Lock Diary
                8. Unlock Diary
                9. Exit App
                """);
        checkOption(takeInput);
    }

    private static void checkOption(@NotNull String takeInput) {
        switch(takeInput){
            case "1" -> createDiary();
            case "2" -> createEntryInDiary();
            case "3" -> findDiary();
            case "4" -> findEntryInDiary();
            case "5" -> deleteDiary();
            case "6" -> deleteEntryInDiary();
            case "7" -> lockDiary();
            case "8" -> unlockDiary();
            case "9" -> exitApp();
        }
    }

    private static void deleteDiary() {
        String username = (input("Enter your username: "));
        String password = input("Enter your password");
        try {
            myDiaries.deleteDiary(username, password);
            print("Diary deleted successfully");
        } catch (Exception ex){
            print(ex.getMessage());
        } finally {
            mainMenu();
        }
    }

    private static void findDiary() {
        String username = (input("Enter your username: "));
        String password = input("Enter your password: ");
        try {
            print(myDiaries.findDiary(username, password).toString());
        } catch (Exception ex){
            print(ex.getMessage());
        } finally {
            mainMenu();
        }
    }

    private static void createEntryInDiary() {
        String username = input("Enter your username: ");
        String password = input("Enter your password");
        String pin = input("Enter your pin: ");
        String title = input("Title: ");
        String body = input("Body: ");
        try {
            myDiaries.findDiary(username, password).createEntry(Integer.parseInt(pin), title, body);
            print("Diary created successfully");
        } catch (Exception ex){
            print(ex.getMessage());
        } finally {
            mainMenu();
        }
    }

    private static void createDiary(){
            String username = (input("Enter your username: "));
            String password = input("Enter a password");
            String pin = input("Enter lock pin: ");
            try {
                myDiaries.addDiary(username, password, Integer.parseInt(pin));
                print("Diary created successfully");
            } catch (Exception ex){
                print(ex.getMessage());
            } finally {
                mainMenu();
            }
        }



        private static void unlockDiary() {
            String username = input("Enter diary username: ");
            String password = input("Enter your diary password: ");
            String pin = input("Enter your pin: ");
            try {
                myDiaries.findDiary(username, password).unlockDiary(Integer.parseInt(pin));
                print("Diary is unlocked");
            } catch (Exception e) {
                print(e.getMessage());
            } finally {
                mainMenu();
            }
        }

        private static void lockDiary() {
            String username = input("Enter diary username: ");
            String password = input("Enter your diary password: ");
            String pin = input("Enter your pin: ");
            try {
                myDiaries.findDiary(username, password).lockDiary(Integer.parseInt(pin));
                print("Diary is locked");
            } catch (Exception e) {
                print(e.getMessage());
            } finally {
                mainMenu();
            }
        }

        private static void deleteEntryInDiary() {
            String username = input("Enter diary username: ");
            String password = input("Enter your diary password: ");
            String id = input("Enter your id: ");
            String pin = input("Enter your pin: ");
            try {
                myDiaries.findDiary(username, password).deleteEntry(Integer.parseInt(id), Integer.parseInt(pin));
                print("Entry is deleted");

            } catch (Exception e){
                print(e.getMessage());
            } finally {
                mainMenu();
            }
        }

        private static void findEntryInDiary() {
            String username = input("Enter diary username: ");
            String password = input("Enter your diary password: ");
            String id = input("Enter your id: ");
            String pin = input("Enter your pin: ");
            try {
                print(myDiaries.findDiary(username, password).findEntry(Integer.parseInt(id), Integer.parseInt(pin)).toString());
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
