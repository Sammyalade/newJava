package diaryTest;

import diaryApp.Diary;
import diaryApp.Entry;
import diaryApp.exception.DiaryIsLockedException;
import diaryApp.exception.EntryIsEmptyException;
import diaryApp.exception.EntryNotFoundException;
import diaryApp.exception.IncorrectPinException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DiaryTest {

    private Diary myDiary;
    @BeforeEach
    public void initializeDiary(){
        myDiary = new Diary("Username", "Password", 1234);
    }

    @Test
    public void unlockDiary_diaryIsUnlockedTest(){
        myDiary.lockDiary(1234);
        assertTrue(myDiary.isLocked());

        myDiary.unlockDiary(1234);

        assertFalse(myDiary.isLocked());
    }

    @Test
    public void lockDiaryWhenItIsUnlocked_itISLockedTest(){
        myDiary.unlockDiary(1234);
        assertFalse(myDiary.isLocked());

        myDiary.lockDiary(1234);

        assertTrue(myDiary.isLocked());
    }

    @Test
    public void createEntry_numberOfEntryIsOne(){
        assertFalse(myDiary.isLocked());

        myDiary.createEntry(1234, "My Entry", "This is first Entry");

        assertEquals(1, myDiary.checkSizeOfEntry());
    }

    @Test
    public void addEntryAndDeleteIt_numberOfEntriesIsZeroTest(){
        assertFalse(myDiary.isLocked());

        myDiary.createEntry(1234, "My Entry", "This is first Entry");
        myDiary.deleteEntry(1, 1);

        assertEquals(0, myDiary.checkSizeOfEntry());
    }

    @Test
    public void createEntryWhenDiaryIsLocked_throwsDiaryIsLockedExceptionTest(){
        myDiary.lockDiary(1234);
        assertTrue(myDiary.isLocked());

        assertThrows(IncorrectPinException.class, () -> myDiary.createEntry(1244, "My Entry", "This is first Entry"));
    }

    @Test
    public void createEntryAndLockEntry_deleteEntry_throwsDiaryIsLockedExceptionTest(){
        myDiary.unlockDiary(1234);
        myDiary.createEntry(1234, "My Entry", "This is first Entry");
        myDiary.lockDiary(1234);
        assertTrue(myDiary.isLocked());

        assertThrows(DiaryIsLockedException.class, () -> myDiary.deleteEntry(1, 1));
    }

    @Test
    public void addEntry_findEntryWhenDiaryIsUnlocked_returnsEntryTest(){
        myDiary.unlockDiary(1234);
        assertFalse(myDiary.isLocked());
        myDiary.createEntry(1234, "My Entry", "This is first Entry");


        assertTrue(myDiary.findEntry(1) instanceof Entry);
    }

    @Test
    public void addEntry_findEntryWhenDiaryIsLocked_throwsDiaryIsLockedExceptionTest(){
        myDiary.createEntry(1234, "My Entry", "This is first Entry");

        myDiary.lockDiary(1234);
        assertTrue(myDiary.isLocked());

        assertThrows(DiaryIsLockedException.class, () -> myDiary.findEntry(1));
    }

    @Test
    public void addEntry_updateEntryWhenDiaryIsUnlocked_dairyUpdatedTest(){
        assertFalse(myDiary.isLocked());
        myDiary.createEntry(1234, "My Entry", "This is first Entry");

        myDiary.updateEntry(1, "My Entry", "This is my updated entry");

        assertEquals("This is my updated entry", myDiary.findEntry(1).getBody());
    }

    @Test
    public void addEntry_updateEntryWhenDiaryIsLocked_throwsDiaryIsLockedExceptionTest(){
        myDiary.createEntry(1234, "My Entry", "This is first Entry");
        myDiary.lockDiary(1234);
        assertTrue(myDiary.isLocked());

        assertThrows(DiaryIsLockedException.class, () -> myDiary.updateEntry(1, "My Entry", "This is my updated entry"));
    }

    @Test
    public void deleteEntryInDiaryWhenItIsEmpty_throwsEntryIsEmptyExceptionTest(){
        assertFalse(myDiary.isLocked());
        assertEquals(0, myDiary.checkSizeOfEntry());

        assertThrows(EntryIsEmptyException.class, ()-> myDiary.deleteEntry(0, 1));
    }

    @Test
    public void findEntryWhenEntryIsEmpty_throwsEntryIsEmptyExceptionTest(){
        assertFalse(myDiary.isLocked());
        assertEquals(0, myDiary.checkSizeOfEntry());

        assertThrows(EntryIsEmptyException.class, ()-> myDiary.findEntry(0));
    }

    @Test
    public void addTwoEntries_findEntryThatDoesNotExist_throwsEntryDoesNotExistExceptionTest(){
        assertFalse(myDiary.isLocked());

        myDiary.createEntry(1234, "My Entry", "This is first Entry");
        myDiary.createEntry(1234, "My second Entry", "This is second Entry");

        assertThrows(EntryNotFoundException.class, ()-> myDiary.findEntry(100));
    }

    @Test
    public void deleteEntry_findEntryThatWasDeleted_throwsEntryNotFoundExceptionTest(){
        assertFalse(myDiary.isLocked());
        myDiary.createEntry(1234, "My Entry", "This is first Entry");
        myDiary.createEntry(1234, "My second Entry", "This is second Entry");

        myDiary.deleteEntry(1, 1);

        assertThrows(EntryNotFoundException.class, ()-> myDiary.findEntry(1));
    }

    @Test
    public void deleteEntryEntryThatDoesNotExist_throwsEntryDoesNotExistExceptionTest(){
        assertFalse(myDiary.isLocked());
        myDiary.createEntry(1234, "My Entry", "This is first Entry");
        myDiary.createEntry(1234, "My second Entry", "This is second Entry");

        assertThrows(EntryNotFoundException.class, ()->myDiary.deleteEntry(1000, 1));
    }

    @Test
    public void updateEntryWhenListIsEmpty_throwsEntryIsEmpty(){
        assertEquals(0, myDiary.checkSizeOfEntry());

        assertThrows(EntryIsEmptyException.class, ()-> myDiary.updateEntry(1, "My Entry", "This is my updated entry"));
    }

    @Test
    public void updateEntryNotInTheDiary_throwsEntryIsEmpty(){
        myDiary.createEntry(1234, "My Entry", "This is first Entry");
        myDiary.createEntry(1234, "My second Entry", "This is second Entry");

        assertThrows(EntryNotFoundException.class, ()-> myDiary.updateEntry(11, "My Entry", "This is my updated entry"));
    }

    @Test
    public void createNewEntryWhenPinIsWrong_throwsIncorrectPinException(){
        myDiary.createEntry(1234, "My Entry", "This is first Entry");


        assertThrows(IncorrectPinException.class, ()->myDiary.createEntry(1244,"My second Entry", "This is second Entry"));
    }

    @Test
    public void createNewEntry_deleteWithWrongPin_throwsIncorrectPinException(){
        myDiary.createEntry(1234, "My Entry", "This is first Entry");
        assertThrows(IncorrectPinException.class, () ->myDiary.deleteEntry(1234, 1));
    }

//    @Test
//    public void

}
