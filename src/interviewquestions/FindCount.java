package interviewquestions;

import java.util.HashMap;
import java.util.Map;

public class FindCount {

    // Create a function to find count of letters from a given string.

    public static Map<Character,Integer> findCounts(String str){
        str = str.replace(" ","");
        Map<Character,Integer> counts = new HashMap<>();
        for (int i = 0; i <str.length() ; i++) {
            char letter = str.charAt(i);
            if(!counts.containsKey(letter)){
                counts.put(letter,1);
            }else if(counts.containsKey(letter)){
                int existingCount = counts.get(letter);
                counts.put(letter,existingCount+1);
            }

        }

        return counts;
    }

    public static void main(String[] args) {
        System.out.println(findCounts("Java is a coding language"));
    }

}
