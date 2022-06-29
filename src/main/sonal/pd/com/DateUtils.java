package main.sonal.pd.com;

import java.util.Calendar;

public class DateUtils {
    public static Calendar getTodayDate(){
        Calendar todayDate = Calendar.getInstance();
        todayDate.set(Calendar.DAY_OF_MONTH,0);
        System.out.printf(String.valueOf(todayDate));
        return todayDate;
    }
    public static Calendar returnXDaysFromGivenDate(int x, Calendar givenDate){
        givenDate.add(Calendar.DAY_OF_MONTH, x);
        return givenDate;
    }
    public static void main(String args){
        DateUtils du=new DateUtils();
        du.getTodayDate();
    }
}

