package diaryApp;

import java.util.ArrayList;
import java.util.List;

public class Diaries {


    private int numberOfDiaries;
    private List<Diary> diaries = new ArrayList<>();

    public void addDiary(String username, String password, int pin) {
        diaries.add(new Diary(username, password, pin));
        numberOfDiaries++;
    }

    public int getSizeOfDiaries() {
        return numberOfDiaries;
    }

    public Diary findDiary(String userName, String password) {
        for(Diary diary: diaries){
            if (diary.getUserName().equals(userName))
                return diary;
        }
        throw new  RuntimeException("Diary not found");
    }
}
