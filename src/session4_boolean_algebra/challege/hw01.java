package session4_boolean_algebra.challege;

// 1. Write a Java program where you create two String objects named stringOne and stringTwo with the same value "OpenAI". Check and print whether they refer to the same object.


public class hw01 {
    public static void main(String[] args) {
        String stringOne = "OpenAI";
        String stringTwo = "OpenAI";
        System.out.println(stringOne == stringTwo);
    }
}
