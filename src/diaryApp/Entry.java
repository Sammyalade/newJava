package diaryApp;

public class Entry {
    private final int id;
    private String body;
    private String title;

    public Entry(int id, String title, String body) {
        this.title = title;
        this.id = id;
        this.body = body;
    }

    public int getId() {
        return id;
    }

    public String getBody() {
        return body;
    }
    public String toString(){
        return String.format("Title: %s%nBody: %s", this.title, this.body);
    }
}
