package diaryApp;

import diaryApp.exception.IncorrectPinException;

import java.util.ArrayList;
import java.util.List;

public class Diaries {


    private int numberOfDiaries;
    private List<Diary> diaries = new ArrayList<>();

    public void addDiary(String username, String password, int pin) {
        if (isEmptyUsernameOrPassword(username, password)) throw new IllegalArgumentException("Username or Password cannot be empty");
        for(Diary diary: diaries){
            if (diary.getUserName().equals(username)) throw new RuntimeException("Username already taken");
        }
        diaries.add(new Diary(username, password, pin));
        numberOfDiaries++;
    }

    private static boolean isEmptyUsernameOrPassword(String username, String password) {
        return username.isEmpty() || password.isEmpty();
    }

    public int getSizeOfDiaries() {
        return numberOfDiaries;
    }

    public Diary findDiary(String userName, String password) {
        for(Diary diary: diaries){
            if (diary.getUserName().equals(userName)){
                if (diary.getPassword().equals(password)) {
                    return diary;
                } else{
                    throw new IncorrectPinException("Incorrect Pin");
                }
            }
        }
        throw new  RuntimeException("Diary not found");
    }

    public void deleteDiary(String username, String password) {
        diaries.remove(findDiary(username, password));
    }
}
