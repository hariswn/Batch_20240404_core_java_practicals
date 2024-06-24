package core.oops;

public class BankService {

    public static void main(String[] args) {

        AccountService as = new SavingsAccountService();

        AccountService cas = new CurrentAccountService();
    }
}
