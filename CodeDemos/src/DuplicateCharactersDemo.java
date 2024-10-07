/*
To print duplicate characters in string
 I/P -> "aabbcddaeefaabghhhh"
O/P -> "abdeh"
*/

import java.util.LinkedHashMap;
import java.util.Map;

public class DuplicateCharactersDemo {

    public static void main(String[] args) {
        String str = "aabbcddaeefaabghhhh";
        Map<Character,Integer> map = new LinkedHashMap<>();
        //char[] = str.toCharArray();
        for(int i=0; i<str.length();i++)
        {
            char ch = str.charAt(i);
            if(!map.containsKey(ch)) {
                map.put(ch,1);
            }
            else {
                map.put(ch, map.getOrDefault(ch,1)+1);
            }

        }
        for(Map.Entry<Character,Integer> m:map.entrySet()) {
            if(m.getValue()>1) {
                System.out.print(m.getKey());
            }
        }
    }
}
