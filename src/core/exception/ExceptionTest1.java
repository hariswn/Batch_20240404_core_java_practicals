package core.exception;

public class ExceptionTest1 {

    public static void main(String[] args) {
        try {
            int a = 10;
            int b = 0;
            int c = a / b;

            System.out.println(c);
        } catch (ArithmeticException e) {
            throw new RuntimeException("Error occurred while performing division operation, message : " + e.getMessage());
        }

    }
}
