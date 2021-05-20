package aopxml;

public class OnlineBakImpl implements Bank {

    @Override
    public double getBalance(int account) throws BankException {
        if (account < 0) {
            throw new BankException("Invalid account " + account);
        }
        System.out.println("Getting balance for account " + account);
        return account * 200.0;
    }

    @Override
    public void transfer(int debitAccount, int creditAccount, double amount) {
        System.out.println("Manage Details for account " + debitAccount);
        System.out.println("Create Transaction recored for account " + debitAccount);
        System.out.println("Manage Details for account " + creditAccount);
        System.out.println("Create Transaction recored for account " + creditAccount);

    }

    @Override
    public boolean validateCard(long cardNumber) {
        System.out.println("validating card");
        return true;
    }

    @Override
    public void fixedDeposit(int account, double amount) throws BankException {
        System.out.println("Fixed deposit for account " + account);
        System.out.println("Create fixed deposit for amount " + amount);
        if (account < 0) {
            throw new BankException("Invalid account " + account);
        }
        if (amount < 0) {
            throw new BankException("Invalid account " + amount);
        }
    }
}
