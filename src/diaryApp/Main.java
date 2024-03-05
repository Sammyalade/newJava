package diaryApp;

import javax.swing.*;

public class Main {
    private static final Diary diary = new Diary("Sammy", "Password", 1234);

    public static void main(String[] args) {

    }

    private static void createEntry(int pin, String title, String body){
        diary.createEntry(pin, title, body);
        print("Entry created successfully");
    }

    private static String input(String display) {
        return JOptionPane.showInputDialog(null, display);
    }
    private static void print(String display) {
        JOptionPane.showMessageDialog(null, display);
    }

}
