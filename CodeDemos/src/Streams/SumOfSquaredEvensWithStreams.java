package Streams;

import java.util.Arrays;
import java.util.List;

public class SumOfSquaredEvensWithStreams {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        int sum = list.stream().filter(n->n%2==0).map(even ->even*even).reduce(0, Integer::sum);
        System.out.println("Original List :"+list);
        System.out.println("SumOfSquaredEvens :"+sum);

    }
}
