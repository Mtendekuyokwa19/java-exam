package QuestionB2;

public class Book {
    String bookId;
    String author;
    String title;
    boolean isAvailable;

    public void markASReturned() {
        isAvailable = !isAvailable;
    }

    public void markAsBorrowed() {
        isAvailable = !isAvailable;
    }

    public boolean isAvailable() {
        return isAvailable;
    }
}
