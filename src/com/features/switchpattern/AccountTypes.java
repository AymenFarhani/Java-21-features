package com.features.switchpattern;

public class AccountTypes {

    static class SavingsAccount extends Account {
        double getSavings() {
            return 100;
        }
    }
    static class TermAccount extends Account {
        double getTermAccount() {
            return 1000;
        }
    }
    static class CurrentAccount extends Account {
        double getCurrentAccount() {
            return 10000;
        }
    }

}
