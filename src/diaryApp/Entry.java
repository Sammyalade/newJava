package diaryApp;

public class Entry {
    private final int id;
    private String body;

    public Entry(int id, String title, String body) {
        this.id = id;
        this.body = body;
    }

    public int getId() {
        return id;
    }

    public String getBody() {
        return body;
    }
}
