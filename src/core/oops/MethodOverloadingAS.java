package core.oops;

public class MethodOverloadingAS {


    public void regirsterAccount(Integer accountNum, String accName) {
        System.out.println("registered account number, accountNumber : " );
    }

    public void regirsterAccount(String accName, Integer accountNum) {
        System.out.println("registered account number, accountNumber : " );
    }

    public void regirsterAccount(String accName, String accountNum) {
        System.out.println("registered account number, accountNumber : " );
    }

    public void regirsterAccount(String accName) {
        System.out.println("registered account number, accountNumber : " );
    }

    public static void main(String[] args) {
        MethodOverloadingAS as = new MethodOverloadingAS();
       // as.regirsterAccount(null, null);

    }
}
