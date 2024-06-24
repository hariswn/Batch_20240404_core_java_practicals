package core.java8;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Java8Test2 {

    public static void main(String[] args) {
//        Function<String, Integer> findLength = (s) -> s.length();
//
//        System.out.println(findLength.apply("java"));

//        Consumer<String> displayUpperCase = (s) -> System.out.println(s.toUpperCase());
//
//        displayUpperCase.accept("java");

        Predicate<String> accountNameValidation = (s) -> s != null && s.length() >= 4;
        System.out.println(accountNameValidation.test("java"));
    }
}
