package core.java8;

@FunctionalInterface
interface AccountService {
    void display(int a, int b);
}

//class SavingsAccountService implements AccountService {
//
//    @Override
//    public void display(int a, int b) {
//        System.out.println(a + "---" + b);
//    }
//}

public class Java8Test1 {

    public static void main(String[] args) {
        AccountService as = (a, b) -> {
            System.out.println(a + "---" + b);
        };
        as.display(10, 20);
    }
}
