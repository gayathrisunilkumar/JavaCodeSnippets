package Streams;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class OccurenceOfEachElement {
    public static void main(String[] args) {
        String input = "programming";
        int[] intArr = {2,3,4,5,2,3};
        Map<Character, Long> duplicateCounts;
        Map<Character, Long> duplicateCountsDemo;
        Map<Long, Long> dupCountInts;

        duplicateCounts = input.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        dupCountInts = Arrays.stream(intArr)
                .mapToObj(c -> (long) c)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        dupCountInts.forEach((key, value) -> System.out.println(key + " -count- "+value));
        //                .stream()
        //.filter(entry -> entry.getValue() > 1)
        //.count());
        duplicateCounts.forEach((key, value) -> System.out.print(key.toString() + value));
    }
}
