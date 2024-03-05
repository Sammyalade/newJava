package diaryTest;

import diaryApp.Diaries;
import diaryApp.Diary;
import diaryApp.exception.IncorrectPinException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DiariesTest {

    private Diaries myDiaries;
    @BeforeEach
    public void initializeDiaries(){
        myDiaries = new Diaries();
    }

    @Test
    public void addNewDiaryToAnEmptyListOfDiaries_DiaryIsAdded(){
        myDiaries.addDiary("username", "password", 1234);
        assertEquals(1, myDiaries.getSizeOfDiaries());
    }

    @Test
    public void addNewEntryToAListOfDiaries_DiaryIsAdded(){
        myDiaries.addDiary("username", "password", 1234);
        myDiaries.addDiary("username2", "password2", 1234);
        assertEquals(2, myDiaries.getSizeOfDiaries());

        myDiaries.addDiary("username3", "password3", 1234);
        assertEquals(3, myDiaries.getSizeOfDiaries());
    }

    @Test
    public void findEntryInAList_returnsDiary(){
        myDiaries.addDiary("username", "password", 1234);
        myDiaries.addDiary("username2", "password2", 1234);
        assertEquals(2, myDiaries.getSizeOfDiaries());

        assertTrue(myDiaries.findDiary("username", "password") instanceof Diary);
    }

    @Test
    public void accessDiaryWhenPasswordIsWrong_throwsIncorrectPasswordException(){
        myDiaries.addDiary("username", "password", 1234);
        assertThrows(IncorrectPinException.class, () ->myDiaries.findDiary("username", "pasword"));

    }

    @Test
    public void deleteDiary_findDeletedDiary_throwsExceptionTest(){
        myDiaries.addDiary("username", "password", 1234);
        myDiaries.addDiary("username2", "password2", 2234);
        myDiaries.deleteDiary("username", "password");
        assertThrows(RuntimeException.class, ()->myDiaries.findDiary("username", "password"));
    }

    @Test
    public void deleteWithWrongPassword_throwsException(){
        myDiaries.addDiary("username", "password", 1234);
        myDiaries.addDiary("username2", "password2", 2234);
        assertThrows(IncorrectPinException.class, ()->myDiaries.deleteDiary("username", "passwod"));
    }

    @Test
    public void createDiaryWithEmptyUsername_throwsExceptionTest(){
        assertThrows(RuntimeException.class, ()-> myDiaries.addDiary("", "", 1234));
    }

    @Test
    public void add2DiariesWithTheSameUsername_throwsException(){
        myDiaries.addDiary("username", "password", 1234);
        assertThrows(RuntimeException.class, ()-> myDiaries.addDiary("username", "password", 1234));
    }
}
