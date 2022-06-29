package main.sonal.pd.com;

import java.util.Calendar;
import java.util.HashMap;

public class AccountHolder {
    HashMap<BookItem, Calendar> bookItemsCurrentlyCheckedOutAndDate;
    HashMap<BookItem, Calendar> bookItemsCurrentlyReservedAndDate;
    public void checkOutBookItem(Book book){
        BookItem bookItem = book.returnAnAvailableBookItem();
        Calendar dateBookedOn = DateUtils.getTodayDate();
        bookItemsCurrentlyReservedAndDate.put(bookItem,dateBookedOn);

    }
    public void reserveBookItem(Book book){
        BookItem bookItem = book.returnAnAvailableBookItem();
        Calendar dateReservedOn = DateUtils.getTodayDate();
        bookItemsCurrentlyReservedAndDate.put(bookItem,dateReservedOn);

    }
    public Calendar returnBookItem(BookItem bookItem){
        Calendar dateOfCheckout = bookItemsCurrentlyCheckedOutAndDate.get(bookItem);
        bookItem.updateBookItemStatus(StatusBookItem.Available);
        bookItemsCurrentlyCheckedOutAndDate.remove(bookItem);
        return dateOfCheckout;
    }
}
