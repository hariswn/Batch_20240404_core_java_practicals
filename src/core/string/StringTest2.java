package core.string;

public class StringTest2 {
    public static void main(String[] args) {
        String s = "java";
        System.out.println(s.length());
        System.out.println(s.charAt(3));
        System.out.println(s.substring(0, 3));

        System.out.println(s.toUpperCase());
        System.out.println(s.toLowerCase());

        System.out.println(s.concat(" world!!"));

        Object o;
    }
}
