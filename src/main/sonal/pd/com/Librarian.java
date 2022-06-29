package main.sonal.pd.com;

import java.util.Calendar;

public class Librarian extends AccountHolder{
    public void collectFineForLateReturn(Library library){
        library.addToFineVault();
    }
    public void receiveReturnedBookItem(BookItem bookItem, Calendar dateOfReturn, Library library){
        if (dateOfReturn.compareTo(DateUtils.returnXDaysFromGivenDate(Library.allowedDurationOfBookLoan, Calendar.getInstance()))>0){
            collectFineForLateReturn(library);
        }
        bookItem.updateBookItemStatus(StatusBookItem.Available);
    }

}