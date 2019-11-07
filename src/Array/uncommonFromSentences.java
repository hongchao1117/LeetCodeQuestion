package Array;

import java.util.*;

public class uncommonFromSentences {
    public static void main(String[] args) {
        String A = "this apple is sweet";
        String B = "this apple is sour";

        Map<String,Integer> map = new HashMap<>();
        for(String word:A.split(" ")){
            map.put(word,map.getOrDefault(word,0)+1);
        }
        for(String word:B.split(" ")){
            map.put(word,map.getOrDefault(word,0)+1);
        }
        
        List list = new ArrayList();
        for (String word:map.keySet()){
            if (map.get(word)==1){
                list.add(word);
            }
        }
        System.out.println(list.toArray(new String[list.size()]));
    }
}
