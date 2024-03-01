package diaryTest;

import diaryApp.Diaries;
import diaryApp.Diary;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

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
        Diary newDiary = myDiaries.findDiary("username", "pasword");


    }
}
