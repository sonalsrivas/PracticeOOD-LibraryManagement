package main.sonal.pd.com;

import java.util.HashSet;

public class Library {
    private final double lateFee;
    private double fineVault;
    public final static int allowedDurationOfBookLoan = 10;
    private HashSet<AccountHolder> libraryAccountHoldersArrayList;
    public Library(double lateFee, int allowedDurationOfBookLoan) {
        this.lateFee = lateFee;
    }

    public void addAccountHolder(AccountHolder accountHolder){
        libraryAccountHoldersArrayList.add(accountHolder);
    }

    public void delAccountHolder(AccountHolder accountHolder){
        libraryAccountHoldersArrayList.remove(accountHolder);
    }

    public void addToFineVault(){
        fineVault+=lateFee;
    }

    public int getAllowedDurationOfBookLoan() {
        return allowedDurationOfBookLoan;
    }
}
