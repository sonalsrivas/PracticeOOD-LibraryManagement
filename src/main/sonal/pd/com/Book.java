package main.sonal.pd.com;

import java.util.ArrayList;
import java.util.Date;

public class Book {
    String title;
    String author;
    String subject;
    Date publicationDate;
    private ArrayList<BookItem> bookItemArrayList;
    public BookItem returnAnAvailableBookItem(){
        for (BookItem bookItem: bookItemArrayList) {
            if (bookItem.getStatus()==StatusBookItem.Available){
                return bookItem;
            }
        }
        return null;
    }
}
