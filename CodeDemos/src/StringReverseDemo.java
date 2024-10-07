import java.util.stream.Collectors;

public class StringReverseDemo {
    public static void main(String[] args) {
        String original = "Hello World!";
        System.out.println("Original string: "+original);

        //one way
        String reversedString = new StringBuilder(original)
                .reverse()
                .chars()
                .mapToObj(c -> String.valueOf((char) c))
                .collect(Collectors.joining());
        System.out.println("Reversed string: "+reversedString);

        //second way
        String reversedStringtest = new StringBuilder(original)
                .reverse().toString();

        System.out.println("Reversed string: "+reversedStringtest);

        //loop way
        String word = "";
        char ch;
        for(int i=0;i<original.length();i++) {
            ch = original.charAt(i);
            word = ch + word;
        }
        System.out.println(word);

    }
}