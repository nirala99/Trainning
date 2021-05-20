package entities;

import java.util.HashSet;
import java.util.Set;

public class Person {

    private int personId;
    private String personName;
    private Set<Account> accounts = new HashSet<Account>();

    public Person() {
    }

    public int getPersonId() {
        return personId;
    }

    public void setPersonId(int personId) {
        this.personId = personId;
    }

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public Set<Account> getAccounts() {
        return accounts;
    }

    public void setAccounts(Set<Account> accounts) {
        this.accounts = accounts;
    }

    @Override
    public String toString() {
        return "P[" + getPersonId() + ":" + getPersonName() + "]";
    }
}
