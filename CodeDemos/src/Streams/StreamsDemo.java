package Streams;// Input: "", "ksjdfgjbd", " " , "kajgdshk", "kk", "ljsdfhsgdfK", "kkkkkkkkkkkkk"
// for every string length of string > 10 if it is greater than 10 trin it to 10 else keep it as it is
// check first and the last character of your string if equals print/ collect it

import java.util.*;
import java.util.stream.Collectors;

public class StreamsDemo {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>(Arrays.asList("", "ksjdfgjbd", " " , "kajgdshk", "kk", "ljsdfhsgdfK", "kkkkkkkkkkkkk"));
        List<String> output = strings.stream()
                .map(str->str.trim().length()>10? str.substring (0,10) : str)
                .filter(strTrimmed -> !strTrimmed.trim().isEmpty() && strTrimmed.trim().charAt(0) == strTrimmed.trim().charAt(strTrimmed.length()-1))
                .collect(Collectors.toList());

        System.out.println(output);
    }
}
