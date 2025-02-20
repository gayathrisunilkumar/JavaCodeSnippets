//input: 2[a]3[b]1[c]
//output: aabbbc

//input: 4[b]2[a]3[c]
//output: bbbbaaccc

public class PrintCharacterOccurence {
    public static void main(String[] args) {
        String input = "4[b]2[a]3[c]";

        //remove special characters
        input = input.replace("[","").replace("]","");
        System.out.println("Input: "+input);

        char[] array = input.toCharArray();

        System.out.print("Output: ");
        for(int i=0; i<input.length(); i++) {
            if(i+1<array.length) {
                if(Character.isDigit(array[i])) {
                    int num = Integer.parseInt(String.valueOf(array[i]));
                    if(Character.isLetter(array[i+1])) {
                        for(int j=0;j<num;j++) {
                            System.out.print(array[i + 1]);
                        }
                    }
                }
            }
        }
    }
}
