package com.features.switchpattern;

public class TestSwitchPattern {

    public static double getBalanceWithoutSwitchPattern(Account account) {
        double balance = 0;
        if(account instanceof AccountTypes.SavingsAccount savingsAccount) {
            balance = savingsAccount.getSavings();
        }
        else if(account instanceof AccountTypes.TermAccount termAccount) {
            balance = termAccount.getTermAccount();
        }
        else if(account instanceof AccountTypes.CurrentAccount currentAccount) {
            return currentAccount.getCurrentAccount();
        }
        return balance;
    }

    public static double getBalanceWithSwitchPattern(Account account) {
        double balance;
        switch (account) {
            case null -> throw new RuntimeException("Oops, account is null");
            case AccountTypes.SavingsAccount savingsAccount-> balance = savingsAccount.getSavings();
            case AccountTypes.TermAccount termAccount-> balance = termAccount.getTermAccount();
            case AccountTypes.CurrentAccount currentAccount-> balance = currentAccount.getCurrentAccount();
            default -> balance = account.getBalance();
        };
        return balance;
    }
}
