package QuestionB2;

import java.util.ArrayList;

public class Member {
    String memberId;
    int pin;
     ArrayList<Book> borrowedBooks=new ArrayList<>();
    int dailyBorrowCount;

    public boolean valiatePin(int pin) {
        return pin!=this.pin;
    }

    public void borrowBook(Book book) {
       borrowedBooks.add(book) ;
    }

    public ArrayList<Book> getBorrowedBook(int pin) {
        return borrowedBooks;
    }
    public void resetBorrowedBookCount(){
      dailyBorrowCount=0;
    }
}
