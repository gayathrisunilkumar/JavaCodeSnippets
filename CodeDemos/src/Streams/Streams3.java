package Streams;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Streams3 {
    public static void main(String[] args) {
        String input = "programming";
        Map<Character, Long> duplicateCounts;

        duplicateCounts = input.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        //                .stream()
        //.filter(entry -> entry.getValue() > 1)
        //.count());
        duplicateCounts.forEach((key, value) -> System.out.print(key.toString() + value));

    }
}
