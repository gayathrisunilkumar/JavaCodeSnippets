package Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class OddEvenWithStreams {
    public static void main(String[] args) {
        int[] numbers = new int[]{1,2,3,4,5,6,7,8,9};

        //one way
        System.out.println("The even nos are: ");
        IntStream.of(numbers).filter(num ->num%2==0).forEach(System.out::println);
        System.out.println("The odd nos are: ");
        IntStream.of(numbers).filter(num ->num%2!=0).forEach(System.out::println);

        //another way
        List<Integer> nums = new ArrayList<>();
        for (int i : numbers) {
            nums.add(i);
        }

        Map<Boolean,List<Integer>> result = nums.stream().collect(Collectors.partitioningBy(n->n % 2==0));
        System.out.println("Odd numbers: "+result.get(Boolean.FALSE));
        System.out.println("Even numbers: "+result.get(Boolean.TRUE));

    }
}
