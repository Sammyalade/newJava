package phoneBook;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner collector = new Scanner(System.in);
        PhoneBook myPhonebook = new PhoneBook();
        int userInput = 0;
        while (userInput != 7) {
            System.out.println("""
                    
                    PhoneBook App
                    1. Add Contact
                    2. Search with Name
                    3. Search with Phone Number
                    4. Delete saved Contact
                    5. Edit Contact
                    6. Display All Contact
                    7. Exit
                    """);
            System.out.print("Enter choice between 1 to 7: ");
            try {
                userInput = collector.nextInt();
                if (userInput < 0 || userInput > 7){
                    System.out.println("Invalid input. Please Enter numbers between 1 to 7: ");
                    continue;
                }
                switch (userInput) {
                    case 1:
                        System.out.print("Enter contact name: ");
                        String contactName = collector.next();
                        System.out.print("Enter Phone Number: ");
                        String phoneNumber = collector.next();
                        System.out.println("Saving>>>>>>>>>>>");
                        System.out.println("Contact Successfully saved");
                        myPhonebook.addContact(contactName, phoneNumber);
                        break;
                    case 2:
                        System.out.print("Enter a contact name to search: ");
                        String name = collector.next();
                        System.out.println("Searching>>>>>>>>");
                        System.out.println(myPhonebook.searchContact(name));
                        break;
                    case 3:
                        System.out.print("Enter Phone Number to search: ");
                        String number = collector.next();
                        System.out.println("Searching>>>>>>");
                        System.out.println(myPhonebook.searchContactWithPhoneNumber(number));
                        break;
                    case 4:
                        System.out.print("Enter the Contact Name to delete: ");
                        String numberToDelete = collector.next();
                        System.out.println("Deleting>>>>>>>>>");
                        myPhonebook.deleteContact(numberToDelete);
                        System.out.println("Contact Successfully Deleted");
                        break;
                    case 5:
                        System.out.print("Enter contact name to Edit: ");
                        String contactNameToEdit = collector.next();
                        System.out.print("Enter old Phone Number: ");
                        String oldPhoneNumber = collector.next();
                        System.out.print("Enter new Phone Number: ");
                        String newOldNumber = collector.next();
                        System.out.println("Editing>>>>>>>>>>");
                        myPhonebook.editPhoneNumber(contactNameToEdit, oldPhoneNumber, newOldNumber);
                        System.out.println("Contact successfully Edited");
                        break;
                    case 6:
                        System.out.println(myPhonebook.displayContact());
                        break;
                    case 7:
                        System.out.println("Exiting PhoneBook App. Thank you for using");                }
            } catch (InputMismatchException exception) {
                System.out.println("Error, Please Enter only integer value");
                collector.next();
            }

        }



    }
}
