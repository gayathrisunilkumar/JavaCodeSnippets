package Streams;

import java.util.stream.Collectors;

public class StringReverse {
    public static void main(String[] args) {
        String original = "Hello World";
        String reversedStream = new StringBuilder(original)
                .reverse()
                .chars()
                .mapToObj(c -> String.valueOf((char) c))
                .collect(Collectors.joining());
        System.out.println(reversedStream);
    }
}
