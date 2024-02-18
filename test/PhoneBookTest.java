import phoneBook.PhoneBook;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PhoneBookTest {

    private PhoneBook myPhoneBook;

    @BeforeEach
    public void initializeMyPhoneBook(){
        myPhoneBook = new PhoneBook();
    }

    @Test
    public void addContactToPhoneBook_contactAddedSuccessfullyTest(){
        myPhoneBook.addContact("Sammy", "07033675033");
        HashMap<String, String> checker = new HashMap<>();
        checker.put("Sammy", "07033675033");
        assertEquals(checker, myPhoneBook.getContacts());
    }

    @Test
    public void searchContactInPhonebookWhenContactIsSavedThere_contactDisplayedTest(){
        myPhoneBook.addContact("Sammy", "07033675033");
        assertEquals("Sammy : 07033675033", myPhoneBook.searchContact("Sammy"));
    }

    @Test
    public void searchContactInPhonebookWhenContactIsNotSavedThere_contactNotFoundTest(){
        assertEquals("Contact not found", myPhoneBook.searchContact("Sammy"));
    }

    @Test
    public void deleteContactSaved_contactSuccessfullyDeletedTest(){
        myPhoneBook.addContact("sammy", "07033675033");
        myPhoneBook.deleteContact("sammy");
        assertEquals("Contact not found", myPhoneBook.searchContact("sammy"));
    }

    @Test
    public void searchContactWithPhoneNumber_ContactDisplayedTest(){
        myPhoneBook.addContact("sammy", "07033675033");
        myPhoneBook.searchContactWithPhoneNumber("07033675033");
        assertEquals("sammy : 07033675033", myPhoneBook.searchContactWithPhoneNumber("07033675033"));
    }
    @Test
    public void editSavedPhoneNumber_savedPhoneNumberEditedTest(){
        myPhoneBook.addContact("sammy", "07033675033");
        myPhoneBook.editPhoneNumber("sammy", "07033675033", "07017097004");
        HashMap<String, String> checker = new HashMap<>();
        checker.put("sammy", "07017097004");
        assertEquals(checker, myPhoneBook.getContacts());
    }

    @Test
    public void displaySavedContact_savedContactDisplayed(){
        myPhoneBook.addContact("sammy", "07033675033");
        assertEquals("sammy : 07033675033", myPhoneBook.displayContact());

    }
}
