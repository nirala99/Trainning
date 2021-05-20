package entities;

import java.util.HashSet;
import java.util.Set;

public class Account {

    int accountId = -1;
    String accountType = "";
    float balance = 0.0f;
    // Many To many
    Set<Person> owners = new HashSet<Person>();
    // One Account has Many Transaction
    // One to Many
    Set<Transaction> transactions = new HashSet<Transaction>();

    @Override
    public String toString() {
        return "Account[" + getAccountId() + ","
                + getAccountType() + "," + getBalance() + "]";
    }

    public Set<Transaction> getTransactions() {
        return transactions;
    }

    public void setTransactions(Set<Transaction> transactions) {
        this.transactions = transactions;
    }

    public Set<Person> getOwners() {
        return owners;
    }

    public void setOwners(Set<Person> owners) {
        this.owners = owners;
    }

    public int getAccountId() {
        return accountId;
    }

    public void setAccountId(int accountId) {
        this.accountId = accountId;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }
}
