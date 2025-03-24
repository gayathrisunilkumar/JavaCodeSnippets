package Streams;

import java.util.*;
import java.util.stream.Collectors;

public class LongestStringInList {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("banana", "apple", "orange","pineapple");
        Optional<String> longestString = list.stream()
                .max(Comparator.comparing(String::length));
        System.out.println(longestString.orElse("Invalid input"));
    }
}
