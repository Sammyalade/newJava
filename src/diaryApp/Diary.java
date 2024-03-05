package diaryApp;

import diaryApp.exception.DiaryIsLockedException;
import diaryApp.exception.EntryIsEmptyException;
import diaryApp.exception.EntryNotFoundException;
import diaryApp.exception.IncorrectPinException;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;

public class Diary {

    private String userName;
    private String password;
    private final int pin;
    private boolean isLocked;
    private int generateId;
    private final List<Entry> entries = new ArrayList<>();

    public Diary(String username, String password, int pin) {
        this.userName = username;
        this.password = password;
        this.pin = pin;

    }

    public boolean isLocked() {
        return isLocked;
    }

    public void lockDiary(int pin){
        if(isIncorrectPin(pin)) throw new IncorrectPinException("Incorrect Pin");
        else isLocked = true;
    }

    private boolean isIncorrectPin(int pin) {
        return this.pin != pin;
    }

    public void unlockDiary(int pin) {
        if(isIncorrectPin(pin)) throw new IncorrectPinException("Incorrect Pin");
        else isLocked = false;
    }

    public void createEntry(int pin, String title, String body) {
        generateId++;
        unlockDiary(pin);
        entries.add(new Entry(generateId, title, body));
    }

    @NotNull
    private static DiaryIsLockedException checkDiaryIsLocked() {
        return getDiaryIsLocked();
    }

    public int checkSizeOfEntry() {
        return generateId;
    }

    public void deleteEntry(int id, int pin) {
        if (isIncorrectPin(pin)) throw new IncorrectPinException("Incorrect Pin");
        entries.remove(findEntry(id, 1234));
        generateId--;
    }


    @NotNull
    private static EntryIsEmptyException getEntryIsEmpty() {
        return new EntryIsEmptyException("Entry is Empty");
    }

    @NotNull
    private static DiaryIsLockedException getDiaryIsLocked() {
        return new DiaryIsLockedException("Diary is Locked");
    }

    public Entry findEntry(int id, int pin) {
        if (isLocked) throw getDiaryIsLocked();
        else if(entries.isEmpty()) {throw getEntryIsEmpty();}
        else if (isIncorrectPin(pin)) {
            throw new IncorrectPinException("Incorrect Pin");
        } else {
            for(Entry entry: entries){
                if (entry.getId() == id){
                    return entry;
                }
            }
        }
        throw new EntryNotFoundException("Entry not found");
    }

    public void updateEntry(int id, String title, String body) {
        if (isLocked) {throw getDiaryIsLocked();}
        else {
                Entry newEntry = new Entry(id, title, body);
                entries.set(entries.indexOf(findEntry(id, 1234)), newEntry);
        }
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }
}
