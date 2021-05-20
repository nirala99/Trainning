package aopanno;

public interface Bank {

    public double getBalance(int account) throws BankException;

    public void transfer(int debitAccount, int creaditAccount, double amount);

    public boolean validateCard(long cardNumber);

    public void fixedDeposit(int account, double amount) throws BankException;
}
