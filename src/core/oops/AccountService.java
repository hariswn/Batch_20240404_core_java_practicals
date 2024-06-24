package core.oops;

public interface AccountService {

    void register(Account account);
    void deposite(double amount);
    double withdraw(double amount);
    Account getAccountDetails(int accountNum);
}
