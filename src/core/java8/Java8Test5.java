package core.java8;

import java.util.List;
import java.util.stream.Collectors;

interface MyFunction<T, R> {
    R process(T t);
}

interface StudentProcess {
    String getStudentFromObject(Object obj);
}

public class Java8Test5 {

    public static void main(String[] args) {
        List<String> list = List.of("hyd", "bangalore", "chennai", "mumbai", "delhi");

//        list.stream().filter(s -> !s.equals("hyd")).map(s -> s.toUpperCase()).forEach(s -> {
//            System.out.println(s);
//        });

        List<String> result = list.stream()
                .filter(s -> !s.equals("hyd"))
                .map(s -> s.toUpperCase())
                .collect(Collectors.toList());

        System.out.println(result);
    }
}
